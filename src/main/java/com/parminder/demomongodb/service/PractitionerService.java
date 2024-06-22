package com.parminder.demomongodb.service;

import com.parminder.demomongodb.entity.Practitioner;
import com.parminder.demomongodb.repository.PractitionerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PractitionerService {

    @Autowired
    private PractitionerRepository repository;

    public void savePractitioner(Practitioner practitioner) {
        repository.save(practitioner);
    }
/*
    public Practitioner getUser(String name) {
        return repository.findByName(name).orElse(null);
    }
    */
    public List<Practitioner> getAllPractitioners(){
        return repository.findAll();
    }
    public void deletePractitioner(String id) {
        repository.deleteById(id);
    }
}