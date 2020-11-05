programa
{
						inclua biblioteca Matematica --> mat
	funcao inicio()
	{ 	
		real peso=0, altura=0, imc=0, alt

		escreva ("Digite o peso: ")
		leia(peso)
		
		escreva("Digite a altura: ")
		leia(altura)
		
		alt = mat.potencia(altura,2)
		imc=peso/alt
		
		se (imc < 18.5)
		{
			escreva("Abaixo do peso")
		}
		senao se (imc > 18.5 e imc <=25)
		{
			escreva("Acima do peso")
		}
		senao se (imc > 25 e imc ==30)
		{
			escreva("Acima do peso")
		}
		senao se (imc > 30)
		{
			escreva("Obeso")
		}
		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 345; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */