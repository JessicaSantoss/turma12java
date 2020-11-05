programa
{
	
	funcao inicio()
	{
		inteiro N=0, G1=0, G2=0, G3=0, G4=0

			enquanto (N >= 0) {
			escreva("Digite um número: ")
			leia(N)
			
			se (N>=0 e N<=25)
			{  
			G1 = G1 + 1
			}
			senao se (N>=26 e N<=50)
			{  
			G2 = G2 + 1
			}
			senao se (N>=51 e N<=75)
			{  
			G3 = G3 + 1
			}
			senao se (N>=76 e N<=100)
			{  
			G4 = G4 + 1
			}
			
			
						
			}

			escreva ("\nNúmero invalido, programa interrompido!")
			escreva("\nA quantidade de números entre 0 e 25 é: ",G1)
			escreva("\nA quantidade de números entre 26 e 50 é: ",G2)
			escreva("\nA quantidade de números entre 51 e 75 é: ",G3)
			escreva("\nA quantidade de números entre 76 e 100 é: ",G4)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 683; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */