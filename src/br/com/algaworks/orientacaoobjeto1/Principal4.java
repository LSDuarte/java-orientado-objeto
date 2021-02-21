package br.com.algaworks.orientacaoobjeto1;

public class Principal4 {
	public static void main(String[] args) {
		FolhaDePagamento folha = new FolhaDePagamento();
		double salario = folha.calculaSalario(160, 12, 32.5, 40.2);
		System.out.println("Salário calculado: " + salario);
	}
}