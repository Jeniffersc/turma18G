package LacosDeRepeticao;
import java.util.Scanner;

public class Exercicio4 {
	public static void main (String[] args)
	{
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
		 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		 * o número de pessoas calmas; 
			o número de mulheres nervosas; 
			o número de homens agressivos; 
			o número de outros calmos;
			o número de pessoas nervosas com mais de 40 anos; 
			o número de pessoas calmas com menos de 18 anos.

		 */
		
		Scanner ler = new Scanner(System.in);
		
		int i=0, idade, genero, opcoes;
		int caso1=0, caso2=0, caso3=0, caso4=0, caso5=0, caso6=0;
		
		while(i<=150)
		{
			System.out.println("Olá, digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite seu gênero (1-Masculino; 2-Feminino; 3-Outros): ");
			genero = ler.nextInt();
			
			
			System.out.println("1-Calma; 2-Nervosa; 3-Agressiva");
			opcoes = ler.nextInt();
			
			//o número de pessoas calmas
			if(opcoes == 1)
			{
				caso1 = caso1 + 1;
			}
			
			//o número de mulheres nervosas
			if (genero == 2 && opcoes == 2)
			{
				caso2 = caso2 + 1;
			}
			
			//número de homens agressivos; 
			if (genero == 1 && opcoes == 3)
			{
				caso3 = caso3 + 1;
			}
			
			//número de outros calmos
			if (genero == 3 && opcoes == 1)
			{
				caso4 = caso4 + 1;
			}
			
			//número de pessoas nervosas com mais de 40 anos; 
			if (opcoes == 2)
			{
				if (idade > 40)
				{
					caso5 = caso5 + 1;
				}
			}
			
			//o número de pessoas calmas com menos de 18 anos.
			if (opcoes == 1)
			{
				if (idade < 18)
				{
					caso6 = caso6 + 1;
				}
			}
			
		i++;
		
		}
		
		System.out.println("O número de pessoas calmas é: " + caso1);
		System.out.println("O número de mulheres nervosas é:"  + caso2);
		System.out.println("O número de homens agressivos é:"  + caso3); 
		System.out.println("O número de outros calmos é:"  + caso4);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é:"  + caso5);
		System.out.println("O número de pessoas calmas com menos de 18 anos é:"  + caso6);
	}
}
