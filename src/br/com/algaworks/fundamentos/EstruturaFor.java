package br.com.algaworks.fundamentos;

import java.util.Scanner;

public class EstruturaFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ultimo número: ");
		int numeroFinal = sc.nextInt();

		for (int i = 1; i <= numeroFinal; i++) {
			System.out.println(i);
		}
	}
}