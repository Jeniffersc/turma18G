programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		/*
		 * 3) Desenvolva um sistema em que:
		Leia 4 (quatro) números;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 */

		real n1, n2, n3, n4, potN1, potN2, potN3, potN4
		
		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)
		escreva("Digite o terceiro número: ")
		leia(n3)
		escreva("Digite o quarto número: ")
		leia(n4)

		potN1 = Matematica.potencia(n1, 2)
		potN2 = Matematica.potencia(n2, 2)
		potN3 = Matematica.potencia(n3, 2)
		potN4 = Matematica.potencia(n4, 2)

		se (potN3 >= 1000) {
			escreva(Matematica.arredondar(potN3, 0))
		}
		senao
		{
			escreva("O primeiro valor lido foi: " +n1+ ". E o seu quadrado é: " + potN1 + "\n")
			escreva("O segundo valor lido foi: " +n2+ ". E o seu quadrado é: " + potN2 + "\n")
			escreva("O terceiro valor lido foi: " +n3+ ". E o seu quadrado é: " + potN3 + "\n")
			escreva("O quarto valor lido foi: " +n4+ ". E o seu quadrado é: " + potN4 + "\n")
		}
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 810; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */