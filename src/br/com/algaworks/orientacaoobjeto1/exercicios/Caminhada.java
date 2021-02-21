package br.com.algaworks.orientacaoobjeto1.exercicios;

public class Caminhada {
	public void andar(Pessoa pessoa) {
		System.out.println("Eu \"" + pessoa.nome + "\"" + " estou andando com o \"" + pessoa.cachorro.nome + "\"");
	}
}