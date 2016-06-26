package br.com.orcamentoDomestico.modelo;

import javax.swing.JOptionPane;

public class DespesasExtras extends Gastos{
	private String tipo = JOptionPane.showInputDialog("Digite o tipo de despesa");
	private double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
	public double totalDespesasExtras;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public void valorTotal() {
		totalDespesasExtras = this.valor;
	}
}
