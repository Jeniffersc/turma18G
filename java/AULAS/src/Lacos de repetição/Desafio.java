package LacosDeRepeticao;
import java.util.Scanner;

public class Desafio {
	public static void main (String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o tamanho da linha: ");
		numero = ler.nextInt();
		
		linha(numero);
	}
	
	public static void linha(int numero)
	{
		for (int i=0; i<numero; i++)
		{
			System.out.print("-");
		}
	}
	
}
