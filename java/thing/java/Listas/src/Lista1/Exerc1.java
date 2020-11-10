package Lista1;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
				
		int idadeDias, ano, mes, dias, diasAno, diasMes;
		diasAno = 365;
		diasMes = 30;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite sua idade em anos: ");
		ano = leia.nextInt();
		System.out.print("Digite sua idade em meses: ");
		mes = leia.nextInt();
		System.out.print("Digite sua idade em dias: ");
		dias = leia.nextInt();
		
		idadeDias = ((ano * diasAno) + (mes * diasMes) + dias);
		
		System.out.printf("Sua idade em dias é %d.",idadeDias);

	}

}
