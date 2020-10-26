package Aula6;

import javax.swing.JOptionPane;

public class Exemplo1 {

	public static void main(String[] args) {
		double[][] notas = new double[2][4];
		String[] nomes = new String[2];
		double[] pesos = new double[] { 0.25, 0.25, 0.3, 0.2 };
		// CADASTRO DAS NOTAS
		for (int i = 0; i < 2; i++) {
			nomes[i] = JOptionPane.showInputDialog("Nome do " + (i + 1) + "º aluno(a):");
			for (int j = 0; j < 4; j++) {
				notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog((j + 1) + "ª nota de " + nomes[i]));
			}
		}
		int c = 0 ;
		boolean x = false  ;
		String busca = JOptionPane.showInputDialog("nome que deseja buscar ");
		for (int i = 0; i < 2; i++) {
			if(nomes[i].equalsIgnoreCase(busca)){
				c = i ;
				x =true ;
			}
		}
		String aluno =" ";
		if(x) {
			int media =0 ;
				for (int j = 0; j < 4; j++) {
					media += notas[c][j]*pesos[j];
			}
				for (int j = 0; j < 4; j++) {
					aluno = "nome do aluno "+busca+" e suas notas"+notas[c][j]+" a sua media de "+media+"\n";	
			}
			}
		
		JOptionPane.showMessageDialog(null,aluno);
	}
}