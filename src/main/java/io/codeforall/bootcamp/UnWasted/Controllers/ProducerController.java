package io.codeforall.bootcamp.UnWasted.Controllers;

import io.codeforall.bootcamp.UnWasted.Models.Producer;
import io.codeforall.bootcamp.UnWasted.Services.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producers")
public class ProducerController {

    private final ProducerService producerService;

    @Autowired
    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    // GET: Buscar todos os produtores
    @GetMapping
    public ResponseEntity<List<Producer>> getAllProducers() {
        return ResponseEntity.ok(producerService.getAllProducers());
    }

    // GET: Buscar um produtor por ID
    @GetMapping("/{id}")
    public ResponseEntity<Producer> getProducerById(@PathVariable int id) {
        Producer producer = producerService.getProducerById(id);
        return (producer != null) ? ResponseEntity.ok(producer) : ResponseEntity.notFound().build();
    }

    // POST: Criar um novo produtor
    @PostMapping
    public ResponseEntity<Producer> createProducer(@RequestBody Producer producer) {
        producerService.createProducer(producer);
        return ResponseEntity.status(201).body(producer);
    }

    // PUT: Atualizar um produtor existente
    @PutMapping("/{id}")
    public ResponseEntity<Producer> updateProducer(@PathVariable int id, @RequestBody Producer updatedProducer) {
        Producer producer = producerService.updateProducer(id, updatedProducer);
        return (producer != null) ? ResponseEntity.ok(producer) : ResponseEntity.notFound().build();
    }

    // DELETE: Deletar um produtor por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducer(@PathVariable int id) {
        producerService.deleteProducer(id);
        return ResponseEntity.noContent().build();
    }
}


