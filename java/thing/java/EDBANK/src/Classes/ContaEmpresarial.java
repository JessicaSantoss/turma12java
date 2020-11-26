package Classes;

public class ContaEmpresarial extends Conta {
	
	private double emprestimo;
	
	

	public ContaEmpresarial(int numero, String cpf_cnpj,double emprestimo) 
	{
		super(numero, cpf_cnpj);
	}

	public double getEmprestimo() 
	{
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) 
	{
		this.emprestimo = emprestimo;
	}
	
	public void pedirEmprestimo (double valorEmprestimo) 
	{
		if (valorEmprestimo <= this.emprestimo) {
			super.creditar(valorEmprestimo);
			this.emprestimo -= valorEmprestimo;
		}
	}
	
	
}
