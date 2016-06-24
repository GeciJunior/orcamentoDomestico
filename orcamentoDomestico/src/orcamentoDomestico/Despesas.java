package orcamentoDomestico;

import javax.swing.JOptionPane;

public class Despesas {
	private String tipo = JOptionPane.showInputDialog("Digite o tipo de despesa");
	private double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
	private double saldo;
	
		Despesas(String tipo, double valor) {
			this.tipo = tipo;
			this.valor = valor;
		}
			
		public void totalizar(double saldoAtual){
			saldoAtual += valor;
		}
	}
