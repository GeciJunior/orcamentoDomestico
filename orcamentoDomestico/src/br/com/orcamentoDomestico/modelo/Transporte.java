package br.com.orcamentoDomestico.modelo;

import javax.swing.JOptionPane;

public class Transporte extends Gastos{
	private double carro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dos gastos com o carro"));
	private double onibus = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dos gastos com onibus"));
	double totalTransporte;
	
	public double getCarro(){
		return carro;
	}
	
	public void setCarro(double carro) {
		this.carro = carro;
	}
 
 	public double getOnibus(){
 		return onibus;
 	}
 	
 	public void setOnibus(double onibus){
 		this.onibus = onibus;
 	}
 	
 	@Override
 	public void valorTotal(){
 		totalTransporte = (this.carro + this.onibus);
 	}
}
 