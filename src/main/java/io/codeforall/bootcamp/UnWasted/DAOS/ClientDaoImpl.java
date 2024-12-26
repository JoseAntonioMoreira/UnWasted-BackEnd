package io.codeforall.bootcamp.UnWasted.DAOS;

import io.codeforall.bootcamp.UnWasted.Models.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class ClientDaoImpl implements ClientDAO {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void createClient(Client client) {
        entityManager.persist(client);

    }

    @Override
    public List<Client> getAllClients() {
        CriteriaQuery<Client> query = entityManager.getCriteriaBuilder().createQuery(Client.class);
        query.from(Client.class);
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Client getClientById(int id) {
        return entityManager.find(Client.class, id);
    }

    @Override
    public Client updateClient(Client client) {
        entityManager.merge(client);
        return client;
    }

    @Override
    public void deleteClient(int id) {
        entityManager.remove(entityManager.find(Client.class, id));

    }
}
