package LacosDeRepeticao;
import java.util.Scanner;

public class Desafio2 {
	public static void main (String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		int numero = 0, maiorNumero = 0;
	    
	    do{
	        System.out.println("Digite um número");
	        numero = ler.nextInt();
	        
	        if (numero > maiorNumero) 
	        {
	            maiorNumero = numero;
	        }
	        
	    }while(numero >= 0);
	    
	    System.out.printf("O maior número é %d", maiorNumero);

	}
}
