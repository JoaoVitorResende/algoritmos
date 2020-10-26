package Aula5;

import javax.swing.JOptionPane;

public class Atividade_8 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("ponha o tamanho da matriz "));
		String [] [] matriz = new String [n][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = JOptionPane.showInputDialog("ponha o nome ");
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(j % 2==1) {
					JOptionPane.showMessageDialog(null,matriz[i][j]);
				}
			}
		}
	}

}
