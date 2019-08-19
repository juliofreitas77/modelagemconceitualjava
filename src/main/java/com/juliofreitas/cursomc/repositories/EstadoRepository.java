/**
 * 
 */
package com.juliofreitas.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juliofreitas.cursomc.domain.Estado;

/**
 * @author julio.freitas
 *
 *         Realizar operações de acesso a dados referente ao objeto Estado
 */
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {}
