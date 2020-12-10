package seguranca;

import org.generation.blogPessoal.Model.Tema;
import org.generation.blogPessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerGeral {
	
	//Injeta o repository
	@Autowired
	private TemaRepository repository;
	
	//responsavel por direcionar o usuario para index
	@GetMapping(value= "/")
	public String login() {
		return "index";
	}
	
	//responsavel por direcionar o usuario para a página formTema
	@GetMapping(value="/cadastrarTema")
	public String form(){
		return "formTema";
	}	
	
	//Cadastra o tema na table tema e depois direciona o usuario para um novo cadastro de tema
	@PostMapping(value="/cadastrarTema")
	public String form(Tema tema){			
		repository.save(tema);
		return "redirect:/cadastrarTema";
	}

}
