package Lista2;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int N;
		
		System.out.println("Digite um n�mero: ");	
		N = leia.nextInt();
		
		if(N>100) 
		{
			System.out.printf("O n�mero %d � maior que 100! ",N);
		}
	
	else
	{		
		System.out.printf("O n�mero %d � menor que 100, logo receber� valor 0.",N);
	}
	}

}
