programa
{
	inclua biblioteca Matematica --> mat  // Inclui a biblioteca Matemática
	funcao inicio()
	{
		// Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: D=(R+S)/2, onde R=(A+B)^2 e S=(B+C)^2

		
		inteiro D, R, S, A, B, C, somaDeR, potDeR
		escreva("Digite o valor de A: ")
		leia(A)
		escreva("Digite o valor de B: ")
		leia(B)
		escreva("Digite o valor de C: ")
		leia(C)
		
		R = mat.potencia(A+B, 2)
		
		S= mat.potencia(B+C, 2)
		
		D=(R+S)/2
		escreva("O valor de D é: ", D, "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 493; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */