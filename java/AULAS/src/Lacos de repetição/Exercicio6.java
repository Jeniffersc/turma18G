package LacosDeRepeticao;
import java.util.Scanner;

public class Exercicio6 {
	public static void main (String[] args) {
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. 
		 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
		 * Para sair digitar 0(zero).(DO...WHILE)
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int n, media=0, soma=0, cont=0;
		
		do
		{
			System.out.println("Digite um n�mero: ");
			n = ler.nextInt();
			
			if (n % 3 == 0 && n !=0)
			{
				cont++;
				soma = soma + n;
			}
		}
		while(n!= 0);
		
		System.out.println(soma +"e"+ cont);
		media = soma/cont;
		System.out.printf("A m�dia dos n�meros multiplos de 3 �: %d", media);
	}	
}
