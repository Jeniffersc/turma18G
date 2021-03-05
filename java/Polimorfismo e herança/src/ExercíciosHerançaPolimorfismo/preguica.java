package ExercíciosHerançaPolimorfismo;

public class preguica extends animais {
	public preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void correr()
	{
		System.out.println(this.getNome() + " ESTÁ SUBINDO NA ÁRVORE!!!");
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println(this.getNome() + " SE ESPREGUIÇOU!!!");
	}
}
