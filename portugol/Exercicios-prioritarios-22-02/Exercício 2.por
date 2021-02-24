programa
{
	
	funcao inicio()
	{
		/*
		 * 2 - Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
		 * e apresente também quantas foram as ocorrências da maior pontuação.
		 */

		inteiro lancamento[10], maior=0, cont=0
		real media=0.0
		
		para (inteiro i=0; i<10; i++) //linha
		{
			escreva("O resultado do ", i+1, " foi:")
			leia(lancamento[i])
		}
	
		
		para (inteiro i=0; i<10; i++) //linha
		{
			escreva("O resultado do lançamento ", i+1, " foi:", lancamento[i], "\n")
		}

		para (inteiro i=0; i<10; i++) //linha
		{
			media += (lancamento[i])/10
		}
		escreva("A média aritmética dos lançamentos é: ", media, "\n")

		para (inteiro i=0; i<10; i++)
		{
			se (lancamento[i] > maior) 
			{
				maior = lancamento[i]
			}
		}
		escreva("A maior ocorrência foi do valor: ", maior, "\n")

		para (inteiro i=0; i<10; i++)
		{
			se (lancamento[i] == maior)
			{
				cont += 1
			}
		}
		escreva("A ocorrência de: ", maior, " foi de: ", cont, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 358; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */