package aula1811;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadFunc {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero;
		List<Funcionario> cadastro = new ArrayList<>();
		
		System.out.println("Digite o numero de funcionarios para cadastro: ");
		numero = read.nextInt();
		
		for (int x=1; x<=numero;x++) 
		{	 
			System.out.println("Empregado "+x);
			System.out.println("Terceiro S/N: ");
			char resposta = read.next().toUpperCase().charAt(0);
			
			System.out.println("Digite o código do funcionário: ");
			String codigo = read.next();
			System.out.println("Digite as horas: ");
			double horas = read.nextDouble();
			System.out.println("Digite o valor hora: ");
			double valorHora = read.nextDouble();
			
			if (resposta=='S') 
			{ 
				System.out.println("Digite o valor adicional deste terceiro: ");
				double adicional = read.nextDouble();
				cadastro.add(new Terceiro(codigo, horas, valorHora, adicional));
				
			}
			else {
				cadastro.add(new Funcionario(codigo, horas, valorHora));
			}
		}
	}

}
