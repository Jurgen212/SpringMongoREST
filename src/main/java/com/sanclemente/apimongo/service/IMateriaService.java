package com.sanclemente.apimongo.service;

import com.sanclemente.apimongo.model.Materia;
import org.springframework.http.HttpHeaders;

import java.util.List;
import java.util.Optional;

public interface IMateriaService {

    public void save(Materia materia);

    public Materia updateById(Materia materia);

    public Materia patch(String id, Materia materia);

    public List<Materia> findAll();

    public Optional<Materia> findById(String id);

    public boolean existById( String id );

    public HttpHeaders optionsMateria();
    public void deleteById(String id);
}
