programa
{
	
	funcao inicio()
	{
		inteiro vetor[5]
		inteiro codigo=0
		
		para (inteiro x = 0; x<5; x++)
		{
			escreva("Digite o valor:",x+1," : ")	
			leia(vetor[x])
			
		}
		
			escreva("Digite o codigo 0 /1 /2 :")
		leia(codigo)

		se (codigo==1){

		escreva(vetor[0],vetor[1], vetor[2], vetor[3], vetor[4])
			
			}

		senao se (codigo==2){

			escreva(vetor[4], vetor[3], vetor[2], vetor[1], vetor[0])
			
			}
		senao se (codigo==0){
			
		
			escreva("\nCódigo invalido! O programa será finalizado.")
		}

		senao se (codigo>2)
	{
		escreva("\nCódigo invalido! O programa será finalizado.")
	}
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