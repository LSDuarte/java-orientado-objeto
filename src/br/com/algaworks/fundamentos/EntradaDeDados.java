package br.com.algaworks.fundamentos;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("################# CALCULO DO IMC #################");

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Peso: ");
		int peso = sc.nextInt();

		System.out.print("Altura: ");
		double altura = sc.nextDouble();

		Double imc = peso / (altura * altura);
		System.out.println("IMC de " + nome.toUpperCase() + ": " + imc);

		if (imc < 18.5) {
			System.out.println("Status: Abaixo do Peso Ideal!");
		} else if (imc < 25) {
			System.out.println("Status: Peso Ideal");
		} else if (imc < 30) {
			System.out.println("Status: Acima do Peso");
		} else if (imc < 40) {
			System.out.println("Status: Obesidade Grau 1 ou 2");
		} else {
			System.out.println("Status: Obesidade Grau 3");
		}
	}
}