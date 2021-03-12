package ExercíciosCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Iterator;
import ExercíciosHerançaPolimorfismo.preguica;

public class mainEstoqueDeLoja {

	public static void main(String[] args) {
		/*
		 * Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
			trabalhar com Collection do tipo List do Java 
			para manipular os dados desse estoque, o
			programa deverá atender as seguintes funcionalidades:
			Armazenar dados da List
			Remover dados da list;
			Atualizar dados da list.
			Apresentar todos os dados da list.
		 */
	
			Locale.setDefault(Locale.US);
			Scanner leia = new Scanner(System.in);
				
			System.out.println("Digite a quantidade de funcionario: ");
			int quantidade = leia.nextInt();
				
			List <estoqueDeLoja> lista = new ArrayList<>();
			for(int x = 1; x<=quantidade;x++) {
				System.out.println(" Funcionario ou 2 terceiro");
				char tipo = leia.next().charAt(0);
					
				System.out.println("funcionario"+x);
					
				System.out.println("Nome");
				String nome = leia.next();
				System.out.println("Quantidade");
				int matricula = leia.nextInt();
				
				
			}
				
				
				
			}
		}