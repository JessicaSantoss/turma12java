package org.generation.blogPessoal.controler;

import org.generation.blogPessoal.Model.Usuario;
import org.generation.blogPessoal.Model.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@org.springframework.stereotype.Service
public class Service {

	//Injeta o repository
	@Autowired
	private usuarioRepository repository;

	//Encripta a senha do usuario		
	public Usuario CadastrarUsuario( Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);
		return repository.save(usuario);
	}
}