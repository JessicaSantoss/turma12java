package org.generation.blogPessoal.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority {
	
	@Id
	private String nomeRole;
	
	// Relaciona com a table usuario 
	@ManyToMany(mappedBy = "roles")
	private List<Usuario> usuarios;

	//Segurança
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.nomeRole;

	}
	
	//Getters and Setters
	
	public String getNomeRole() {
		return nomeRole;
	}

	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	

	
	

}

