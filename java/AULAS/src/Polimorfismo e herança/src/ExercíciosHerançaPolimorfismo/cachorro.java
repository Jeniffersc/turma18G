package Exerc�ciosHeran�aPolimorfismo;

public class cachorro extends animais {
	
	public cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void correr()
	{
		System.out.println(this.getNome() + " EST� CORRENDO!!!");
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println(this.getNome() + ": AUAUAAUAUAUAUAUAUAUAUAUAUAUAUAUAUAU!!!");
	}
}
