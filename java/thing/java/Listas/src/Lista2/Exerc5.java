package Lista2;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double indice;
		
		System.out.print("Digite o �ndice: ");
		indice = leia.nextDouble();
		
		if(indice>=0.5) 
		{
		System.out.printf("\nO �ndice est� alto, notifique o 1�, 2� e 3� grupo para que suspendam as atividades!");
		}
		else if (indice>=0.4)
		{
			System.out.printf("\nNotifique 1� e 2� grupo para que suspendam as atividades!");
		}
		else if (indice>=0.3)
		{
			System.out.printf("\nNotifique 1� grupo para que suspendam as atividades!");
		}
		else if (indice>=0.05 && indice<=0.25)
		{
			System.out.printf("\nPolui��o aceitavel!");
		}

	}

}
