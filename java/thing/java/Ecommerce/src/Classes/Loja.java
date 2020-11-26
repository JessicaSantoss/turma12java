package Classes;

public class Loja {
	
	private String nomeLoja;
	private String cnpj;
	private String enderecoLoja;
	private String telefone;
	
	public Loja(String nomeLoja) {
		super();
		this.nomeLoja = nomeLoja;
	}

	public Loja(String nomeLoja, String cnpj, String enderecoLoja, String telefone) {
		super();
		this.nomeLoja = nomeLoja;
		this.cnpj = cnpj;
		this.enderecoLoja = enderecoLoja;
		this.telefone=telefone;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEnderecoLoja() {
		return enderecoLoja;
	}

	public void setEnderecoLoja(String enderecoLoja) {
		this.enderecoLoja = enderecoLoja;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
