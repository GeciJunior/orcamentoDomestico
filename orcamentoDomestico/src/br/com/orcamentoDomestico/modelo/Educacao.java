package br.com.orcamentoDomestico.modelo;

import javax.swing.JOptionPane;

public class Educacao extends Gastos{
	private double escola = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da escola"));
	private double curso = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do curso"));
	double totalEducacao;
	
	public double getEscola() {
		return escola;
	}
	public void setEscola(double escola) {
		this.escola = escola;
	}
	public double getCurso() {
		return curso;
	}
	public void setCurso(double curso) {
		this.curso = curso;
	}
	
	@Override
	public void valorTotal(){
		totalEducacao = (this.escola + this.curso);
		//super.valorTotal();
	}
}
