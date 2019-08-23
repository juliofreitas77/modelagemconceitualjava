/**
 * 
 */
package com.juliofreitas.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juliofreitas.cursomc.domain.Pedido;

/**
 * @author julio.freitas
 *
 *         Realizar operações de acesso a dados referente ao objeto categoria
 */
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {}
