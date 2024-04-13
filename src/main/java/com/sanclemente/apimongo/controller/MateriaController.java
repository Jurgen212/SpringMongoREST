package com.sanclemente.apimongo.controller;


import com.sanclemente.apimongo.model.Materia;
import com.sanclemente.apimongo.service.MateriaService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpHeaders;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MateriaController implements IMateriaController{

    private final MateriaService materiaService;

    //CREATE - POST
    @PostMapping("/materia")
    public void save(@RequestBody Materia materia ){
        materiaService.save( materia );
    }

    //READ ALL - GET
    @GetMapping("/materia")
    public List<Materia> findAll(){
        return materiaService.findAll();
    }

    //READ BY ID - GET
    @GetMapping("/materia/{id}")
    public Materia findById(@PathVariable String id){
        return materiaService.findById( id ).get();
    }

    //DELETE
    @DeleteMapping("/materia/{id}")
    public void deleteById( @PathVariable String id){
        materiaService.deleteById(id);
    }

    //UPDATE - PUT
    @PutMapping("/materia")
    public Materia update(@RequestBody Materia materia ){
        return materiaService.updateById( materia );
    }

    //PATCH
    @PatchMapping("/materia/{id}")
    public Materia patch( @PathVariable String id, @RequestBody Materia materia ){
        return materiaService.patch( id, materia  );
    }

    //Options
    @RequestMapping(path = "/optionsMateria")
    public HttpHeaders  optionsMateria() {
        return materiaService.optionsMateria();
    }

    //Head
    @RequestMapping( path = "/head/{id}", method = RequestMethod.HEAD )
    public ResponseEntity existById(@PathVariable String id ){
        return materiaService.existById(id) ? new ResponseEntity( HttpStatus.OK ) : new ResponseEntity( HttpStatus.NOT_FOUND );

    }
}
