package orcamentoDomestico;

import javax.swing.JOptionPane;

public class Alimentacao extends Gastos{
	private double cafeDaManha = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do café da manhã"));
	private double almoco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do almoço"));
	private double jantar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da janta"));
	private double lanche = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lanche"));
	double totalAlimentacao;
	
	public double getCafeDaManha() {
		return cafeDaManha;
	}
	public void setCafeDaManha(double cafeDaManha) {
		this.cafeDaManha = cafeDaManha;
	}
	public double getAlmoco() {
		return almoco;
	}
	public void setAlmoco(double almoco) {
		this.almoco = almoco;
	}
	public double getJantar() {
		return jantar;
	}
	public void setJantar(double jantar) {
		this.jantar = jantar;
	}
	public double getLanche() {
		return lanche;
	}
	public void setLanche(double lanche) {
		this.lanche = lanche;
	}
	
	@Override
	public void valorTotal(){
		totalAlimentacao = (this.cafeDaManha + this.almoco + this.jantar + this.lanche);
	}
	
}
