package Lista2;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		int C, N, HE, S, EX;
		
		System.out.println("Digite o c�digo de funcion�rio: ");	
		C = leia.nextInt();
		System.out.println("Digite o n�mero de horas trabalhadas: ");	
		N = leia.nextInt();
		
			if (N>50) {
				
				HE=N-50;
				EX=HE*20;
				S=50*10;

			
				System.out.printf("\nSal�rio total: %d",S);
				System.out.printf("\nSal�rio excedente: %d",EX);
	        
			}
		
			else
		{		
				S=N*10;
				System.out.printf("\nSal�rio total: %d",S,". \nVoc� n�o possui horas excedentes!");
		}
		

	}

}
