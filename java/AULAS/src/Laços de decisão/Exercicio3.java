package Dia25Fev;
import java.util.Scanner;

public class Exercicio3 {
	public static void main (String[] args)
	{
		/*
		 * Faça um programa que receba a idade de uma pessoa e 
		 * mostre na saída em qual categoria ela se encontra:
			10-14 infantil
			15-17 juvenil
			18-25 adulto
		 */
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		if (idade==10 || idade==11 || idade==12 || idade==13 || idade==14) 
		{
			System.out.println("Sua categoria é infantil");
		}
		
		else if (idade==15 || idade==16 || idade==17) 
		{
			System.out.println("Sua categoria é junevil");
		}
		
		else if (idade==18 || idade==19 || idade==20 || idade==21 || idade==22 || idade==23 || idade==24 || idade==25) 
		{
			System.out.println("Sua categoria é adulto");
		}
	}
}
