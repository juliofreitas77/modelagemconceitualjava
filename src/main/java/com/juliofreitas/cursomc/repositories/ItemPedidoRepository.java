/**
 * 
 */
package com.juliofreitas.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juliofreitas.cursomc.domain.ItemPedido;

/**
 * @author julio.freitas
 *
 *         Realizar operações de acesso a dados referente ao objeto categoria
 */
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {}
