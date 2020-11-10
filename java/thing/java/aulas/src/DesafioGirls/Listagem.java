package DesafioGirls;

import java.util.Scanner;

public class Listagem {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nomes[]= {"Ana veronica Nascimento cruz", "Bruno Estivalli Vicente", "Bruno Henrique Moraes Santos", "Daniel Ferreira", "Dayane de Oliveira", "Denis Vinicius Bolla da Silva", "Diego  Joaquim Silva ", "Erick Alan", "Everson Silva", "Gabriel Enrique Cabral Silva", "Guilherme Alex", "Guilherme Fidelis Pereira", "Gustavo Miquéias Lopes Santana", "Isac Cordeiro de Oliveira", "Iuri Garcia Nunes", "Jenifer Lima Placido", "Jéssica Cristiane", "Joao Pedro Sena", "Larissa Moraes Ribeiro", "Leonardo de Moraes Magalhães", "Lucas Santos Gonçalves", "Mariana  de Cássia Antunes Oliveira", "Patricia da Silva Machado", "Paula Leticia", "Raul Fernandes", "RICARDO MAGALHAES FINKELSTEIN", "Thiago dos Anjos", "Vitória Gonçalves de Freitas", "William Xavier"};
		boolean masculino[]={false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,false,false,true,false,true,true,false,false,false,true,true,true,false,true};
		int pessoasPorGrupo,x=0;
		
		
		System.out.printf("Digite a quantidade de pesssoas por grupo: ");
		pessoasPorGrupo = leia.nextInt();
		
	
		for (x=0;x<pessoasPorGrupo;x++) {
			System.out.printf(" "+nomes[x]);
			
		}
		
	}

}
