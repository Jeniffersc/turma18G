package Exerc�ciosHeran�aPolimorfismo;

public class preguica extends animais {
	public preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void correr()
	{
		System.out.println(this.getNome() + " EST� SUBINDO NA �RVORE!!!");
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println(this.getNome() + " SE ESPREGUI�OU!!!");
	}
}
