package Lista2;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double A, B, C, D, QA, QB, QC, QD;
		
		System.out.print("Digite o primeiro valor: ");
		A = leia.nextDouble();
		System.out.print("Digite o segundo valor: ");
		B = leia.nextDouble();
		System.out.print("Digite o terceiro valor: ");
		C = leia.nextDouble();
		System.out.print("Digite o quarto valor: ");
		D = leia.nextDouble();
		
		QA = A*A;
		QB = B*B;
		QC = C*C;
		QD = D*D;
		
		if(QC>= 1000) 
			{
			System.out.printf("Valor do quadrado do terceiro número é %.2f",QC);
			System.out.print("Programa finalizado!");
		}
		
		else
		{		
			System.out.printf("\nValor do quadrado do primeiro número é %.2f",QA);
			System.out.printf("\nValor do quadrado do segundo número é %.2f",QB);
			System.out.printf("\nValor do quadrado do terceiro número é %.2f",QC);
			System.out.printf("\nValor do quadrado do quarto número é %.2f",QD);
		}
		

		

	}

}
