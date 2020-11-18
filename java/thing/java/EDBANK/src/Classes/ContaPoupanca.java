package Classes;

public class ContaPoupanca extends Conta {
	
	private int dataAniversario;

	public ContaPoupanca(int numero, int dataAniversario) {
		super(numero);
		this.dataAniversario = dataAniversario;
	}

	public ContaPoupanca(int numero, String cpf_cnpj, int dataAniversario) {
		super(numero, cpf_cnpj);
		this.dataAniversario = dataAniversario;
	}
	
	
}
