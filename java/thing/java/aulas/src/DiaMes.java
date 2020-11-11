import java.util.Scanner;

public class DiaMes {

	public static void main(String[] args) {
		
		
		String dias[][] = new String[5][31];
		int dia=0;
		String DiaMes;
		Scanner leia = new Scanner(System.in);
		int x;
		String tarefa;
		
		
		System.out.print("Digite o dia do mês: ");
		dia = leia.nextInt();
		
		for(x=0; x<5; x++) //tratar a coluna da matriz
		{
			
			System.out.println("Entre com a "+(x+1)+" tarefa do dia: ");
			dias[x][dia-1] = leia.next();
		}
		
			System.out.println("Tarefas do dia "+dia);
		
			for (x=0; x<5; x++)  //trantando a linha
			{
				
				System.out.println(dias[x][dia-1]);
				
		
		}

	}

}
