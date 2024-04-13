package com.sanclemente.apimongo.controller;

import com.sanclemente.apimongo.model.Materia;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IMateriaController {

    void save(Materia materia);

    List<Materia> findAll();

    Materia findById(String id);

    void deleteById(String id);

    Materia update(Materia materia);

    public HttpHeaders optionsMateria();
    Materia patch(String id, Materia materia);

    public ResponseEntity existById(String id );
}
