package LacosDeRepeticao;
import java.util.Scanner;

public class Exercicio4 {
	public static void main (String[] args)
	{
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. 
		 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		 * e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		 * o n�mero de pessoas calmas; 
			o n�mero de mulheres nervosas; 
			o n�mero de homens agressivos; 
			o n�mero de outros calmos;
			o n�mero de pessoas nervosas com mais de 40 anos; 
			o n�mero de pessoas calmas com menos de 18 anos.

		 */
		
		Scanner ler = new Scanner(System.in);
		
		int i=0, idade, genero, opcoes;
		int caso1=0, caso2=0, caso3=0, caso4=0, caso5=0, caso6=0;
		
		while(i<=150)
		{
			System.out.println("Ol�, digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite seu g�nero (1-Masculino; 2-Feminino; 3-Outros): ");
			genero = ler.nextInt();
			
			
			System.out.println("1-Calma; 2-Nervosa; 3-Agressiva");
			opcoes = ler.nextInt();
			
			//o n�mero de pessoas calmas
			if(opcoes == 1)
			{
				caso1 = caso1 + 1;
			}
			
			//o n�mero de mulheres nervosas
			if (genero == 2 && opcoes == 2)
			{
				caso2 = caso2 + 1;
			}
			
			//n�mero de homens agressivos; 
			if (genero == 1 && opcoes == 3)
			{
				caso3 = caso3 + 1;
			}
			
			//n�mero de outros calmos
			if (genero == 3 && opcoes == 1)
			{
				caso4 = caso4 + 1;
			}
			
			//n�mero de pessoas nervosas com mais de 40 anos; 
			if (opcoes == 2)
			{
				if (idade > 40)
				{
					caso5 = caso5 + 1;
				}
			}
			
			//o n�mero de pessoas calmas com menos de 18 anos.
			if (opcoes == 1)
			{
				if (idade < 18)
				{
					caso6 = caso6 + 1;
				}
			}
			
		i++;
		
		}
		
		System.out.println("O n�mero de pessoas calmas �: " + caso1);
		System.out.println("O n�mero de mulheres nervosas �:"  + caso2);
		System.out.println("O n�mero de homens agressivos �:"  + caso3); 
		System.out.println("O n�mero de outros calmos �:"  + caso4);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �:"  + caso5);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos �:"  + caso6);
	}
}
