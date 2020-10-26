package Desafio;

import javax.swing.JOptionPane;

public class Atividade_2 {

	public static void main(String[] args) {
		int n =Integer.parseInt(JOptionPane.showInputDialog("qual seria o tamanha do vetor ?"));
		String [] vetor = new String [n];
		String [] aux = new String [n];
		int c =n;
		c-=1;
		int x = 0;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]=JOptionPane.showInputDialog("cores");
		}
		for (int i = 0; i < vetor.length; i++) {
			JOptionPane.showMessageDialog(null,vetor[i]);
		}
		for (int i = c; i >= 0; i--) {
			aux[x]=vetor[i];
			x++;
		}
		for (int i = 0; i < aux.length; i++) {
			vetor[i]=aux[i];
		}
		
		for (int i = 0; i < vetor.length; i++) {
			JOptionPane.showMessageDialog(null,"invertido "+vetor[i]);
		}
	}

}
