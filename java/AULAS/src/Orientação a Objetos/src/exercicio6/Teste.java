package exercicio6;

import java.util.Scanner;

public class Teste 
{
	public static void main(String[] args)
	{
		/*
		 * 6) Crie uma classe conta bancaria e apresente os atributos e métodos
			referentes esta classe, em seguida crie um objeto conta bancaria, defina
			as instancias deste objeto e apresente as informações deste objeto no
			console.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		double valor;
		char opcao;
		
		Conta conta3 = new Conta(0, "545.645", true);
		
		conta3.credito(0);
		
		System.out.println("Digite o valor: ");
		valor = ler.nextDouble();
		System.out.println("Débito ou Crédito");
		opcao = ler.next().toUpperCase().charAt(0);
		
		if (opcao == 'D')
		{
			conta3.debito(valor);
		}
		else if (opcao == 'C')
		{
			conta3.credito(valor);
		}
		else 
		{
			System.out.println("A opção é inválida!");
		}
		
		System.out.println("O saldo é: " + conta3.getSaldo());
	}
}
