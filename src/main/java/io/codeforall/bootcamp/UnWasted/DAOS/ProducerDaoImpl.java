package io.codeforall.bootcamp.UnWasted.DAOS;

import io.codeforall.bootcamp.UnWasted.Models.Producer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class ProducerDaoImpl implements ProducerDAO {


    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void createProducer(Producer producer) {
        entityManager.persist(producer);
    }

    @Override
    public List<Producer> getAllProducers() {
        
        CriteriaQuery<Producer> query = entityManager.getCriteriaBuilder().createQuery(Producer.class);
        query.from(Producer.class);
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Producer getProducerById(int id) {
        return entityManager.find(Producer.class, id);
    }

    @Override
    public Producer updateProducer(Producer producer) {

        entityManager.merge(producer);
        return producer;

    }

    @Override
    public void deleteProducer(int id) {
        entityManager.remove(entityManager.find(Producer.class, id));

    }
}
