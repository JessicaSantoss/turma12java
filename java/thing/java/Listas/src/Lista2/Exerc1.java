package Lista2;

import java.util.Scanner;

public class Exerc1 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double P, EX, M;
		
		System.out.println("Digite o peso do tomate: ");	
		P = leia.nextDouble();
		
		if (P>50) {
			
			System.out.println("O peso do tomate est� acima do permitido!");
			EX = P - 50;
	        M = (P-50)*4;
	        
	        System.out.printf("Valor do excedente � de %.2f e o valor da multa � R$%.2f",EX,M);	
		}
		
		else
		{
			System.out.printf("O peso do tomate est� dentro do permitido, nenhuma multa ser� aplicada.");
		}

}
}
