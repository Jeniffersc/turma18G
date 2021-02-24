programa
{
	funcao inicio()
	{
		/*
		 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
		 * e em seguida, 
		 * exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
		 * ou seja, diagonal principal.
		 */
		 inteiro matriz[3][3], soma=0, somaDiag=0

		para (inteiro i=0; i<3; i++) //linha
		{
			para (inteiro j=0; j<3; j++) //coluna
			{
				escreva("Digite o valor da linha ", i+1, " e da coluna ", j+1, ":")
				leia(matriz[i][j])
				soma += (matriz[i][j])
				se (i==0 e j==0 ou i==1 e j==1 ou i==2 e j==2)
				{
					somaDiag += (matriz[i][j])
				}
			}
		}
		escreva("A soma é: ", soma, "\n")
		escreva("A soma dos valores da primeira diagonal, ou seja, diagonal principal é:", somaDiag)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */