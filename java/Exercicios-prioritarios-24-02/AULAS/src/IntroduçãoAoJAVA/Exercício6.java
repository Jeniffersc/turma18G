package Introdu��oAoJAVA;
import java.util.Scanner;
import java.lang.Math;

public class Exerc�cio6 
{
	public static void main (String[] args)
	{
		/*
		 * Construa um programa em c que, tendo como dados de 
		 * entrada dois pontos quaisquer no plano, P(x1, y1) 
		 * e P(x2, y2), escreva a dist�ncia entre eles. 
		 * A f�rmula que efetua tal c�lculo �: 
		 */
		
		Scanner ler = new Scanner(System.in);
		
		double d, x2, x1, y2, y1, somaDePot, potDeX, potDeY;
		System.out.println("Digite o valor de x1: ");
		x1 = ler.nextInt();
		System.out.println("Digite o valor de x2: ");
		x2 = ler.nextInt();
		System.out.println("Digite o valor de y1: ");
		y1 = ler.nextInt();
		System.out.println("Digite o valor de y2: ");
		y2 = ler.nextInt();
	
		potDeX = Math.pow(x1+x2, 2.0);
		potDeY = Math.pow(y1+y2, 2.0);
		somaDePot = potDeX + potDeY;
		
		d = Math.sqrt(somaDePot);
		
		System.out.println("A dist�ncia entre os pontos � de: " + d);
	}
}
