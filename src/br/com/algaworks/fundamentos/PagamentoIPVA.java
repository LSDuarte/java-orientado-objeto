package br.com.algaworks.fundamentos;

import java.util.Scanner;

public class PagamentoIPVA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o final da placa: ");
		int finalPlaca = sc.nextInt();

		switch (finalPlaca) {
		case 1:
			System.out.println("Vencimento dia 11 de Janeiro.");
			break;
		case 2:
			System.out.println("Vencimento dia 12 de Janeiro.");
			break;
		default:
			System.out.println("Não há data confirmada!");
			break;
		}
	}
}