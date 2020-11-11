package Lista4;
				import java.util.Random;
public class Exerc2 {

	public static void main(String[] args) {
					
				int lancamentos[] = new int [10];
				int x = 0;
				int soma = 0;
				int maior = 0;
				int contadorMaior=0;
				Random random = new Random();
				
				for (x = 0; x<9; x++);
				{
				lancamentos[x] = random.nextInt(9);
				System.out.printf("\nValor na posição ",x+1," : ",lancamentos[x]);
				soma = soma + lancamentos[x];
				if (lancamentos[x] >= maior)
					{
						if (lancamentos[x] != maior)
							{
								contadorMaior = 0;
							}
					maior = lancamentos[x];
					contadorMaior++;
						}	
				}
				
				System.out.printf("\nTotal de valores somados: "+soma);
				System.out.printf("\nMedia aritmetica: "+(soma/10));
				System.out.printf("\nMaior valor ", maior);
				System.out.printf("\nQuantas vezes aparece: ",contadorMaior);
			

	}

}
