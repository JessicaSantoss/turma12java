package Lista1;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double valorFabrica, distribuidor, impostos, valorDistribuidor, valorImpostos, consumidor;
		distribuidor = 28;
		impostos = 45;
		
		System.out.print("Digite o custo de fábrica: ");
		valorFabrica = leia.nextDouble();
		
		valorDistribuidor = valorFabrica + (valorFabrica * distribuidor / 100);
		valorImpostos = valorFabrica + (valorFabrica * impostos / 100);
		consumidor = valorFabrica + valorDistribuidor + valorImpostos;
		
		System.out.printf("O custo final do consumidor é de %.3f.",consumidor);

	}

}
