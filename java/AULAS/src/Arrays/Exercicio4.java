package Arrays;

import java.util.Scanner;
import java.util.Random;

public class Exercicio4 {
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner (System.in); 
		
		int matriz [][]= new int [3][3];
		int soma=0, somaDiag=0;
	
		for (int i=0; i<3; i++) //linha
		{
			for (int j=0; j<3; j++) //coluna
			{
				System.out.println("Digite o valor da linha "+ (i+1)+ " e da coluna "+ (j+1)+ ":");
				matriz[i][j] = ler.nextInt();
				soma += (matriz[i][j]);
				if ((i==0 && j==0) || (i==1 && j==1) || (i==2 && j==2))
				{
					somaDiag += (matriz[i][j]);
				}
			}
		}
		
		System.out.println("A matriz é: ");
		for (int i=0; i<3; i++) //linha
		{
			for (int j=0; j<3; j++) //coluna
			{
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
			System.out.println("A soma é: "+ soma);
			System.out.println("A soma dos valores da primeira diagonal, ou seja, diagonal principal é: "+ somaDiag);
	
	}
	
	/*
	 * programa
	{
		funcao inicio()
		{
			/*
			 *4 - Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
			 * e em seguida, 
			 * exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
			 * ou seja, diagonal principal.
			 
			 inteiro matriz[3][3], soma=0, somaDiag=0
	
			para (inteiro i=0; i<3; i++) //linha
			{
				para (inteiro j=0; j<3; j++) //coluna
				{
					escreva("Digite o valor da linha ", i+1, " e da coluna ", j+1, ":")
					leia(matriz[i][j])
					soma += (matriz[i][j])
					se (i==0 e j==0 ou i==1 e j==1 ou i==2 e j==2)
					{
						somaDiag += (matriz[i][j])
					}
				}
			}
				escreva("A soma é: ", soma, "\n")
				escreva("A soma dos valores da primeira diagonal, ou seja, diagonal principal é:", somaDiag)
			}
		}
	 */
}

