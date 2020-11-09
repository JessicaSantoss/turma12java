package Lista2;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double indice;
		
		System.out.print("Digite o índice: ");
		indice = leia.nextDouble();
		
		if(indice>=0.5) 
		{
		System.out.printf("\nO índice está alto, notifique o 1º, 2º e 3º grupo para que suspendam as atividades!");
		}
		else if (indice>=0.4)
		{
			System.out.printf("\nNotifique 1º e 2º grupo para que suspendam as atividades!");
		}
		else if (indice>=0.3)
		{
			System.out.printf("\nNotifique 1º grupo para que suspendam as atividades!");
		}
		else if (indice>=0.05 && indice<=0.25)
		{
			System.out.printf("\nPoluição aceitavel!");
		}

	}

}
