programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro A, B, C, R, S
		real D
		escreva("Digite o valor de A: ")
		leia(A)
		escreva("Digite o valor de B: ")
		leia(B)
		escreva("Digite o valor de C: ")
		leia(C)

		R = mat.potencia((A+B),2)
		escreva("\nO valor de R é: ", R)

		S = mat.potencia((B+C),2)	
		escreva("\nO valor de S é: ", S)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */