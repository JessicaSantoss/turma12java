import java.util.Scanner;

public class MeuNome {

		public static void main (String[] args) {
			
			//instanciando o teclado, criando
			
			Scanner leia = new Scanner(System.in);
			
			int anoNascimento = 1998;
			int idade = 0;
			String nome = "J�ssica Cristiane dos Santos Sim�es";
			String ende;
			double salario = 50567.90;
			
			System.out.print("Digite onde voc� mora: ");
			ende = leia.next(); 
			//next s� le String
			//nextInt l� inteiro
			//nextDouble l� Double
			// nextLine l� a linha inteira e entra como texto e converte para texto
			// nome = leia.nextLine();
			
			
			
		
		System.out.println("J�ssica Cristine dos Santos Sim�es");	
		idade = 2020 - anoNascimento ;
		System.out.println("\nEu tenho "+idade+" anos");
		
		System.out.printf("\nO nome � %s, nascido em %d, minha idade � %d anos, meu salario %.2f e moro em %s", nome, anoNascimento, idade+2, salario, ende);
		
		
	}
}
