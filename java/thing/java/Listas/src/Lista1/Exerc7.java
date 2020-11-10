package Lista1;

import java.util.Scanner;

public class Exerc7 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double a, b, c, d, ex, f, x, y;
		
		System.out.print("Digite o valor de A: ");
		a = leia.nextDouble();
		System.out.print("Digite o valor de B: ");
		b = leia.nextDouble();
		System.out.print("Digite o valor de C: ");
		c = leia.nextDouble();
		System.out.print("Digite o valor de D: ");
		d = leia.nextDouble();
		System.out.print("Digite o valor de E: ");
		ex = leia.nextDouble();
		System.out.print("Digite o valor de F: ");
		f = leia.nextDouble();
		
		x = ((c*ex) - (b*f)) / ((a*ex) - (b*d));
		y = ((a*f) - (c*d)) / ((a*ex) - (b*d));
		
		System.out.printf("O valor de X é %f e o valor de Y é %f.",x,y);
		
		
		
		
		
	}
}
