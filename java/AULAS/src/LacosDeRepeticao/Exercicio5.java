package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main (String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int numero=0, soma=0;
	    
	    do{
	        System.out.println("Digite um número");
	        numero = ler.nextInt();
	        
	        soma = soma + numero;
	        
	    }while(numero != 0);
	    
	    System.out.printf("A soma dos números digitados é: %d", soma);
	}
}
