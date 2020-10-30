programa
{
	
	funcao inicio()
	{
		inteiro idadeDias, ano, mes, dias, diasAno, diasMes
		diasAno = 365
		diasMes = 30

		
		escreva("Digite sua idade em anos: ")
		leia(ano)
		escreva("Digite sua idade em meses: ")
		leia(mes)
		escreva("Digite sua idade em dias: ")
		leia(dias)

		idadeDias = ((ano * diasAno) + (mes * diasMes) + dias)
		
		escreva("\nSua idade em dias é: ", idadeDias)
		
		

	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 401; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */