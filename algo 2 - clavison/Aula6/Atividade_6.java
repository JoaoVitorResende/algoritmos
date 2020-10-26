package Aula6;

import javax.swing.JOptionPane;

public class Atividade_6 {

	public static void main(String[] args) {
		int [][] batimentos = new int [24][4];
		int [] medias = new int [4];
		// cadastro
		for (int i = 0; i < batimentos.length; i++) {
			for (int j = 0; j < batimentos[0].length; j++) {
				batimentos[i][j]=Integer.parseInt(JOptionPane.showInputDialog("ponha a medição dos batimentos"));
			}
		}
		// media de cada paciente
		int media = 0; 
		int paciente = 0;
		for (int i = 0; i < batimentos[0].length; i++) {
			media=0;
			for (int j = 0; j < batimentos.length; j++) {
				media+= batimentos[j][i];	
			}
			media=media/5;
			medias[paciente] = media;
			paciente++;
		}
		// mostra as medias de cada paciente 
		String r =" ";
		for (int i = 0; i < 4; i++) {
			r+="media do paciente a seguir "+(i+1)+" foi de : "+medias[i]+"\n";
		}
		JOptionPane.showMessageDialog(null,r);
		// procuras a maior media 
		 int maior = medias[0];
		 int p = 0; // pega o paciente com maior media cardiaca
		 for (int i = 1; i < medias.length; i++) {
			if(medias[i]>maior) {
				maior = medias[i];
				p=(i+1);
			}
		}
		 JOptionPane.showMessageDialog(null,"O paciente com maior media cardiaca foi : "+p+" com media de "+maior);
		 // identidicar o maior valor cardiaco na matriz
		 int Mmaior = batimentos[0][0];
		 int hora = 0;// pega hora
		 int paci = 0;//pega paciente
		 for (int i = 0; i < batimentos.length; i++) {
			for (int j = 1; j < batimentos[0].length; j++) {
				if(batimentos[i][j]>Mmaior) {
					Mmaior = batimentos[i][j];
					hora = (i+1);// como a matriz inicia 0 e  0 eu coloquei 1 para ficar na hora certa para mostrar 
					paci = (j+1) ;// mesma coisa da de cima 
				}
			}
		}
		 JOptionPane.showMessageDialog(null,"O paciente com o batimentos mais forte nessas 24 horas foi o : "+paci+" com batimento de "+Mmaior+" nessa exata hora "+hora);
	}

}
