package Lista2POO;

import java.util.Scanner;

public class teste1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Fornecedor fornecedor1 = new Fornecedor("João","123",100,98);
		
		System.out.println(fornecedor1.obterSaldo());
		
		Empregado empregado1 = new Empregado ("João","123",01,200);
		
		System.out.println(empregado1.calcularSalario());
		

	}

}
