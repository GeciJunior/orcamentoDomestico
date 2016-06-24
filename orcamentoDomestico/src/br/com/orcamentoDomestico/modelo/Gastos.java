package br.com.orcamentoDomestico.modelo;

import br.com.orcamentoDomestico.util.exceptions.ValorInvalidoException;

public abstract class Gastos{
	protected Gastos gastos;
	
	public abstract void valorTotal() throws ValorInvalidoException;
	
}
