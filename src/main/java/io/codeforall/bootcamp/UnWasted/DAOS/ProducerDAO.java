package io.codeforall.bootcamp.UnWasted.DAOS;

import io.codeforall.bootcamp.UnWasted.Models.Producer;

import java.util.List;
import java.util.Optional;

public interface ProducerDAO {


    public void createProducer(Producer producer);

    public List<Producer> getAllProducers();

    public Producer getProducerById(int id);

    public Producer updateProducer(Producer producer);

    public void deleteProducer(int id);



}
