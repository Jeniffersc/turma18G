package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository; //JPA é uma interface que ja possui alguns métodos de pesquisa (Exemplo ID)
import org.springframework.stereotype.Repository;

@Repository

/*
 * É possével criar novos métodos de pesquisa
 */

public interface PostagemRepository extends JpaRepository<Postagem, Long> 
{	
	/*
	 * Método que pesquisa o título da postagem
	 */
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo); 
}
