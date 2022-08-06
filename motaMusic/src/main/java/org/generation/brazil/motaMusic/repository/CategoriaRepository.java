package org.generation.brazil.motaMusic.repository;

import java.util.List;

import org.generation.brazil.motaMusic.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
	
	public List <Categoria> findAllByFormatoContainingIgnoreCase(String formato);

}
