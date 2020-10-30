programa
{
	
	funcao inicio()
	{ inteiro C, N, HE, S, EX

		escreva("Digite o código de funcionário: ")
		leia(C)
	     escreva("Digite o número de horas trabalhadas: ")
		leia(N)
		

		se (N>50)
		{
			HE=N-50
			EX=HE*20
			S=50*10
			escreva("\nSalário total: ",S )
			escreva("\nSalário excedente: ",EX )
		}
		
		senao 
		{ S=N*10
	         escreva("\nSalário total: ",S". \nVocê não possui horas excedentes!") 
		
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */