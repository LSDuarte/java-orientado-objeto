package br.com.algaworks.orientacaoobjeto1;

public class Principal5 {
	public static void main(String[] args) {
		Preco preco = new Preco();
		preco.valorCustos = 140;

		Produto produto = new Produto();
		produto.definirPreco(preco, 20, 15);

		System.out.println("Valor Custo: " + preco.valorCustos);
		System.out.println("Valor Impostos: " + preco.valorImpostos);
		System.out.println("Valor Lucro: " + preco.valorLucro);
		System.out.println("Preço Venda: " + preco.precoVenda);
	}
}
