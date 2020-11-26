package Classes;

public class ContaCorrente extends Conta {
	
	private int numeroTalao=0;

	public ContaCorrente(int numero) {
		super(numero);

	}
	public ContaCorrente(int numero, String cpf_cnpj) {
		super(numero,cpf_cnpj);

	}

	public int getNumeroTalao() {
		return numeroTalao;
	}

	public void setNumeroTalao(int numeroTalao) {
		this.numeroTalao = numeroTalao;
	}
	
	public void emitirTalao(int numeroDeTaloes) {
		
		this.numeroTalao += numeroDeTaloes;
	}
	

}
