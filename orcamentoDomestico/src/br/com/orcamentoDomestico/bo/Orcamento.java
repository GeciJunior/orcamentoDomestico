package br.com.orcamentoDomestico.bo;

import br.com.orcamentoDomestico.modelo.Gastos;

public class Orcamento{
	private Gastos gastos;
	
	public Orcamento(Gastos gastos){
		this.setGastos(gastos);
	}

	public Gastos getGastos() {
		return gastos;
	}

	public void setGastos(Gastos gastos) {
		this.gastos = gastos;
	}
}
