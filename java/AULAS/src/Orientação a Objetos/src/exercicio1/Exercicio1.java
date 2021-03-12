package exercicio1;

import java.util.Scanner;

public class Exercicio1 
{
	public static void main (String[] args) 
	{	
		/*
		 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
			esta classe, em seguida crie um objeto cliente, defina as instancias deste
			objeto e apresente as informações deste objeto no console.
		 */
		Scanner ler = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente("Bruno", 29, true);
		System.out.println(cliente1.getNome() + " sua idade é " + cliente1.getIdade());
		
		cliente1.comprar(cliente1.isAtivo());
		cliente1.maiorDeIdade(cliente1.getIdade());
		
		/*
		cliente1.setNome("Bruno");
		System.out.println("Nome: "+ cliente1.getNome());
		
		cliente1.setIdade(29);
		System.out.println("Idade: " + cliente1.getIdade());
		
		cliente1.comprar(true);
		cliente1.maiorDeIdade(cliente1.getIdade());
		 */
	
	}
}
