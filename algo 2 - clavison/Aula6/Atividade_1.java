package Aula6;

import javax.swing.JOptionPane;

public class Atividade_1 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("ponha o tamanho da matriz "));
		int matriz[][] = new int[n][n];
		int Linha[] = new int[n];
		int Coluna[] = new int[n];
		// cadastro
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("ponha o valor "));
			}
		}
		// poem em um vetor a soma das linhas
		int soma = 0;
		for (int i = 0; i < Linha.length; i++) {
			soma = 0;
			for (int j = 0; j < Linha.length; j++) {
				soma += matriz[i][j];
			}
			Linha[i] = soma;
		}
		// verifica a soma da linha
		boolean check = false;
		int verifica = Linha[0];
		for (int i = 1; i < Linha.length; i++) {
			if (verifica == Linha[i]) {
				check = true;
			}
		}
		if (!check) {
			JOptionPane.showMessageDialog(null, "não é um quadrado magico");
			System.exit(0);
		}
		// soma das colunas
		int somaC = 0;
		for (int i = 0; i < matriz[0].length; i++) {
			somaC = 0;
			for (int j = 0; j < matriz.length; j++) {
				somaC += matriz[j][i];
			}
			Coluna[i] = somaC;
		}
		// testa a soma das colunas
		boolean teste = false;
		int verificaColuna = Coluna[0];
		for (int i = 1; i < Coluna.length; i++) {
			if (verificaColuna == Coluna[i]) {
				teste = true;
			}
		}
		if (!teste) {
			JOptionPane.showMessageDialog(null, "não é uma matriz magica");
			System.exit(0);
		}
		// soma da diagonal principal
		int diagonalP = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j) {
					diagonalP += matriz[i][j];
				}
			}
		}
		// soma diagonal secundaria 
		int coluna = n-1;
		int diagonalS=0;
		for (int i = 0; i < matriz.length; i++) {
			diagonalS+=matriz[i][coluna];
					coluna--;
		}
		// verifica valor das colunas
		if(diagonalP==diagonalS) {
			JOptionPane.showMessageDialog(null,"A matriz é um quadrado mágico");
		}else {
			JOptionPane.showMessageDialog(null, "A matriz não é um quadrado mágico");
			System.exit(0);
		}
	}

}
