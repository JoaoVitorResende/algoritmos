package aula2;

import javax.swing.JOptionPane;

public class atividade_1 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("tamanho do vetor"));
		int cp = 0, ci = 0;
		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("ponha o valor"));
		}
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				cp++;
			} else {
				ci++;
			}
		}

		int[] impar = new int[ci];
		int[] par = new int[cp];
		int pa = 0;
		int im = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				par[pa] = vetor[i];
				pa++;
			}else {
				impar[im]=vetor[i];
				im++;
			}
		}
		for (int i = 0; i < par.length; i++) {
			vetor[i]=par[i];
		}
		for (int i = 0; i < ci ; i++) {
			vetor[i+cp] = impar[i];
		}
		for (int i = 0; i < vetor.length; i++) {
			JOptionPane.showMessageDialog(null,vetor[i]);
		}
	}

}
