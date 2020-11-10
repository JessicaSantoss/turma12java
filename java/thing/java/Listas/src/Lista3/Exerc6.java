package Lista3;

public class Exerc6 {

	public static void main(String[] args) {
		int cont = 233;

		do {
			if (cont >= 400 && cont <= 500) {
				cont += 5;
			} else {
				cont += 3;
			}
			System.out.printf("%d\n", cont); 
		}
		while (cont < 456);


		}

	}


