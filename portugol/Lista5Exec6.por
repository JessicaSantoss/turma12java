programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro matriz [3][3]
		inteiro vetor[3]
		inteiro x,y
		inteiro resultado

		escreva("Matriz")
		para (x=0;x<3;x++){
			escreva ("\n")
			para (y=0;y<3;y++){
				matriz[x][y] = Util.sorteia(1, 5)
				escreva(" ", matriz[x][y]"\n")
				
			}
		}

		escreva ("\nVetor")

		para(x=0;x<3;x++) {
			vetor[x] = Util.sorteia(1, 5)
			escreva (" ", vetor[x])
			
		}

		escreva ("\nResultado!")
		para (x=0;x<3;x++){
			escreva ("\n")
			para (y=0;y<3;y++){
			resultado = vetor[y]*matriz[x][y]
			escreva(" ", resultado"\n")
			
		}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */