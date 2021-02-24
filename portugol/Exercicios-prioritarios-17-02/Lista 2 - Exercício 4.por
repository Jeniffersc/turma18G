programa
{
	
	funcao inicio()
	{
		//4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este 
		//número é par ou ímpar, e se é positivo ou negativo.
		
		inteiro n
		
		escreva("Digite um número negativo ou positivo: ")
		leia(n)
		
		se (n > 0)
		{
			escreva("O número " + n + " é positivo")
		}

		senao se (n<0)
		{
			escreva("O número " + n + " é negativo")
		}
		
		se (n==0)
				{
			escreva("Você digitou 0 e ele é neutro.")
		}
		
		senao se (n % 2 == 0)
		{
			escreva(" e par.")
		}

		senao 
		{
			escreva(" e ímpar.")
		}
	}
}




/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 553; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */