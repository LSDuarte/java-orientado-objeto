package br.com.algaworks.wrappersboxingarrays;

import br.com.algaworks.orientacaoobjeto1.Carro;

public class TestaArrayComCarro {
	public static void main(String[] args) {
		
		Carro[] carros = new Carro[4];
		carros[0] = new Carro();
		carros[0].anoDeFabricacao = 2014;
		
		System.out.println("Ano fabricação: " + carros[0].anoDeFabricacao);
	}
}