package ExercíciosHerançaPolimorfismo;

public class mainAnimais {

	/*
	 * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
		comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
		características de forma que tudo o que for comum a todos os animais fique na classe
		Animal:
		Implemente um programa que crie os 3 tipos de animais definidos no exercício
		anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
		é, independente do tipo de animal.
	 */
	
	public static void main(String[] args) {
		
		//Cachorro dog1 = new Cachorro("Nega", 1);
		cachorro dog1 = new cachorro("Nega", 1);
		dog1.correr();
		dog1.emitirSom();
		
		System.out.println();
		
		cavalo cav1 = new cavalo("Bruno", 15);
		cav1.correr();
		cav1.emitirSom();
		
		System.out.println();
		
		preguica preg1 = new preguica("Pi", 12);
		preg1.correr();
		preg1.emitirSom();
	}

}
