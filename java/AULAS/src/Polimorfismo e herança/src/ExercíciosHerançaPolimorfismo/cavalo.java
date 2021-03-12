package ExercíciosHerançaPolimorfismo;

public class cavalo extends animais {
	public cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void correr()
	{
		System.out.println(this.getNome() + " ESTÁ CORRENDO!!!");
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println(this.getNome() + ": HINN IN IN HINNNNNN IN IN!!!");
	}
}
