package Arrays;
import java.util.Scanner;

public class Exemplos {
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int valores[] = new int[5]; //Declarando vetor com apenas a quantidade de posi��es
		
		int maisValores[] = {10, 20, 30}; //Declarando vetor com os n�meros
		
		
		 //Se eu n�o souber o tamanho do vetor 
		 for (int i=0; i<maisValores.length; i++)
		 {
		  	System.out.println("O valor " + (i+1) + " �: " + maisValores[i]);
		 }
		 System.out.println("--------------------------------");
		
		for (int i=0; i<5; i++)
		{
			System.out.println("Digite o valor " + (i+1) + ":");
			valores[i] = ler.nextInt();
		}
		
		for (int i=0; i<5; i++)
		{
			System.out.println("O valor " + (i+1) + " �: " + valores[i]);
		}
		
	}
}
