package Lista3;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int salario, mediaSalarios=0, maiorSalario=0, totalSalario=0,mediaFilhos=0,percentual=0;
		int filhos=0, totalFilhos=0, x=0, QUANTIDADE = 0, menor100 = 0;
		
		System.out.printf("Digite a quantidade de entrevistados: ");
		QUANTIDADE = leia.nextInt();
		
		for(x =1 ; x <=QUANTIDADE; x++);
		 {
			System.out.printf("Digite o salario do entrevistado: ");
		 	salario = leia.nextInt();
		 	
		 	if (salario <100)
		 	{
		 		menor100 = menor100+1;
		 		percentual = (menor100*100) / QUANTIDADE;
		 		
		 	}
		 	
		 	totalSalario = totalSalario + salario;
		 	System.out.printf("Digite o numero de filhos:");
		 	filhos = leia.nextInt();

		 	while (filhos < 0)
		 	{
		 		System.out.printf("Filhos não podem ser negativos - tente de novo: ");
		 		filhos = leia.nextInt();
		 	}
		 	
		 	totalFilhos = totalFilhos+filhos;
		 	
			if (maiorSalario < salario)
			{
				 	maiorSalario = salario;
				 	 
			}
		 }
		 
		 System.out.printf("QUANTIDADE DE ENTREVISTADOS: ",QUANTIDADE);
		 mediaSalarios= totalSalario / QUANTIDADE;
		 mediaFilhos = totalFilhos / QUANTIDADE;
		 System.out.printf("\nMedia de salarios: %d",mediaSalarios);
		 System.out.printf("\nTotal de filhos :%d",totalFilhos);
		 System.out.printf("\nMedia de filhos :%d",mediaFilhos);
		 System.out.printf("\nMaior Salario: %d",maiorSalario);
		 System.out.printf("\nPessoas que recebem menos que 100: %d",menor100,"\nRepresentando %d das pessoas.",percentual);

	}

}

