package aula2;

import javax.swing.JOptionPane;

public class atividade1 {

	public static void main(String[] args) {
		int n =Integer.parseInt(JOptionPane.showInputDialog("ponha o tamanho do vetor"));
		int [] vetor = new int [n];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("ponha os valores "));
		}
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i]%2==0){
				JOptionPane.showMessageDialog(null,"par "+vetor[i]);
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i]%2==1){
				JOptionPane.showMessageDialog(null,"impar "+vetor[i]);
			}
		}
	}

}
