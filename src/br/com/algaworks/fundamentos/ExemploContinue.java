package br.com.algaworks.fundamentos;

import java.util.Scanner;

public class ExemploContinue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int divisor = sc.nextInt();

		for (int i = 100; i <= 120; i++) {
			if (i % divisor == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Fim do programa");
	}
}