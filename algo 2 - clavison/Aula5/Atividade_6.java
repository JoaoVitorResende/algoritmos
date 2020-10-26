package Aula5;

public class Atividade_6 {

	public static void main(String[] args) {
	int [][] matriz_1 = new int [5][10];
	int [][] matriz_2 = new int [5][10];
	int [][] matriz_3 = new int [5][10];
	for (int i = 0; i < matriz_2.length; i++) {
		for (int j = 0; j < matriz_2[0].length; j++) {
			matriz_1[i][j]=1;
			matriz_2[i][j]=1;
		}
	}
	for (int i = 0; i < matriz_3.length; i++) {
		for (int j = 0; j < matriz_3[0].length; j++) {
			matriz_3[i][j]=matriz_1[i][j]+matriz_2[i][j];
		}
	}
	for (int i = 0; i < matriz_3.length; i++) {
		for (int j = 0; j < matriz_3[0].length; j++) {
			System.out.print(matriz_3[i][j]+"\t");
		}
		System.out.println();
	}
	}

}
