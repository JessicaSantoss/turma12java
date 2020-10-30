programa
{
	
	funcao inicio()
	{
		real valorFabrica, distribuidor, impostos, valorDistribuidor, valorImpostos, consumidor
		distribuidor = 28
		impostos = 45

		
		escreva("Digite o valor de custo de fábrica: ")
		leia(valorFabrica)

		valorDistribuidor = valorFabrica + (valorFabrica * distribuidor / 100)
		valorImpostos = valorFabrica + (valorFabrica * impostos / 100)
		consumidor = valorFabrica + valorDistribuidor + valorImpostos
		escreva("\nO custo final do consumidor é de: ",consumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */