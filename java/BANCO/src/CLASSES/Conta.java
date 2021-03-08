package CLASSES;

public class Conta 
{
	//atributos
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;
	
	//construtor
	public Conta(int numero, String cpf)
	{
		this.numero = numero;
		this.cpf = cpf;
	}
	
	//sobrecarga do construtor
	public Conta(int numero)
	{
		this.numero = numero;
	}

	public Conta(int numero, String cpf, boolean ativa) 
	{
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}

	//encapsulamento
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

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//metodos
	public void credito(double valor) 
	{
		this.saldo += valor;
	}
	
	public void debito(double valor) 
	{
		if(this.saldo>=valor) 
		{
		this.saldo -= valor;
		}
		else
		{
			System.out.print("SALDO INSUFICIENTE");
		}	
	}
}