package orcamentoDomestico;

import javax.swing.JOptionPane;

public class TestaOrcamento {

	public static void main(String[] args) {
		Usuario us = new Usuario();
		us.getNome();

		JOptionPane.showMessageDialog(null,"Nome: " +us.getNome());
	}

}
