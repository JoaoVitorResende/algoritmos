package Aula4;

import javax.swing.JOptionPane;

public class Atividade_1 {

	public static void main(String[] args) {
		String menu = "1 - Cadastro de eletrodomesticos \n " + "2 - listar \n" + "3 - quantidade de horas \n "
				+ "4 - sair ";
		int n = Integer.parseInt(JOptionPane.showInputDialog("quantos eletrodomesticos vai cadastrar ?"));
		String[] nome = new String[n];
		int[] consumo = new int[n];
		int op = 0;
		String r="";
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (op == 1) {
				for (int i = 0; i < consumo.length; i++) {
					nome[i] = JOptionPane.showInputDialog("nome do eltrodomestico");
					consumo[i] = Integer.parseInt(JOptionPane.showInputDialog("quantos em watts seria o consumo"));
				}
			}
			if (op == 2) {
				for (int i = 0; i < consumo.length; i++) {
					JOptionPane.showMessageDialog(null,
							"o eletro domestico : " + nome[i] + " tem consumo de watts de : " + consumo[i]);
				}
			}
			if (op == 3) {
				int h = Integer
						.parseInt(JOptionPane.showInputDialog("quantidade de horas que queres ver o consumo de watts"));
				for (int i = 0; i < consumo.length; i++) {
					int c = 0;
					
					double soma = 0;
					do {
						soma+=h*consumo[i];
						c++;
						r+="o eletro domestico : " + nome[i] + " tem consumo de watts de : " + soma +" dada o tempo de horas de uso de  : "+h+"\n";
					} while (c == h);
					
				}
				JOptionPane.showMessageDialog(null,r);
			}
		} while (op != 4);
	}

}
