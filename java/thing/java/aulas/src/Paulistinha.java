import java.util.Scanner;
public class Paulistinha {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String times[]={"CORINTHIANS","PALMEIRAS","SANTOS","SPFC"};
		String nomeTime;
		int pontuacao[][] = new int[4][4];
		int pontuacaoTotal[] = new int[4];
		
		char result, decisao;
		int lin=0,col=0, pt=0, rodada=1;
		
		 System.out.printf("Paulistinha!!!\n\n");
		
		 do
			{
				
				{
					
				
					for(lin=0;lin<4;lin++)
					{
					System.out.printf("Rodada %d",rodada++);
					
					for(col=0; col<4; col++)
					{
						System.out.printf("\n%s",times[col]);
						System.out.printf("\nG-Ganhou, P-Perdeu ou E-Empatou: ");
						result = leia.next().toUpperCase().charAt(0);
						
						/*while((result != 'G') && (result != 'P') && (result != 'E' ));
						{
							System.out.printf("Infome uma opção válida");
							System.out.printf("\nG-Ganhou, P-Perdeu ou E-Empatou: ");
							result = leia.next().toUpperCase().charAt(0);
						}
						*/
						if (result == 'G')
						{
							pt=3;
						
						}
						else if (result =='E')
						{
							pt=1;
							
						}
						else
						{
							pt=0;
			
						}
						
						pontuacao[lin][col] = pt + pontuacao[lin][col];	
						
						pontuacaoTotal[col] = pt + pontuacaoTotal[col];
						
					}
					}
				}
			}while(lin<4);
		
		 rodada=1;
		 for(lin=0; lin<4; lin++)
			{
			
			 System.out.printf("\nRODADA %d",rodada++);
			 for(col=0; col<4; col++)
				{
				 	System.out.printf("\n%s %s",times[col],pontuacao[lin][col]);
				}
			 	System.out.printf("\n");
			}
		
		 System.out.printf("\nPONTUACAO FINAL");
		 for(lin=0; lin<4; lin++)
		 {
			 System.out.printf("\n%s %s",times[lin],pontuacaoTotal[lin]);
		 }
	}
}