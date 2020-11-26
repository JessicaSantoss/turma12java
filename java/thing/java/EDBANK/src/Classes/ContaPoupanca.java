package Classes;

public class ContaPoupanca extends Conta {
	
	private int dataAniversario;

	public ContaPoupanca(int numero, int dataAniversario) 
	{
		super(numero);
		this.dataAniversario = dataAniversario;
	}

	public ContaPoupanca(int numero, String cpf_cnpj, int dataAniversario) 
	{
		super(numero, cpf_cnpj);
		this.dataAniversario = dataAniversario;
	}

	//encapsulamento
	public int getDataAniversario() 
	{
		return dataAniversario;
	}

	public void setDataAniversario(int dataAniversario) 
	{
		this.dataAniversario = dataAniversario;
	}
	
	//metodo
	
	public void correcao(int data) 
	{		double novoSaldo = 0.0;
			novoSaldo = (super.getSaldo()*0.005);
		
		if (super.getSaldo()>0 && data == this.dataAniversario) {
			
			super.creditar(novoSaldo);
		}
		
	}
}
