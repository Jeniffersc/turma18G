package LacosDeRepeticao;
import java.util.Scanner;

public class Exercicio2 {
	public static void main (String[] args)
	{
		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */
		
		Scanner ler = new Scanner(System.in);
		
		double n;
		int par=0, impar=0;
		
		for (int i=0; i<10; i++)
		{
			System.out.println("Digite o n�mero " + (i+1) + ":");
			n = ler.nextDouble();
			
			if (n % 2 == 0)
			{
				par = par + 1;
			}
			else 
			{
				impar = impar + 1;
			}
		}
		
		System.out.println("S�o " + par + " n�emros pares e " + impar + " n�meros impares" );
		
	}
}
