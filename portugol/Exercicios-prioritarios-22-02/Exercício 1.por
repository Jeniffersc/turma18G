programa
{
	
	funcao inicio()
	{
		/*/
		 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação 
		 * de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
		 */
		inteiro val[5], maior=0

		para (inteiro i=0; i<5; i++)
		{
			escreva("Digite o ", i+1 , " valor de pontuação de uma atividade: ")
			leia(val[i])
		}

		para (inteiro i=0; i<5; i++)
		{
			 escreva("Valor ", i, " é: ", val[i], "\n")
		}
		
		para (inteiro i=0; i<5; i++)
		{
			se (val[i] > maior) 
			{
				maior = val[i]
			}
		}
		escreva("A maior pontuação é: ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 460; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */