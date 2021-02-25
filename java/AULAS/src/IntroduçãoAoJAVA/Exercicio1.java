package IntroduçãoAoJAVA;
import java.util.Scanner;

public class Exercicio1 
{
	public static void main (String[] args)
	{
		/*
		 * Faça um sistema que leia a idade de uma pessoa 
		 * expressa em anos, meses e dias e mostre-a expressa 
		 * apenas em dias
		 */
		
		Scanner ler = new Scanner(System.in);
		int anos, dias, meses, anosEmDias, mesesEmDias, somaDias;
		
		System.out.println("Digite quantos anos você tem: ");
		anos = ler.nextInt();
		System.out.println("Digite quantos meses você tem: ");
		meses = ler.nextInt();
		System.out.println("Digite quantos dias você tem: ");
		dias = ler.nextInt();
		
		anosEmDias = anos * 365;
		mesesEmDias = meses * 31;

		somaDias = anosEmDias + mesesEmDias + dias ;
		System.out.println("Você tem "+ somaDias+ " dias de vida");
	}
}
