package Dia25Fev;
import java.util.Scanner;

public class ClassificarNadadores {
	public static void main (String[] args)
	{
		/*
		 * programa
		{
		
		    funcao inicio()
		    {
		        //OBJETIVO
		        
		         * 6) Elabore um sistema que dada a idade de um nadador 
		         * classifique-o em uma das seguintes categorias:
		            Infantil A = 5 a 7 anos
		            Infantil B = 8 a 11 anos
		            Juvenil A = 12 a 13 anos
		            Juvenil B = 14 a 17 anos
		            Adultos = Maiores de 18 anos
		         
		        //INICIO
		        //VARIAVEIS
		        inteiro idadeNadador  //camelCase
		
		        //ENTRADAS
		        escreva("Digite a idade do nadador: ")
		        leia(idadeNadador)
		
		
		
		        //PROCESSAMENTOS//saidas
		        se (idadeNadador < 5) //me julguem
		        {
		            //saida
		            escreva("Infelizmente n�o podemos atender!\n")
		        }
		        senao se (idadeNadador <=7)
		        {
		             escreva("Infantil A = 5 a 7 anos\n")
		        } 
		        senao se(idadeNadador <=11)
		        {
		            escreva("Infantil B = 8 a 11 anos\n")
		        }
		        senao se(idadeNadador <=13)
		        {
		            escreva("Juvenil A = 12 a 13 anos\n")
		        }
		        senao se(idadeNadador <=17)
		        {
		            escreva("Juvenil B = 14 a 17 anos\n")
		        }
		        senao
		        {
		            escreva("Adultos = Maiores de 18 anos\n")
		        }
		        //SAIDAS
		        escreva("OBRIGADO, VOLTE SEMPRE!")
		        //FIM
		
		    }
		}
		*/
		
		Scanner ler = new Scanner(System.in);
		
		int idadeNadador;
		
		System.out.println("Digite a idade do nadador: ");
        idadeNadador = ler.nextInt();
        
        if (idadeNadador < 5) //me julguem
        {
            //saida
        	System.out.println("Infelizmente n�o podemos atender!\n");
        }
        else if (idadeNadador <=7)
        {
        	System.out.println("Infantil A = 5 a 7 anos\n");
        } 
        else if(idadeNadador <=11)
        {
        	System.out.println("Infantil B = 8 a 11 anos\n");
        }
        else if(idadeNadador <=13)
        {
        	System.out.println("Juvenil A = 12 a 13 anos\n");
        }
        else if(idadeNadador <=17)
        {
        	System.out.println("Juvenil B = 14 a 17 anos\n");
        }
        else 
        {
        	System.out.println("Adultos = Maiores de 18 anos\n");
        }
        
        System.out.println("OBRIGADO, VOLTE SEMPRE!");
	}
}