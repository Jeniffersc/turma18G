programa
{
	
	funcao inicio()
	{
		//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

		inteiro anos, meses, dias,anosEmDias, mesesEmDias, somaDias
		
		escreva("Digite quantos anos você tem: ")
		leia(anos)
		escreva("Digite quantos meses você tem: ")
		leia(meses)
		escreva("Digite quantos dias você tem: ")
		leia(dias)

		anosEmDias = anos * 365
		mesesEmDias = meses * 31

		somaDias = anosEmDias + mesesEmDias + dias 
		escreva("Você tem ", somaDias, " dias de vida")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 531; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */