programa
{
	
	funcao inicio()
	{
		inteiro maior=0, numero[5]

		para (inteiro x= 0; x<5; x++)
		{
			escreva("Digite o ", (x+1), "º valor: ")
				leia (numero[x])
				
				se (numero[x] > maior) {
					maior = numero[x]

			}
			
		}

		escreva("\nO maior número é: "+maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 283; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */