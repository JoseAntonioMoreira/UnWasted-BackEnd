package io.codeforall.bootcamp.UnWasted.Controllers;

import io.codeforall.bootcamp.UnWasted.Models.Client;
import io.codeforall.bootcamp.UnWasted.Services.ClientService;
import io.codeforall.bootcamp.UnWasted.Services.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(clientService.getAllClients());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable int id) {
        Client client = clientService.getClientById(id);
        return (client != null) ? ResponseEntity.ok(client) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        clientService.createClient(client);
        return ResponseEntity.status(201).body(client);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable int id, @RequestBody Client updatedClient) {
        Client client = clientService.updateClient(id, updatedClient);
        return (client != null) ? ResponseEntity.ok(client) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable int id) {
        clientService.deleteClient(id);
        return ResponseEntity.noContent().build();
    }



}
