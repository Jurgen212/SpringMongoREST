package com.sanclemente.apimongo.service;

import com.sanclemente.apimongo.model.Materia;
import org.springframework.stereotype.Service;

import com.sanclemente.apimongo.repository.MateriaRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MateriaService implements IMateriaService {

	private final MateriaRepository materiaRepository;

	public void save(Materia materia ){
		materiaRepository.save( materia );
	}

	public Materia updateById(Materia materia ){
		return materiaRepository.save( materia );
	}

	public Materia patch( String id, Materia materia ){

		Materia materiaOld = findById( id ).get();
		return materiaRepository.save( patchSwapValidation( materiaOld, materia ) );
	}

	public List<Materia> findAll(){
		return materiaRepository.findAll();
	}

	public Optional<Materia> findById(String id ){
		return materiaRepository.findById(id);
	}

	public void deleteById( String id ){
		materiaRepository.deleteById( id );
	}

	private Materia patchSwapValidation( Materia materiaOld, Materia materia ){

		if( materia.getNombre() != null ){
			materiaOld.setNombre(materia.getNombre());
		}

		if( materia.getDocente() != null ){
			materiaOld.setDocente( materia.getDocente() );
		}

		if( materia.getCurso() != null ){
			materiaOld.setCurso( materia.getCurso() );
		}

		if( materia.getDuracion_horas() != null ){
			materiaOld.setCurso( materia.getDuracion_horas() );
		}

		if( materia.getSalon() != null ){
			materiaOld.setSalon( materia.getSalon());
		}

		if( materia.getDias() != null ){
			materiaOld.setDias( materia.getDias() );
		}
		return materiaOld;
	}
}
