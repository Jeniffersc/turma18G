package Dia25Fev;
import java.util.Scanner;

public class Exercicio2 {
	public static void main (String[] args)
	{
		/*
		 * Fa�a um programa que entre com tr�s n�meros e 
		 * coloque em ordem crescente.
		 */
		
		Scanner ler = new Scanner(System.in);
		double n1, n2, n3, auxiliar=0;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = ler.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = ler.nextDouble();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = ler.nextDouble();
		
		if (n1 > n2) {
            auxiliar = n1;
            n1 = n2;
            n2 = auxiliar;
        }

        if (n2 > n3) {
            auxiliar = n2;
            n2 = n3;
            n3 = auxiliar;

        }
         
     
        if (n1 > n2) {
            auxiliar = n1;
            n1 = n2;
            n2 = auxiliar;
        }
		
		System.out.println("A ordem crecente �: " + n1 + ", " + n2 + ", " + n3);
	}
}
