package br.com.orcamentoDomestico.modelo;

import javax.swing.JOptionPane;

public class Lazer extends Gastos{
	private double festas = Double.parseDouble(JOptionPane.showInputDialog("Digite os gastos com a festa"));
	private double cinema = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cinema"));
	private double jogos = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dos jogos"));
	double totalLazer;
	
	public double getFestas() {
		return festas;
	}
	public void setFestas(double festas) {
		this.festas = festas;
	}
	public double getCinema() {
		return cinema;
	}
	public void setCinema(double cinema) {
		this.cinema = cinema;
	}
	public double getJogos() {
		return jogos;
	}
	public void setJogos(double jogos) {
		this.jogos = jogos;
	}
	
	@Override
	public void valorTotal(){
		totalLazer = (this.festas + this.cinema + this.jogos);
	}
}
