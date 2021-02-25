package Dia25Fev;
import java.util.Scanner;

public class Exercicio1 
{
	public static void main (String[] args)
	{
		/*
		 * Faça um programa que receba três inteiros e diga qual deles é o maior
		 */
		
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3, maior=0;
		
		System.out.println("Escreva o primeiro número inteiro: ");
		n1 = ler.nextInt();
		
		System.out.println("Escreva o segundo número inteiro: ");
		n2 = ler.nextInt();
		
		System.out.println("Escreva o terceiro número inteiro: ");
		n3 = ler.nextInt();
		
		if (n1 > maior) {
			maior = n1;
		}
		
		if (n2 > maior) {
			maior = n2;
		}
		
		if (n3 > maior) {
			maior = n3;
		}
		
		System.out.println("O maior número digitado é: " + maior);
	}
}
