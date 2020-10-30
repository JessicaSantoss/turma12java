programa
{
	
	funcao inicio()
	{
		real A, B, C, D, QA, QB, QC, QD
		escreva("Digite o valor do primeiro número: ")
		leia(A)
		escreva("Digite o valor do segundo número: ")
		leia(B)
		escreva("Digite o valor do terceiro número: ")
		leia(C)
		escreva("Digite o valor do quarto número: ")
		leia(D)

		QA = A*A
		QB = B*B
		QC = C*C
		QD = D*D

		se(QC>= 1000)
              {
                  escreva("\nValor do quadrado do terceiro número é ",QC)
                  escreva("\nPrograma finalizado!")   
              }          	        	
          senao {
 			  escreva("\nValor do quadrado de ",A," é ",QA)
 			  escreva("\nValor do quadrado de ",B," é ",QB)
 			  escreva("\nValor do quadrado de ",C," é ",QC)
 			  escreva("\nValor do quadrado de ",D," é ",QD)
                                    
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 242; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */