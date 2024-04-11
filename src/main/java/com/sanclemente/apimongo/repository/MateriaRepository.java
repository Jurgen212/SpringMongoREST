package com.sanclemente.apimongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sanclemente.apimongo.model.Materia;

@Repository
public interface MateriaRepository extends MongoRepository<Materia, String>{

}
