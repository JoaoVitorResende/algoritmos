package Aula5;

public class Atividade_5 {

	public static void main(String[] args) {
		int [][] matriz = new int [20][10];
		int [] vetor = new int [10];
		int c =0 ;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = c++;
			}
		}
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma=0;
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]+"\t");
				soma+=matriz[j][i];
			}
			System.out.println();
			vetor[i]=soma;
		}
		System.out.println("vetor");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
