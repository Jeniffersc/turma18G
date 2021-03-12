package exercicio2;

public class Aviao {
	private String nome;
	private int passageiros;
	private boolean voo;
	
	public Aviao(String nome, int passageiros, boolean voo) {
		this.nome = nome;
		this.passageiros = passageiros;
		this.voo = voo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public boolean isVoo() {
		return voo;
	}

	public void setVoo(boolean voo) {
		this.voo = voo;
	}
	
	public void entrouPassageiro (int passageiros)
	{
		this.passageiros += passageiros;
		System.out.println("Entrou " + passageiros + " passageiro(s)");
	}
	
	public void saiuPassageiro (int passageiros)
	{
		this.passageiros -= passageiros;
		System.out.println("Saiu " + passageiros + " passageiro(s)");
	}
	
	public void voando (boolean voo)
	{
		if (this.voo == true) {
			System.out.println("O avião esta voando!");
		}
		else 
		{
			System.out.println("O avião não esta voando ainda!");
		}
	}
}
