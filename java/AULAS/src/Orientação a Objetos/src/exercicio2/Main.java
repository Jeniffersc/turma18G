package exercicio2;

import java.io.Console;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Aviao aviao1 = new Aviao("Atom", 100, true);
		aviao1.entrouPassageiro(10);
		aviao1.saiuPassageiro(5);
		
		System.out.println(aviao1.getNome());
		System.out.println("O total de passageiros é: " + aviao1.getPassageiros());
		aviao1.voando(aviao1.isVoo());
	}
}
