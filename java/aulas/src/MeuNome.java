import java.util.Scanner;

public class MeuNome {

		public static void main (String[] args) {
			
			//instanciando o teclado, criando
			
			Scanner leia = new Scanner(System.in);
			
			int anoNascimento = 1998;
			int idade = 0;
			String nome = "Jéssica Cristiane dos Santos Simões";
			String ende;
			double salario = 50567.90;
			
			System.out.print("Digite onde você mora: ");
			ende = leia.next(); 
			//next só le String
			//nextInt lê inteiro
			//nextDouble lê Double
			// nextLine lê a linha inteira e entra como texto e converte para texto
			// nome = leia.nextLine();
			
			
			
		
		System.out.println("Jéssica Cristine dos Santos Simões");	
		idade = 2020 - anoNascimento ;
		System.out.println("\nEu tenho "+idade+" anos");
		
		System.out.printf("\nO nome é %s, nascido em %d, minha idade é %d anos, meu salario %.2f e moro em %s", nome, anoNascimento, idade+2, salario, ende);
		
		
	}
}
