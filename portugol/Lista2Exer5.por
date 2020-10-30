programa
{
	
	funcao inicio()
	{
		real indice
		escreva("Digite o índice: ")
		leia(indice)

		se(indice>=0.5)
              {
                  escreva("O índice está alto, notifique o 1º, 2º e 3º grupo para que suspendam as atividades!")
                     
              } 

		senao se (indice>=0.4)
		{
			escreva("Notifique 1º e 2º grupo para que suspendam as atividades!")
		}
          senao se (indice>=0.3)
		{
			escreva("Notifique 1º grupo para que suspendam as atividades!")
		}
		}
		senao se (indice>=0.05 e <=0.25)
		{
			escreva("Poluição aceitavel!")
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