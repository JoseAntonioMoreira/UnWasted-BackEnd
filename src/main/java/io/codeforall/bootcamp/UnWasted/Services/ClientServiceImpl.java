package io.codeforall.bootcamp.UnWasted.Services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.codeforall.bootcamp.UnWasted.DAOS.ClientDAO;
import io.codeforall.bootcamp.UnWasted.DAOS.ClientDaoImpl;
import io.codeforall.bootcamp.UnWasted.DAOS.ProducerDAO;

import io.codeforall.bootcamp.UnWasted.Models.Client;
import io.codeforall.bootcamp.UnWasted.Models.Producer;

import org.hibernate.annotations.SecondaryRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {

    private final ClientDAO clientDAO;



    @Autowired
    public ClientServiceImpl(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;

    }


    @Override
    public void createClient(Client client) {
        clientDAO.createClient(client);

    }

    @Override
    public List<Client> getAllClients() {
        return clientDAO.getAllClients();
    }

    @Override
    public Client getClientById(int id) {
        return clientDAO.getClientById(id);
    }

    @Override
    public Client updateClient(int id, Client updatedClient) {
        Client existingClient = clientDAO.getClientById(id);
        if (existingClient != null) {
            existingClient.setName(updatedClient.getName());

            existingClient.setAddress(updatedClient.getAddress());
            existingClient.setEmail(updatedClient.getEmail());
            existingClient.setPhone(updatedClient.getPhone());
            existingClient.setPassword(updatedClient.getPassword());

            return clientDAO.updateClient(existingClient);
        }
        return null;
    }

    @Override
    public void deleteClient(int id) {
    clientDAO.deleteClient(id);
    }
}
