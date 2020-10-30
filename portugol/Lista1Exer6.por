programa
{
	inclua biblioteca Matematica --> mat //aqui é o apelido da biblioteca
	
	funcao inicio()
	{
		// OBJETIVO: escreva a distância entre eles.
		//A fórmula que efetua tal cálculo é: esta no word
		
		//VARIAVEIS
		real x1
		real x2
		real y1,y2,d=0.0 // a variavel d é o resultado
		//entradas
		escreva("Digite o valor de x1:")
		leia(x1)
		escreva("Digite o valor de x2:")
		leia(x2)
		escreva("Digite o valor de y1:")
		leia(y1)
		escreva("Digite o valor de y2:")
		leia(y2)
		//processamento
		// d =mat.raiz( ( mat.potencia((x2 -x1),2) +mat.potencia((y2-y1),2) ),2)
		// aqui é
		d = mat.raiz((mat.potencia((x2-x1),2) + mat.potencia((y2-y1),2)),2)
		// saida
		escreva("A distancia calculada de P1 E P2 é ",d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 731; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */