package Lista2;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a idade do nadador: ");
		idade = leia.nextInt(); 
		
		if(idade >=5 && idade <=7) 
		{
		System.out.printf("\nO atleta está na categoria infantil A!");
		}
		
		else if (idade >=8 && idade <=11)
		{
			System.out.printf("\nO atleta está na categoria infantil B!");
		}
		else if (idade >=12 && idade <=13)
		{
			System.out.printf("\nO atleta está na categoria juvenil A!");
		}
		else if (idade >=14 && idade <=17)
		{
			System.out.printf("\nO atleta está na categoria juvenil B!");
		}
		else if (idade >=18)
		{
			System.out.printf("\nO atleta está na categoria de adultos!");
		}
		
		else {
			System.out.printf("\nEste atleta não pode nadar!");
			
		}
		

	}

}
