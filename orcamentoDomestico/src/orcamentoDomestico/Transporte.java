package orcamentoDomestico;

import javax.swing.JOptionPane;

public class Transporte extends Gastos{
	private double carro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dos gastos com o carro"));
	private double onibus = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dos gastos com onibus"));
	
	public double getCarro(){
		return carro;
	}
	
 void setCarro(double carro) {
		this.carro = carro;
		
	}
}
 