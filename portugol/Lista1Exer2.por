programa
{
	
	funcao inicio()
	{
		inteiro idadeDias, ano, mes, dias
		//ano = 365
		//mes = 30

		escreva("Digite sua idade em dias: ")
		leia(idadeDias)

		ano = idadeDias / 365
		mes = (idadeDias % 365)/30
		dias = ((idadeDias % 365)%30)
		
		escreva("\nSua idade em anos é: ", ano)
		escreva("\nSua idade em meses é: ", mes)
		escreva("\nSua idade em dias é: ", dias)
		
		

	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 231; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */