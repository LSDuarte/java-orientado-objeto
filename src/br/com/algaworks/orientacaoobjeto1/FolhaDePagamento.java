package br.com.algaworks.orientacaoobjeto1;

public class FolhaDePagamento {

	double calculaSalario(int horasNormais, int horasExtras, double valorHoraNormal, double valorHoraExtra) {
		double valorHorasNormais = horasNormais * valorHoraNormal;
		double valorHorasExtras = horasExtras * valorHoraExtra;
		return valorHorasNormais + valorHorasExtras;
	}
}