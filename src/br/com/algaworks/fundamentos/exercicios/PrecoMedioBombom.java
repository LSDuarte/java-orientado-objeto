package br.com.algaworks.fundamentos.exercicios;

public class PrecoMedioBombom {
	public static void main(String[] args) {
		int preco1 = 5;
		int preco2 = 8;
		int preco3 = 12;
		
		int mediaPrecos = (preco1 + preco2 + preco3) / 3;
		System.out.println("\"Sistema de Calculo de Media\"");
		System.out.println("Preço 1: " + preco1);
		System.out.println("Preço 2: " + preco2);
		System.out.println("Preço 3: " + preco3);
		System.out.println("\nMedia dos Preço:\n" + mediaPrecos);
	}
}