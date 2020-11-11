package Lista4;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int maior=0;
		int numero[] = new int [5];

				for (int x= 0; x<5; x++)
				{
					System.out.printf("Digite o "+(x+1)+"º valor: ");
					numero[x] = leia.nextInt();
						
						if (numero[x] > maior) {
							maior = numero[x];

					}
					
				}

				System.out.printf("\nO maior número é: "+maior);


	}

}
