import java.util.Scanner;

public class PaulistaEd {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String times[] = {"CORINTHIANS", "PALMEIRAS", "SANTOS", "SPFC"};
		int pontos[][] = new int[4][4];
		int linha=0, coluna=0;
		int x=0;
		char opcao;
		int pontuacaoTotal[] = new int[4];
		int pontuacao[][] = new int[4][4];
		int lin=0,col=0, pt=0, rodada=1;
		
		System.out.println("NOME DO TIME");
		System.out.println("------------");
		for (x=0; x<4; x++)
		{
			System.out.println(times[x]);
		}
		
		for(coluna=0; coluna<4; coluna++) //tratar a coluna da matriz
		{
			
			System.out.println("RODADA "+(coluna+1));
			
			for (linha=0; linha<4; linha++)  //trantando a linha
			{
				System.out.print(times[linha]);
				System.out.print(" G-ganhou, E-empatou ou P-perdeu: ");
				opcao = leia.next().toUpperCase().charAt(0);
				if (opcao=='G') {
					pontos[linha][coluna]=3;
				} else if (opcao=='E') {
					pontos[linha][coluna]=1;
				} else if (opcao=='P') {
					pontos[linha][coluna]=0;
				} else {
					System.out.println("VC N�O ESCOLHEU DIREITO, PERDEU");
					pontos[linha][coluna]=0;
				}
				
				pontuacao[linha][coluna] = pontos[linha][coluna] + pontuacao[linha][coluna];	
				
				pontuacaoTotal[coluna] = pontos[linha][coluna] + pontuacaoTotal[coluna];
				
			}
		}
		
		System.out.printf("\nPONTUACAO FINAL");
		 for(linha=0; linha<4; linha++)
		 {
			 System.out.printf("\n%s %s",times[linha],pontuacaoTotal[linha]);
		 }

	}

}
