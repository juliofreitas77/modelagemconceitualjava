/**
 * 
 */
package com.juliofreitas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliofreitas.cursomc.domain.Categoria;
import com.juliofreitas.cursomc.repositories.CategoriaRepository;

/**
 * @author julio.freitas
 *
 */
@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
	}

}
