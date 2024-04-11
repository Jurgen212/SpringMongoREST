package com.sanclemente.apimongo.service;

import com.sanclemente.apimongo.model.Materia;
import java.util.List;
import java.util.Optional;

public interface IMateriaService {

    void save(Materia materia);

    Materia updateById(Materia materia);

    Materia patch(String id, Materia materia);

    List<Materia> findAll();

    Optional<Materia> findById(String id);

    void deleteById(String id);
}
