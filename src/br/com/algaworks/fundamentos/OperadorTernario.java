package br.com.algaworks.fundamentos;

import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();

		String indicacao = (idade >= 18) ? "adulto" : (idade <=12) ? "crianca" : "crianca/adolencente";
		
		/*if (idade >= 18) {
			indicacao = "adulto";
		} else {
			indicacao = "crianca/adolencente";
		}*/
		
		System.out.println("Resultado: " + indicacao);
	}
}