package io.codeforall.bootcamp.UnWasted.DAOS;

import io.codeforall.bootcamp.UnWasted.Models.Client;

import java.util.List;

public interface ClientDAO {
    void createClient(Client client);
    List<Client> getAllClients();
    Client getClientById(int id);
    Client updateClient(Client client);
    void deleteClient(int id);

}
