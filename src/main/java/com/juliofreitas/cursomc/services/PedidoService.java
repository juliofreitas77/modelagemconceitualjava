/**
 * 
 */
package com.juliofreitas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliofreitas.cursomc.domain.Pedido;
import com.juliofreitas.cursomc.repositories.PedidoRepository;
import com.juliofreitas.cursomc.services.exceptions.ObjectNotFoundException;

/**
 * @author julio.freitas
 *
 */
@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! " + id + ", Tipo: " + Pedido.class.getName()));

	}

}
