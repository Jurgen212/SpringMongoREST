package com.sanclemente.apimongo.controller;

import com.sanclemente.apimongo.model.Materia;
import java.util.List;

public interface IMateriaController {

    void save(Materia materia);

    List<Materia> findAll();

    Materia findById(String id);

    void deleteById(String id);

    Materia update(Materia materia);

    Materia patch(String id, Materia materia);
}
