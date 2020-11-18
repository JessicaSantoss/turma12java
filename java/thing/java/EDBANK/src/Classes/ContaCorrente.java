package Classes;

public class ContaCorrente extends Conta {
	
	private int numeroTalao=1;

	public ContaCorrente(int numero) {
		super(numero);

	}

	public int getNumeroTalao() {
		return numeroTalao;
	}

	public void setNumeroTalao(int numeroTalao) {
		this.numeroTalao = numeroTalao;
	}
	
	public void emitirTalao() {
		
		this.numeroTalao=this.numeroTalao+1;
	}
	

}
