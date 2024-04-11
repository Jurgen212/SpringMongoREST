package com.sanclemente.apimongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value="Materias")
@Data
public class Materia {
	
	@Id
	private String 	id;
	private String 	docente;
	private String 	nombre;
	private Integer curso;
	private Integer duracion_horas;
	private Integer salon;
	private String[] dias;
}
