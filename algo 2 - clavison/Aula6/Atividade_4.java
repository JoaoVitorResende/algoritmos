package Aula6;

import javax.swing.JOptionPane;

public class Atividade_4 {

	public static void main(String[] args) {
		int [][ ] matriz = new int [10][10];
		// cadastro
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("ponha um valor"));
			}
		}
		//busca maior valor
		int maior = matriz [0][0];
		int linha =0 ;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(matriz[i][j]>maior) {
					linha = i;
					maior = matriz [i][j];
				}
			}
		}
		// procura o minimax
		int minimax = matriz [linha][0];
		int coluna = 0; 
			for (int j = 0; j < matriz.length; j++) {
				if(matriz[linha][j]<minimax) {
					minimax = matriz[linha][j];
					coluna = j;
				}
		}
			JOptionPane.showMessageDialog(null,"o valor do minimax é de "+minimax+" encontrado na linha  "+linha+" e na coluna "+coluna);
	}

}
