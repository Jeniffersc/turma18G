package Arrays;

import java.util.Scanner;
import java.util.Random;

public class Exercicio2 {
	public static void main (String[] args) {
		/*
		 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
		que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
		imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
		quantas foram as ocorr�ncias da maior pontua��o.
		 */
		
		Random random = new Random();
		
		Scanner ler = new Scanner(System.in);
			
		int lancamentos [] = new int[10]; //Declarando vetor com apenas a quantidade de posi��es
		int media=0, maiorPontucao=0, soma=0, cont=0;

		
	/*for(int i=0; i<10;i++)
		{
			System.out.println("Digite o valor do " + (i+1) + " lan�amento:");
			lancamentos[i] = ler.nextInt();
		}
	*/
		
		for (int i=0; i<10;i++) //10 lan�amentos
		{
			 lancamentos[i] = random.nextInt(6)+1; //gera um n�mero aleat�rio de 1-6 - Come�a no 1 e termina no 6
			
			System.out.println("O valor " + (i+1) + " �: " + lancamentos[i]);
			
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
		
		System.out.println("A maior pontua��o �: " + maiorPontucao);
		System.out.println("A maior pontua��o ocorreu: " + cont);
		System.out.println("A m�dia �: " + media);
			
	}	
}