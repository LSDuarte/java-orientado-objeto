package br.com.algaworks.orientacaoobjeto1;

public class Principal {
	public static void main(String[] args) {
		Carro meuCarro = new Carro(); 
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Prata";
		
		Carro seuCarro = new Carro();
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Fit";
		seuCarro.anoDeFabricacao = 2014;
		seuCarro.cor = "Preto";
		
		System.out.println("Meu Carro");
		System.out.println("-----------------------");
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano: " + meuCarro.anoDeFabricacao);
		
		System.out.println();
		System.out.println("Seu Carro");
		System.out.println("-----------------------");
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Ano: " + seuCarro.anoDeFabricacao);
	}
}