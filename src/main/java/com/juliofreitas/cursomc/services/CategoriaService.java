/**
 * 
 */
package com.juliofreitas.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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

	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new com.juliofreitas.cursomc.services.exceptions.DataIntegrityViolationException(
					"Não é possivel excluir uma categoria que possua produtos!");
		}
	}
	
	public List<Categoria> findAll(){
		return repo.findAll();
	}
}
