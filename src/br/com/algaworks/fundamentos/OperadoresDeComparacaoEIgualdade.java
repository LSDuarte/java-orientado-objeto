package br.com.algaworks.fundamentos;

public class OperadoresDeComparacaoEIgualdade {
	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		int c = 2;

		boolean maior = b > a;
		boolean maiorOuIgual = b >= a;
		boolean menor = a < b;
		boolean menorOuIgual = a <= 10;
		boolean igual = a == b - c;
		boolean diferente = a != c;

		System.out.println(maior);
		System.out.println(maiorOuIgual);
		System.out.println(menor);
		System.out.println(menorOuIgual);
		System.out.println(igual);
		System.out.println(diferente);
		
		boolean bloqueado = true;
		bloqueado = !bloqueado;
		System.out.println(bloqueado);

	}
}