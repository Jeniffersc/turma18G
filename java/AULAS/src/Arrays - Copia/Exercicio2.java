package Arrays;

import java.util.Scanner;
import java.util.Random;

public class Exercicio2 {
	public static void main (String[] args) {
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também
		quantas foram as ocorrências da maior pontuação.
		 */
		
		Random random = new Random();
		
		Scanner ler = new Scanner(System.in);
			
		int lancamentos [] = new int[10]; //Declarando vetor com apenas a quantidade de posições
		int media=0, maiorPontucao=0, soma=0, cont=0;

		
	/*for(int i=0; i<10;i++)
		{
			System.out.println("Digite o valor do " + (i+1) + " lançamento:");
			lancamentos[i] = ler.nextInt();
		}
	*/
		
		for (int i=0; i<10;i++) //10 lançamentos
		{
			 lancamentos[i] = random.nextInt(6)+1; //gera um número aleatório de 1-6 - Começa no 1 e termina no 6
			
			System.out.println("O valor " + (i+1) + " é: " + lancamentos[i]);
			
			soma = soma + lancamentos[i];
			media = soma / 10;
			
			if (lancamentos[i]>= maiorPontucao)
			{
				if (lancamentos[i]> maiorPontucao)
				{
					cont = 0;
				}
				maiorPontucao = lancamentos[i];
				cont++;
			}
		}
		
		System.out.println("A maior pontuação é: " + maiorPontucao);
		System.out.println("A maior pontuação ocorreu: " + cont);
		System.out.println("A média é: " + media);
			
	}	
}