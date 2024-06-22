package com.parminder.demomongodb.repository;

import com.parminder.demomongodb.entity.Practitioner;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PractitionerRepository extends MongoRepository<Practitioner, String> {
    List<Practitioner> findByName(String name);
}