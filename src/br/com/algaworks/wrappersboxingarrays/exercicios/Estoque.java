package br.com.algaworks.wrappersboxingarrays.exercicios;

import br.com.algaworks.orientacaoobjeto1.Produto;

public class Estoque {
	public Produto[] produtos;

	public void listarProdutos() {
		System.out.println("\nProdutos em estoque");
		System.out.println("------------------------");

		for (int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
		}
	}

}