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
			System.out.printf("Valor do quadrado do terceiro n�mero � %.2f",QC);
			System.out.print("Programa finalizado!");
		}
		
		else
		{		
			System.out.printf("\nValor do quadrado do primeiro n�mero � %.2f",QA);
			System.out.printf("\nValor do quadrado do segundo n�mero � %.2f",QB);
			System.out.printf("\nValor do quadrado do terceiro n�mero � %.2f",QC);
			System.out.printf("\nValor do quadrado do quarto n�mero � %.2f",QD);
		}
		

		

	}

}
