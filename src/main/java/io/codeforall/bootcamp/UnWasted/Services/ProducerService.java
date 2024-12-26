package io.codeforall.bootcamp.UnWasted.Services;

import io.codeforall.bootcamp.UnWasted.Models.Producer;

import java.util.List;

public interface ProducerService {

    void createProducer(Producer producer);

    List<Producer> getAllProducers();

    Producer getProducerById(int id);

    Producer updateProducer(int id, Producer updatedProducer);

    void deleteProducer(int id);
}
