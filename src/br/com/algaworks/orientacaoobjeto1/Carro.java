package br.com.algaworks.orientacaoobjeto1;

public class Carro {
	String fabricante;
	String modelo;
	String cor;
	public int anoDeFabricacao;
	boolean biCombustivel;

	Proprietario dono;

	void ligar() {
		if (modelo != null) {
			System.out.println("Ligando o carro: " + modelo);
		}
	}
}