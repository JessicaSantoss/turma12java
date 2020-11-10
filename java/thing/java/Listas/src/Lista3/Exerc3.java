package Lista3;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		 int x, numero=0, conta=0;
		 double soma = 0;
		 
		 while (numero >= 0)
		 {
			 System.out.printf("Informe um número: ");
			 numero = leia.nextInt();
		 if (numero > 0)
		 {
			 soma=soma+numero;
			 conta = conta + 1;
		}
		 }
		 System.out.printf("A soma eh %3.0f e a media eh %5.2f\n",soma, (soma/conta));
	}

}
