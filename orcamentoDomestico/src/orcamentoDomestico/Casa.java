package orcamentoDomestico;

import javax.swing.JOptionPane;

public class Casa extends Gastos {
	double aluguel = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do aluguel"));
	double agua = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da agua"));
	double luz = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da luz"));
	
	
}
