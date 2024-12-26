package io.codeforall.bootcamp.UnWasted.Services;

import io.codeforall.bootcamp.UnWasted.DAOS.ProducerDAO;
import io.codeforall.bootcamp.UnWasted.Models.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerServiceImpl implements ProducerService {

    private final ProducerDAO producerDAO;

    @Autowired
    public ProducerServiceImpl(ProducerDAO producerDAO) {
        this.producerDAO = producerDAO;
    }

    @Override
    public void createProducer(Producer producer) {
        producerDAO.createProducer(producer);
    }

    @Override
    public List<Producer> getAllProducers() {
        return producerDAO.getAllProducers();
    }

    @Override
    public Producer getProducerById(int id) {
        return producerDAO.getProducerById(id);
    }

    @Override
    public Producer updateProducer(int id, Producer updatedProducer) {
        Producer existingProducer = producerDAO.getProducerById(id);
        if (existingProducer != null) {
            existingProducer.setName(updatedProducer.getName());
            existingProducer.setLocation(updatedProducer.getLocation());
            existingProducer.setAddress(updatedProducer.getAddress());
            existingProducer.setEmail(updatedProducer.getEmail());
            existingProducer.setPhone(updatedProducer.getPhone());
            existingProducer.setPassword(updatedProducer.getPassword());
            existingProducer.setJsonData(updatedProducer.getJsonData());
            return producerDAO.updateProducer(existingProducer);
        }
        return null;
    }

    @Override
    public void deleteProducer(int id) {
        producerDAO.deleteProducer(id);
    }
}
