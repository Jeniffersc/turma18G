package Arrays;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
		/*
		 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
			atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
		 */
			
		Scanner ler = new Scanner(System.in);
			
		int valores[] = new int[5]; //Declarando vetor com apenas a quantidade de posi��es
		int maiorPontucao=0;
		
		
		for (int i=0; i<5; i++)
		{
			System.out.println("Digite o valor " + (i+1) + ":");
			valores[i] = ler.nextInt();
		}
			
		for (int i=0; i<5; i++)
		{
			System.out.println("O valor " + (i+1) + " �: " + valores[i]);
			if (valores[i]> maiorPontucao)
			{
				maiorPontucao = valores[i];
			}
		}
		
		System.out.println("A maior pontua��o �: " + maiorPontucao);
			
	}	
}


