package Aula5;

public class Atividade_7 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		int c = 1;
		for (int j = 0; j < matriz.length; j++) {
			matriz[0][j] = c++;
		}
		c = 1;
		for (int j = 0; j < matriz.length; j++) {
			matriz [1][j] = (c++ * 2) ; 
		}
		c = 1 ;
		for (int j = 0; j < matriz.length; j++) {
			matriz [2][j] = (c++ * 3);
		}
		c = 1;
		for (int j = 0; j < matriz.length; j++) {
			matriz[3][j] = (c++ * 4);
		}
		c = 1 ;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
}
