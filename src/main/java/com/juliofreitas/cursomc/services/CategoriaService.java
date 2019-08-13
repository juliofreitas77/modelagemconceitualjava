/**
 * 
 */
package com.juliofreitas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliofreitas.cursomc.domain.Categoria;
import com.juliofreitas.cursomc.repositories.CategoriaRepository;
import com.juliofreitas.cursomc.services.exceptions.ObjectNotFoundException;

/**
 * @author julio.freitas
 *
 */
@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! " + id + ", Tipo: " + Categoria.class.getName()));

	}

}
