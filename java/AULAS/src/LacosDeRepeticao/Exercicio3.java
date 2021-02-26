package LacosDeRepeticao;
import java.util.Scanner;

public class Exercicio3 {
	public static void main (String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int idade=0, tot21=0, tot50=0;
		
		while(idade!=-99)
		{
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			if (idade<21)
			{
				tot21++;
			}
			else if (idade>50)
			{
				tot50++;
			}
		}
		
 		System.out.printf("Total de pessoas com menos de 21 anos é: %d. Total de pessoas com mais de 50 anos é: %d", tot21, tot50);
	}
}
