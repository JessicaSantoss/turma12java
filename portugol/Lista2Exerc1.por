programa
{
	
	funcao inicio()
	{	real P, EX, M
		escreva("Digite o peso do tomate: ")
		leia(P)

		se(P>50)
              {
                  escreva("O peso do tomate está acima do permitido!")
                  EX = P - 50 
                  M = (P-50)*4
                  escreva("\nValor do excedente: ",EX)
                  escreva("\nValor da multa: R$",M)   
              }          	        	
          senao {

               escreva("O peso do tomate está dentro do permitido, nenhuma multa será aplicada.")
               escreva("\nExcedente: 0")
             	escreva("\nMulta: R$0")
                                    
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 598; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */