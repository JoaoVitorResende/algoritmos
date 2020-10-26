package aula2;

import javax.swing.JOptionPane;

public class atividade3 {

	public static void main(String[] args) {
		int n =Integer.parseInt(JOptionPane.showInputDialog("ponha o valor do tamanho do vetor"));
		int [] vetor = new int[n];
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("valor"));
		}
		for (int i = 0; i < vetor.length; i++) {
			JOptionPane.showMessageDialog(null,vetor[i]);
			soma+=vetor[i];
		}
		soma=soma/n;
		for (int i = 0; i < vetor.length; i++) {
			if(soma>vetor[i]){
				vetor[i]=soma;
			}
		}
	for (int i = 0; i < vetor.length; i++) {
		JOptionPane.showMessageDialog(null,vetor[i]);
	}
	}
	

}
