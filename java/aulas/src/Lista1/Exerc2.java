package Lista1;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	int idadeDias, ano, mes, dias;
	
	System.out.print("Digite sua dias: ");
	idadeDias = leia.nextInt();
	
	ano = idadeDias / 365;
	mes = (idadeDias % 365)/30;
	dias = ((idadeDias % 365)%30);
	
	System.out.printf("\nSua idade em anos é de %d, sua idade em meses é de %d e sua idade em dias é de %d", ano, mes,dias);
	
	
	
}
}
