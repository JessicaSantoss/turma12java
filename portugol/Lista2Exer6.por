programa
{
	
	funcao inicio()
	{ inteiro idade
		escreva("Digite a idade do nadador: ")
		leia(idade)
		

		se (idade >5 e idade <=7)
              {
                  escreva("\nO atleta está na categoria infantil A!")  
              } 
		senao se (idade >8 e idade <=11)
              {
                  escreva("\nO atleta está na categoria infantil B!")  
              }
          senao se (idade >12 e idade <=13)
              {
                  escreva("\nO atleta está na categoria juvenil A!")  
              }
          senao se (idade >14 e idade <=17)
              {
                  escreva("\nO atleta está na categoria juvenil B!")  
              }
          senao se (<idade >18)
              {
                  escreva("\nO atleta está na categoria de adultos! "),  
              }
                       	       
          senao {
 			  escreva("\nEste atleta não pode nadar!")
 			
                                    
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 653; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */