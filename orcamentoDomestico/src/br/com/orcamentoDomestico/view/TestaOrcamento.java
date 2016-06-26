package br.com.orcamentoDomestico.view;

import javax.swing.JOptionPane;
import br.com.orcamentoDomestico.modelo.*;

public class TestaOrcamento{

	public void opcaoGastos(){
		int opcao;
		do {
		
		JOptionPane.showMessageDialog(null, "Digite a opção do gasto: \n1 Casa"
																	+"\n2 Alimentação"
																	+"\n3 Educação"
																	+"\n4 Lazer"
																	+"\n5 Transporte"
																	+"\n6 Extra"
																	+"\n7 Sair");
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Opção: "));
		
		switch(opcao){
		case 1:
			Casa cs = new Casa();
			cs.valorTotal();
					
			JOptionPane.showMessageDialog(null, "\nAluguel: " + cs.getAluguel()+
												"\nÁgua: " + cs.getAgua()+
												"\nLuz: " + cs.getLuz()+
											    "\nTotal: " + cs.totalCasa);
			break;
		case 2:
			Alimentacao al = new Alimentacao();
			al.valorTotal();
			
			JOptionPane.showMessageDialog(null, "\nCafé da manhã: " + al.getCafeDaManha()+
												"\nAlmoço: " + al.getAlmoco()+
												"\nJantar: " + al.getJantar()+
												"\nLanche: " + al.getLanche()+
												"\nTotal: " + al.totalAlimentacao);
			break;
		case 3:
			Educacao edu = new Educacao();
			edu.valorTotal();
			
			JOptionPane.showMessageDialog(null, "\nEscola: " + edu.getEscola()+
												"\nCurso: " + edu.getCurso()+
												"\nTotal" + edu.totalEducacao);
			break;
		case 4:
			Lazer lz = new Lazer();
			lz.valorTotal();
			
			JOptionPane.showMessageDialog(null, "\nFestas: " + lz.getFestas()+
												"\nCinema: " + lz.getCinema()+
												"\nJogos: " + lz.getJogos()+
												"\nTotal: " + lz.totalLazer);
			break;
		case 5:
			Transporte trans = new Transporte();
			trans.valorTotal();
			
			JOptionPane.showMessageDialog(null, "\nCarro: " + trans.getCarro()+
												"\nOnibus: " + trans.getOnibus()+
												"\nTotal: " + trans.totalTransporte);
			break;
		case 6:
			DespesasExtras despesas = new DespesasExtras();
			despesas.valorTotal();
			
			JOptionPane.showMessageDialog(null, "\nDespesa: " + despesas.getTipo()+
												"\nValor: " + despesas.getValor());
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Sem mais gastos a informar");
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				break;			
		}
	}while (opcao != 7);
}	
	
	
	public static void main(String[] args) {
		Usuario us = new Usuario();
		us.getNome();
		TestaOrcamento teste = new TestaOrcamento();
		teste.opcaoGastos();
	}
}
