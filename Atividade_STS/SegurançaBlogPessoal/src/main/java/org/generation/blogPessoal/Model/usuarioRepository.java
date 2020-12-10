package org.generation.blogPessoal.Model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<Usuario, String> {
	
	//Metodo para encontrar o login do usuario
	Usuario findByLogin (String login);

}
