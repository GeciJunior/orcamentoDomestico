package br.com.orcamentoDomestico.view;

import javax.swing.JOptionPane;

import br.com.orcamentoDomestico.modelo.Casa;
import br.com.orcamentoDomestico.modelo.Usuario;

public class TestaOrcamento {

	public static void main(String[] args) {
		Usuario us = new Usuario();
		us.getNome();

		Casa cs = new Casa();
		cs.valorTotal();
				
		JOptionPane.showMessageDialog(null, "Nome: " +us.getNome()+
											"\nAluguel: " + cs.getAluguel()+
											"\n¡gua: " + cs.getAgua()+
											"\nLuz: " + cs.getLuz()+
										    "\nTotal: " + cs.totalCasa);
		
	}
}
