package orcamentoDomestico;

import javax.swing.JOptionPane;

public class Usuario {
	private String nome = JOptionPane.showInputDialog("Digite o nome do usuario");
	private String cpf = JOptionPane.showInputDialog("Digite o cpf");
	private int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula"));
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public int getMatricula() {
		return matricula;
	}
	
	
}
