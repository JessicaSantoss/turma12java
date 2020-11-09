package Lista2;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int N;
		
		System.out.println("Digite um número: ");	
		N = leia.nextInt();
		
		if(N>100) 
		{
			System.out.printf("O número %d é maior que 100! ",N);
		}
	
	else
	{		
		System.out.printf("O número %d é menor que 100, logo receberá valor 0.",N);
	}
	}

}
