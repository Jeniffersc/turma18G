package Dia25Fev;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio4 {
	public static void main (String[] args)
	{
		/*
		 * Fa�a um programa em que permita a entrada de um n�mero 
		 * qualquer e exiba se este n�mero � par ou �mpar. 
		 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
		 * se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		double n, raiz=0.0, pot=0.0;
		
		System.out.println("Digite um n�mero: ");
		n = ler.nextDouble();
		
		if (n % 2 == 0)
		{
			raiz = Math.sqrt(n);
			System.out.println("O n�mero " + n + " � par. Sua raiz quadrada de �: " + Math.round(raiz));
		}
		else
		{
			pot = Math.pow(n, 2);
			System.out.println("O n�mero " + n + " � �mpar. E elevado ao quadrado �: " + Math.round(pot));
		}
	}
}