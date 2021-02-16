package br.com.algaworks.fundamentos;

import java.util.Scanner;

public class EstruturaDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor = 0;
		int soma = 0;

		do {
			System.out.println("Digite 0 para sair ou qualquer número para somar.");
			valor = sc.nextInt();
			soma += valor;
			System.out.println("Soma: " + soma);
		} while (valor != 0);
	}
}