package Aula6;

import javax.swing.JOptionPane;

public class Atividade_2 {

	public static void main(String[] args) {
		int [][] matriz = new int [6][6];
		int c = 1;
		// bota valor na matriz 
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz [i][j] = c++;
			}
		}
		// busca um valor 
		boolean check = false ;
		int p = 0 , m = 0;// pm de parametro 
		int busca = Integer.parseInt(JOptionPane.showInputDialog("ponha um valor que deseja"));
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(matriz [i][j] == busca ) {
					p = i;
					m = j;
					check = true ;
				}
			}
		}
		
		if(!check ) {
			JOptionPane.showMessageDialog(null,"valor não encontrado");
		}else {
			JOptionPane.showMessageDialog(null," valor encontrado na linha "+p+" e na coluna "+m);
		}
	}

}
