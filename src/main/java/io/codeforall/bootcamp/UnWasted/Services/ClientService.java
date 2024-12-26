package io.codeforall.bootcamp.UnWasted.Services;

import io.codeforall.bootcamp.UnWasted.Models.Client;

import java.util.List;

public interface ClientService {

    void createClient(Client client);

    List<Client> getAllClients();

    Client getClientById(int id);
    Client updateClient(int id, Client updatedClient);
    void deleteClient(int id);


}
