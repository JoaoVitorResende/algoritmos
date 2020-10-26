package Aula5;

import javax.swing.JOptionPane;

public class Atividade_9 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("ponha o valor "));
		int[][] matriz = new int[n][n];
		int [] soma = new int [n];
		int somar = 0;
		int c =0 , x =0;
		for (int i = 0; i <matriz[0].length-1; i++) {// cadastro
			for (int j = 0; j < matriz[0].length; j++) {
				matriz [i][j] = x++;
			}
		}
		for (int i = 0; i < matriz[0].length; i++) {// somando
			for (int j = 0; j < n; j++) {
				if(j==0) {
					somar = 0 ;
				}
				somar += matriz [j][i];
			}
			soma[c]= somar ;// vetor recevendo a soma
			c++;
		}
			for (int j = 0; j < soma.length; j++) {// botando as somas na matriz n-1 0 a n ou seja n-1 
				matriz[n-1][j]=soma[j];
			}
			for (int i = 0; i < soma.length; i++) {// mostrando
				for (int j = 0; j < soma.length; j++) {
					System.out.print(matriz[i][j]+" ");
				}
				System.out.println();
			}
	}

}
