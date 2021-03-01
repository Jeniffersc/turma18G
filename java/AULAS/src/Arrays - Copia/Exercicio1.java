package Arrays;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
		/*
		 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
			atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		 */
			
		Scanner ler = new Scanner(System.in);
			
		int valores[] = new int[5]; //Declarando vetor com apenas a quantidade de posições
		int maiorPontucao=0;
		
		
		for (int i=0; i<5; i++)
		{
			System.out.println("Digite o valor " + (i+1) + ":");
			valores[i] = ler.nextInt();
		}
			
		for (int i=0; i<5; i++)
		{
			System.out.println("O valor " + (i+1) + " é: " + valores[i]);
			if (valores[i]> maiorPontucao)
			{
				maiorPontucao = valores[i];
			}
		}
		
		System.out.println("A maior pontuação é: " + maiorPontucao);
			
	}	
}


