package Desafio;

import javax.swing.JOptionPane;

public class Atividade3 {

	public static void main(String[] args) {
		String[] nome = new String[100];
		String[] contato = new String[100];
		int quantidade = 0;
		String menu = " 1 - cadastrar \n" + " 2 - busca nome \n" + " 3 - busca contato\n" + " 4 - sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (op == 1) {
				if (quantidade < 100) {
					nome[quantidade] = JOptionPane.showInputDialog("ponha o nome");
					contato[quantidade] = JOptionPane.showInputDialog("ponha o contato");
					quantidade++;
				} else {
					JOptionPane.showMessageDialog(null, "passou do limite");
				}

			}
			if (op == 2) {
				String r = "não encontrado";
				String busca = JOptionPane.showInputDialog("ponha o nome que busca ");
				for (int i = 0; i < quantidade; i++) {
					if (nome[i].equalsIgnoreCase(busca)) {
						r = nome[i];
					}
				}
				JOptionPane.showMessageDialog(null,"encontrado : "+r);
			}
			if (op == 3) {
				String re = "não encontrado";
				String buscaC = JOptionPane.showInputDialog("numero que deseja procurar");
				for (int i = 0; i <quantidade; i++) {
					if (contato[i].equalsIgnoreCase(buscaC)) {
						re = contato[i];
					}
				}
				JOptionPane.showMessageDialog(null, "encontrado : "+re);
			}
		} while (op != 4);
	}

}
