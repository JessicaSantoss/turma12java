package Classes;

import java.util.Scanner;

public class CadConta {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		char tipoMovimento;
		double valor,movimento;
		int numeroConta, menuOpcao, diaHoje;
		String numCpf;
		 
			System.out.println("Digite o numero da conta: ");
			numeroConta = read.nextInt();
			System.out.println("Digite o n�mero do CPF: ");
			numCpf = read.next();
            
            System.out.print("==================================");   
            System.out.print("  Bem vindo ao banco G3!  ");
            System.out.print("==================================");
            //leitura menu principal
            System.out.print("\n1 - Conta Poupan�a.");
            System.out.print("\n2 - Conta Corrente.");
            System.out.print("\n3 - Conta Especial");
            System.out.print("\n4 - Conta Empresarial");
            System.out.print("\nSelecione o n�mero da op��o desejada: ");
            menuOpcao = read.nextInt();
		
		//Corrente
		if (menuOpcao == 1) 
		{
		
			int data;
			System.out.print("Digite o n�mero da conta poupan�a: ");
			numeroConta = read.nextInt();
			System.out.print("Digite o dia de anivers�rio mensal da conta: ");
			data = read.nextInt();
			
			ContaPoupanca cp1 = new ContaPoupanca(numeroConta, data);
			System.out.println();
			System.out.println("Numero da conta: "+numeroConta);
			
			for (int x =1;x<=5;x++) 
			{
				System.out.println("Saldo atual da conta: "+cp1.getSaldo());
				System.out.println("Movimento "+x);
				System.out.print("Debito ou Credito [D/C]: ");
				tipoMovimento = read.next().toUpperCase().charAt(0);
				
				if (tipoMovimento == 'D' && cp1.getSaldo()>0) 
				{
					
					
					System.out.println("Digite o valor do d�bito: ");
					movimento = read.nextDouble();
					while (movimento > cp1.getSaldo())
					{
						System.out.println("Valor acima do saldo, tente novamente: ");
						movimento = read.nextDouble();
					}
					cp1.debitar(movimento);
				}
				
				else if (tipoMovimento == 'C') 
				{
					
					System.out.print("Digite o valor do cr�dito: ");
					movimento = read.nextDouble();
					cp1.creditar(movimento);
					
				}
				else {
					System.out.print("Op��o Invalida");
				}
				}
			System.out.print("Saldo atual: "+cp1.getSaldo());
			System.out.print("Digite o dia de hoje (apenas o dia): ");
			diaHoje = read.nextInt();
			
			if (diaHoje==data) 
			{
				cp1.correcao(diaHoje);
				System.out.println("Novo saldo ap�s corre��o: "+cp1.getSaldo());
				
			}
		}
		
		if (menuOpcao == 4) {
			
			
			double valorDisponivel = 0;
			String cnpj;
			char opcao;
			System.out.print("Digite o n�mero da conta empresarial: ");
			numeroConta = read.nextInt();
			System.out.print("Digite o n�mero do CNPJ: ");
			cnpj = read.next();
			System.out.print("Digite o valor de emprestimo: ");
			valorDisponivel = read.nextDouble();
			ContaEmpresarial ce1 = new ContaEmpresarial(numeroConta,cnpj, valorDisponivel );
			
			System.out.println("Numero da conta: "+ce1.getNumero());
			System.out.println("Saldo da conta: "+ce1.getSaldo());
			
			
			for(int x=1;x<=5;x++) {
				
			int contador = 0;
			System.out.printf("\nMovimenta��o %d \n",contador++);
			
			System.out.print("Vc deseja C-creditar ou D-debitar um valor?: ");
			opcao = read.next().toUpperCase().charAt(0);
			if (opcao=='C') {
				System.out.print("Qual o valor de cr�dito: ");
				valor = read.nextDouble();
				ce1.creditar(valor);
			}
			else if (opcao =='D') {
				if (ce1.getSaldo()<=0) {
					System.out.println("Conta sem saldo");
				}
				else
				{
					
				System.out.print("Qual o valor para d�bito: ");
				valor = read.nextDouble();
				ce1.debitar(valor);
				System.out.println("Saldo da conta: "+ce1.getSaldo());
				}
				
			}
			
			
			System.out.println("Voc� tem R$"+valorDisponivel+" de emprestimo disponivel, deseja contratar? S/N ");
			opcao = read.next().toUpperCase().charAt(0);
			
			if (opcao == 'S') {
				
				System.out.print("Digite o valor do Emprestimo: ");
				double valorEmprestimo = read.nextDouble();
				//valorEmprestimo += cep.getSaldo();
				ce1.pedirEmprestimo(valorEmprestimo);
				
				
			}
			
			else { 
				System.out.println();
				System.out.println("Numero da conta: "+ce1.getNumero());
				System.out.println("Saldo da conta: "+ce1.getSaldo());
				System.out.print("Valor disponivel para emprestimo: "+ ce1.getEmprestimo());		
			
		}
			
			

		}
			System.out.println();
			System.out.println("Numero da conta: "+ce1.getNumero()+"                 CNPJ: "+ce1.getCpf_cnpj());
			System.out.println("Saldo da conta: "+ce1.getSaldo());
			System.out.print("Valor disponivel para emprestimo: "+ ce1.getEmprestimo());	
	}
}
}

