package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Ecommerce {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		ArrayList<String> carrinho = new ArrayList<>();
		
		int codigo, qtde;
		char opcao;
		
		produtos.add(new Produto(1,"Camisa Furada",  10.00, 20));
		produtos.add(new Produto(2,"Camisa Rasgada", 11.00, 20));
		produtos.add(new Produto(3,"Camisa Costurada", 12.00, 20));
		produtos.add(new Produto(4,"Camisa Suja", 13.00, 20));
		
		
		
		 for (Produto itens : produtos) {
	            System.out.println(itens.getNome());
		 }
		
		do {
			 System.out.println("Escolha um item:");
			 codigo = input.nextInt();
			 System.out.println("Escolha a quantidade:");
			 qtde = input.nextInt();
			
			 for (Produto itens : produtos) {
		           
				 if(itens.getCodProd() == codigo)
				 {
					 carrinho.add(produtos.get(codigo).getNome()+"\t\tR$"+produtos.get(codigo).getPrecoProd()+"\t\t"+qtde);
				 }
			 }
			
		System.out.println("Deseja continuar comprando? S/N:");
		opcao = input.next().toUpperCase().charAt(0);
		
		}while(opcao != 'N');
	   System.out.println(carrinho);
	}

}
