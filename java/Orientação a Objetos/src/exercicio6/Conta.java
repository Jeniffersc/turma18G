package exercicio6;

public class Conta {
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;

	//Varios construtores para criar contas
	
	//Construtor - Tem o mesmo nome da class
	public Conta (int numero, String cpf, boolean ativa)
	{
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = true;
	}
	
	//Sobrecarga de Construtor
	public Conta (int numero)
	{
		this.numero = numero;
	}
	
	//Sobrecarga de Construtor
	public Conta (int numero, String cpf)
	{
		this.numero = numero;
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean getAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	//Metodos
	public void credito(double valor)
	{
		this.saldo = this.saldo + valor;
	}
	
	public void debito (double valor)
	{
		if(this.saldo >= valor)
		{
			this.saldo = this.saldo - valor;
		}
		else
		{
			System.out.println("Não é possível realizar");
		}
	}
	
}
