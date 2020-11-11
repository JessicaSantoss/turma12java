package Lista4;

        import java.util.Random;
        
public class Exerc4 {

	public static void main(String[] args) {
		int L = 3;
		int C = 3;
		int tabela[][] = new int [3][3];
		int somaDiagonal = 0;
		int x = 0, y=0;
		Random random = new Random();
		
		for (x = 0; x<L; x++)
		{
			for(y = 0; y<C; y++)
			{
				tabela[x][y] = random.nextInt(9);
				if (x==y)
				{
					somaDiagonal = somaDiagonal + tabela[x][y];	
				}
				
			}
		}
		
		for ( x = 0; x<L; x++)
		{
			for (y = 0; y<C; y++)
			{
				System.out.println(tabela[x][y]);
				System.out.printf(" ");
			}
				System.out.printf("\n");
			
		}
				System.out.printf("Resultado total: ", 	somaDiagonal);

	}

}
