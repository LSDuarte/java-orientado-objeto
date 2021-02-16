package br.com.algaworks.fundamentos;

import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número inicial: ");
		int numeroInicial = sc.nextInt();

		System.out.print("Digite o número final: ");
		int numeroFinal = sc.nextInt();

		int numeroAtual = numeroInicial;

		while (numeroAtual <= numeroFinal) {
			System.out.println(numeroAtual);
			numeroAtual++;
		}
	}

}