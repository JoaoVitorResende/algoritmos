package Aula6;

import javax.swing.JOptionPane;

public class Atividade_3 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog(" valor da matriz quadrada"));
		int [] [] matriz = new int [n][n];
		// cadastro de valores 
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("ponha um valor "));
			}
		}
		// soma da principal
		int somaP = 0 ;
		int par = 0 ;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i<j) {
				if(matriz[i][j]%2==0) {
					par++;
				}
				}
				if(i==j) {
					somaP += matriz[i][j];
				}
			}
		}
		JOptionPane.showMessageDialog(null,"a soma da diagonal principal é "+somaP 
				+" e o respectivos pares acima da diagonal são de total de "+par);
	}

}
