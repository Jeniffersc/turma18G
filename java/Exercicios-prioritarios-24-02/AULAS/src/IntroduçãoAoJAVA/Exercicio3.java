package Introdu��oAoJAVA;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio3 
{
	public static void main (String[] args)
	{
		/*
		 * Fa�a um sistema que leia o tempo de dura��o de um evento 
		 * em uma f�brica expressa em segundos e mostre-o expresso 
		 * em horas, minutos e segundos. 
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int tempoDuracao, horas, min, s;

		System.out.println("Digite o tempo de dura��o em segundos: ");
		tempoDuracao = ler.nextInt();
		
		horas = tempoDuracao/3600;
		min = (tempoDuracao % 60) / 60;
		s = (tempoDuracao % 60) % 60;

		System.out.println("Horas: "+ horas+ " e "+ min+ " e "+ s+ " segundos");
	}
}