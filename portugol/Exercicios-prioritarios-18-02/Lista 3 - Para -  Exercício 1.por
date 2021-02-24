programa
{
	
	funcao inicio()
	{
		/*
		 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
			coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
			a) média do salário da população;
			b) média do número de filhos;
			c) maior salário;
			d) percentual de pessoas com salário até R$100,00.
		 */

		inteiro hab
		real salario, mediaSalario=0.0, totSalario=0.0, totFilhos=0.0, mediaFilhos=0.0, maiorSalario=0.0, percentual=0.0
		inteiro filhos, salarioAte100=0
		
		 para(hab=0; hab<20; hab++)
		 {
		 	escreva("Digite seu salário: ")	
		 	leia(salario)

		 	escreva("Digite quantos filhos você tem: ")	
		 	leia(filhos)

			// a) média do salário da população;
			totSalario = totSalario + salario
			
		 	//b) média do número de filhos;
		 	totFilhos = totFilhos + filhos

		 	//c) maior salário;
		 	se (salario > maiorSalario)
		 	{
		 		maiorSalario = salario
		 	}

		 	//d) percentual de pessoas com salário até R$100,00.
			se (salario <= 100.00)
			{
				salarioAte100++
			}
		 	
		 }
			
		 // a) média do salário da população;	
		 mediaSalario = (totSalario/20)
		 escreva("A média do salário da população é: " + mediaSalario+ "\n")

		 //b) média do número de filhos;
		 mediaFilhos = (totFilhos/20)
		 escreva("A média do número de filhos é: " + mediaFilhos+ "\n")

		 //c) maior salário;
		 escreva("O maior salário é: " + maiorSalario+ "\n")

		 //d) percentual de pessoas com salário até R$100,00.
		 percentual = salarioAte100*5
		 escreva("O percentual de pessoas com salário até R$100,00 é: " + percentual + "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1503; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */