package exercicio1;

import java.util.Scanner;

public class Cliente 
	{
		private String nome;
		private int idade;
		private boolean ativo;
		
		public Cliente(String nome, int idade, boolean ativo) {
			this.nome = nome;
			this.idade = idade;
			this.ativo = ativo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public boolean isAtivo() {
			return ativo;
		}
		public void setAtivo(boolean ativo) {
			this.ativo = ativo;
		}
		
		public void comprar (boolean ativo)
		{
			System.out.println("O cliente " + this.getNome() + " é ativo!");
		}
		
		public void maiorDeIdade (int idade)
		{
			if(this.idade >= 18)
			{
				System.out.println("Parabéns você pode comprar!");
			}
			else
			{
				System.out.println("Chame sua mãe");
			}
		}
	}
