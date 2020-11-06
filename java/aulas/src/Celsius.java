import java.util.Scanner;

public class Celsius {
	
			public static void main (String[] args) {
				
				Scanner leia = new Scanner(System.in);
				double temp, fahr;
				
				System.out.print("Digite a temperatura: ");
				temp = leia.nextDouble();
				
				fahr = ((temp * 9)/5) + 32;
				
				System.out.printf("A temperatura em Fahrenheit é %.2f.",fahr);
				
	}
}
