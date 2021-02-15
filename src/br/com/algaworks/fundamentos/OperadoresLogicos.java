package br.com.algaworks.fundamentos;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Peso: ");
		int peso = sc.nextInt();

		System.out.print("Altura: ");
		double altura = sc.nextDouble();

		System.out.print("Informe o Sexo (1 para 'M' ou 2 para 'F'): ");
		char sexo = sc.nextShort() == 1 ? 'M' : 'F';

		double imc = peso / (altura * altura);

		switch (sexo) {
		case 'F':
			if (imc < 19.1) {
				System.out.println(imc + " : Abaixo do peso");
			} else if (imc < 25.9) {
				System.out.println(imc + " : No peso ideal");
			} else if (imc < 27.4) {
				System.out.println(imc + " : Um pouco acima do peso");
			} else if (imc < 32.3) {
				System.out.println(imc + " : Acima do peso ideal");
			} else {
				System.out.println(imc + " : Obeso");
			}
			break;
		case 'M':
			if (imc < 20.7) {
				System.out.println(imc + " : Abaixo do peso");
			} else if (imc < 26.4) {
				System.out.println(imc + " : No peso ideal");
			} else if (imc < 27.8) {
				System.out.println(imc + " : Um pouco acima do peso");
			} else if (imc < 31.1) {
				System.out.println(imc + " : Acima do peso ideal");
			} else {
				System.out.println(imc + " : Obeso");
			}
			break;
		default:
			break;
		}

	}

}