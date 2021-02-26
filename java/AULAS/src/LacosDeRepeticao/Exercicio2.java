package LacosDeRepeticao;
import java.util.Scanner;

public class Exercicio2 {
	public static void main (String[] args)
	{
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */
		
		Scanner ler = new Scanner(System.in);
		
		double n;
		int par=0, impar=0;
		
		for (int i=0; i<10; i++)
		{
			System.out.println("Digite o número " + (i+1) + ":");
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
		
		System.out.println("São " + par + " núemros pares e " + impar + " números impares" );
		
	}
}
