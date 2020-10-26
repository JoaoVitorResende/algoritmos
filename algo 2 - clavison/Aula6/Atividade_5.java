package Aula6;

import javax.swing.JOptionPane;

public class Atividade_5 {

	public static void main(String[] args) {
		String [] cidades= {"Tubarão","Imbituba","Florianópolis","Capão da Canoa ","Joinville","Herval do Oeste","Criciuma","Boston"};
		int [][] tempo = new int [8][4];
		String [] nomes = {"João","Clavison","Rafael","Lucas"};
		// cadastro
		for (int i = 0; i < tempo.length; i++) {
			for (int j = 0; j < tempo[0].length; j++) {
					tempo[i][j] = Integer.parseInt(JOptionPane.showInputDialog("o atleta com o nome a seguir "+nomes[j] +" fez quanto tempo na cidade de "
							+cidades[i])); 
				}
			}
		// procura cidade		
		int linha = 0 ;// pega a linha 
		boolean check = false ;
		String ci = JOptionPane.showInputDialog("qual cidade procuras ?");
		for (int i = 0; i < cidades.length; i++) {
				if(cidades[i].equalsIgnoreCase(ci)) {
					ci = "achou";
					linha = i ;
					check = true;
				}
		}
		if(!check) {
			JOptionPane.showMessageDialog(null,"não há corridas nessa cidade");
		}
		// acha com menos tempo 
		String ap = " " ; //pega qual atleta  
		int menor = 9999;
		for (int j = 0; j < tempo[0].length; j++) {
			if(tempo[linha][j]<menor) {
				menor = tempo [linha][j];
				ap = nomes[j];
			}
		}
		// acha com mais tempo 
		String au = " "; //poem o nome do ultimo colocado
		int maior =0 ;
		for (int j = 0; j < tempo[0].length; j++) {
			if(tempo[linha][j] > maior) {
				maior = tempo[linha][j];
				au = nomes[j];
			}
		}
		JOptionPane.showMessageDialog(null,"O Atleta que chegou em primeiro lugar foi "+ap+" com o tempo de "+menor+"\n"
		+"o que chegou em ultimo lugar foi o "+au+" com tempo de "+maior);
	}

}
