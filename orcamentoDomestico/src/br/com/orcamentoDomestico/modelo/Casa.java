package br.com.orcamentoDomestico.modelo;

import javax.swing.JOptionPane;

public class Casa extends Gastos{
	private double aluguel = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do aluguel"));
	private double agua = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da agua"));
	private double luz = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da luz"));
	public double totalCasa;
	
	public double getAluguel() {
		return aluguel;
	}

	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}

	public double getAgua() {
		return agua;
	}

	public void setAgua(double agua) {
		this.agua = agua;
	}

	public double getLuz() {
		return luz;
	}

	public void setLuz(double luz) {
		this.luz = luz;
	}
	
	@Override
	public void valorTotal(){
		totalCasa = (this.aluguel + this.agua + this.luz);
	}
}