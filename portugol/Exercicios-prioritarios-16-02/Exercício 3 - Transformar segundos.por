programa
{
	
	funcao inicio()
	{
		inteiro tempoDuracao, horas, min, s

		escreva ("digite o tempo de duração em segundos: ")
		leia(tempoDuracao)

		horas = tempoDuracao/3600
		min = (tempoDuracao % 60) / 60
		s = (tempoDuracao % 60) % 60

		escreva("Horas: ", horas, " e ", min, " e ", s, " segundos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */