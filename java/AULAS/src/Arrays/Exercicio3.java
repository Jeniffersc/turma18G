package Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
	public static void main (String[] args) {
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
			das matrizes N1 e N2;
			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
			posição das matrizes N1 e N2.
		 */
		
		Scanner ler = new Scanner (System.in); 
		
		int N1 [][]= new int [4][6];
		int N2 [][]= new int [4][6];
		int M1 [][]= new int [4][6];
		int M2 [][]= new int [4][6];
		
		Random random = new Random(); 
		
		System.out.println("Matriz N1");
		for (int i=0; i<4;i++) //4 linhas
		{
			for (int j=0; j<6; j++) //coluna
			{
				N1[i][j] = random.nextInt(10); //gera um número aleatório de 0-9 
				System.out.print(N1[i][j] + " \t ");
			}
			System.out.println();
		}
		
		System.out.println("Matriz N2");
		for (int i=0; i<4;i++) //4 linhas
		{
			for (int j=0; j<6; j++) //coluna
			{
				N2[i][j] = random.nextInt(10); //gera um número aleatório de 0-9 
				System.out.print(N2[i][j] + " \t ");
			}
			System.out.println();
		}
		
		//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
		System.out.println("Matriz M1 - Soma de N1 e N2");
		for (int i=0; i<4; i++) //linha
		{
			for (int j=0; j<6; j++) //coluna
			{
				M1[i][j] = N1[i][j] + N2[i][j];
				System.out.print(M1[i][j] + " \t ");
			}
			System.out.println();
		}
		
		//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
		System.out.println("Matriz M2 - Diferença entre N1 e N2");
		for (int i=0; i<4; i++) //linha
		{
			for (int j=0; j<6; j++) //coluna
			{
				M2[i][j] = N1[i][j] - N2[i][j];
				System.out.print(M2[i][j] + "  \t");
			}
			System.out.println();
		}
		
		/*
		for (int i=0; i<4; i++) //linha
		{
			for (int j=0; j<6; j++) //coluna
			{
				System.out.println("Matriz N1: Digite o valor da linha "+ (i+1)+ " e da coluna "+ (j+1)+ ":");
				N1[i][j] = ler.nextInt();
			}
		}

		for (int i=0; i<4; i++) //linha
		{
			for (int j=0; j<6; j++) //coluna
			{
				System.out.println("Matriz N2: Digite o valor da linha "+ (i+1)+ " e da coluna "+ (j+1)+ ":");
				N2[i][j] = ler.nextInt();
			}
		}

		//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
		for (int i=0; i<4; i++) //linha
		{
			for (int j=0; j<6; j++) //coluna
			{
				M1[i][j] = N1[i][j] + N2[i][j];
				System.out.println("A soma dos valores da linha "+ (i+1)+ " e da coluna "+ (j+1)+ " é:" + M1[i][j]);
			}
		}

		//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
		for (int i=0; i<4; i++) //linha
		{
			for (int j=0; j<6; j++) //coluna
			{
				M2[i][j] = N1[i][j] - N2[i][j];
				System.out.println("A diferença dos valores da linha "+ (i+1)+ " e da coluna "+ (j+1)+ " é:" + M2[i][j]);
			}
		}
		*/

	}
}

