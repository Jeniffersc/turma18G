package Dia25Fev;
import java.util.Scanner;

public class Exercicio1 
{
	public static void main (String[] args)
	{
		/*
		 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior
		 */
		
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3, maior=0;
		
		System.out.println("Escreva o primeiro n�mero inteiro: ");
		n1 = ler.nextInt();
		
		System.out.println("Escreva o segundo n�mero inteiro: ");
		n2 = ler.nextInt();
		
		System.out.println("Escreva o terceiro n�mero inteiro: ");
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
		
		System.out.println("O maior n�mero digitado �: " + maior);
	}
}
