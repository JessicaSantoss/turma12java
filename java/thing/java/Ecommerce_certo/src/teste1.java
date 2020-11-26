import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class teste1 {
	
		public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			int valor;
			boolean validacao = true;
			int carrinho[] = new int[10];
			int contador = 0;
			int carrinhoQntd[] = new int[10];
			int opcao = 0;
			double soma = 0;
			char resposta;
			Pagamento pagamento = new Pagamento();
			List<Produto> prod = new ArrayList<>();
			prod.add(new Produto(1, "Camiseta azul ", 10.00, 10));
			prod.add(new Produto(2, "Camiseta vermelha", 11.00, 10));
			prod.add(new Produto(3, "Camiseta verde", 12.00, 10));
			prod.add(new Produto(4, "Camiseta rosa", 13.00, 10));
			prod.add(new Produto(5, "Camiseta branca", 14.00, 10));
			prod.add(new Produto(6, "Camiseta preta", 15.00, 10));
			prod.add(new Produto(7, "Camiseta roxa", 16.00, 10));
			prod.add(new Produto(8, "Camiseta amarela",17.00, 10));
			prod.add(new Produto(9, "Camiseta cinza",18.00, 10));
			prod.add(new Produto(10, "Camiseta xadrez",19.00, 10));
			System.out.println("PRODUTO          PREÇO  ESTOQUE");
			for (Produto produ : prod) {
				System.out.println(produ.getCodProd() + "\t" + produ.getNome() + "\t" + produ.getPrecoUni() + "\t"
						+ produ.getEstoque());
			}
			do {
				System.out.println("Digite o código do produto que deseja comprar: ");
				valor = read.nextInt();
				System.out.println("Digite a quantidade que deseja comprar? ");
				opcao = read.nextInt();
				carrinhoQntd[contador] = opcao;
				if (valor <= 0 || valor >= 10 || opcao <= 0) {
					System.out.println("Digite um código válido, tente novamente");
					validacao = true;
				} else {
					carrinho[contador] = valor;
					validacao = false;
				}
				System.out.println("Deseja adicionar mais produtos? S/N");
				resposta = read.next().toUpperCase().charAt(0);
				
			} while (resposta != 'N');
		
			for (Produto produ : prod) {
				if (produ.getCodProd() == valor) {
					soma = (produ.getPrecoUni() * carrinhoQntd[contador]);
					System.out.println(produ.getCodProd() + "\t" + produ.getNome() + "\t" + produ.getPrecoUni());
					System.out.println(produ.getNome() + "\n Unidades Compradas: " + valor);
					System.out.println("\n O estoque é de: " + produ.getEstoque());
				}
			}
			pagamento.somaTotal(soma);
			contador++;
			if (contador == 0) {
				for (Produto produ : prod) {
					if (produ.getCodProd() == carrinho[0]) {
						System.out.println(produ.getCodProd() + "\t" + produ.getNome() + "\t" + produ.getPrecoUni());
					}
				}
			} else {
				int x = 0;
				for (int i = 0; i <= contador; i++) {
					for (Produto produ : prod) {
						if (produ.getCodProd() == carrinho[x]) {
							System.out.println(produ.getCodProd() + "\t" + produ.getNome() + "\t" + produ.getPrecoUni());
						}
					}
					x++;
				}
			}
			System.out.print("\n\n FORMAS DE PAGAMENTO");
			System.out.print("\n1 - Pagamento à vista em dinheiro ou cheque.");
			System.out.print("\n2 - Pagamento à vista em cartão de crédito. ");
			System.out.print("\n3 - Pagamento parcelado no Cartão.");
			opcao = read.nextInt();
			System.out.println(pagamento.getPrecoTotal());
			if (opcao == 1) {
				System.out.println("O valor total com desconto de 20% é de R$");
				pagamento.vistaDinheiro(pagamento.getPrecoTotal());
				System.out.println("Preço: " + pagamento.getDinheiro());
			} else if (opcao == 2) {
				System.out.println("O valor total com desconto de 15% é de R$");
				pagamento.vistaCartao(pagamento.getPrecoTotal());
				System.out.println("Preço: " + pagamento.getCartao());
			} else if (opcao == 3) {
				System.out.println("O valor parcelado em 2x é de R$");
				System.out.println("O valor parcelado em 3x é de R$");
				System.out.println("Para parcelar 2 vezes digite 1, para parcelar em 3 vezes digite 2: ");
				opcao = read.nextInt();
				pagamento.parceladoCartao(opcao, pagamento.getPrecoTotal());
			}
		}
	
}
