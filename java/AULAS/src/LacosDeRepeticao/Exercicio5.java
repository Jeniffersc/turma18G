package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main (String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int numero=0, soma=0;
	    
	    do{
	        System.out.println("Digite um n�mero");
	        numero = ler.nextInt();
	        
	        soma = soma + numero;
	        
	    }while(numero != 0);
	    
	    System.out.printf("A soma dos n�meros digitados �: %d", soma);
	}
}
