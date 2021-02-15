package br.com.algaworks.fundamentos;

import java.util.Scanner;

public class Escopo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = sc.nextInt();

		boolean podeDirigir = idade >= 18;
		String nomePai = "";

		if (!podeDirigir) {
			System.out.print("Nome do Pai: ");
			nomePai = sc.next();
		}

		System.out.println("Você pode dirigir?");

		if (podeDirigir) {
			System.out.println("Sim, claro!");
		} else {
			System.out.println("Não, se fizer isso, seu pai " + nomePai + " vai preso");
		}
	}
}