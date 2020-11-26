package Classes;

public class Cliente {
	
	private String nomeCliente;
	private char genero;
	private String cpf;
	
	
	public Cliente(String nomeCliente, char genero, String cpf) {
		super();
		this.nomeCliente = nomeCliente;
		this.genero = genero;
		this.cpf=cpf;
	}

	public Cliente(String nomeCliente) {
		super();
		this.nomeCliente = nomeCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
