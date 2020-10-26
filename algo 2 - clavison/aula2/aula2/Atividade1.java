package aula2;

import javax.swing.JOptionPane;

public class Atividade1 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("quantas pessoas "));
		String [] nome = new String [n];
		int [] idade = new int[n];
		String [] sexo = new String[n];
		int Mvelha=0,Hnovo=999,m=0,h=0,ph=0,pm=0,c=0;
		String velha=" ";
		String novoo =" ";
		String novo =" ";
		boolean ho =false;
		boolean mu =false;
		for (int i = 0; i < sexo.length; i++) {
			nome[i]=JOptionPane.showInputDialog("nome da pessoa ");
			idade[i]=Integer.parseInt(JOptionPane.showInputDialog("idade da pessoa"));
			sexo[i]=JOptionPane.showInputDialog("sexo da pessoa masculino ou feminino");
		}
		for (int i = 0; i < sexo.length; i++) {
			if(sexo[i].equalsIgnoreCase("f")) {
				pm++;
				if(idade[i]>=Mvelha) {
					Mvelha=idade[i];
					velha=nome[i];
				}
			}
		}
		for (int i = 0; i < sexo.length; i++) {
			if(sexo[i].equalsIgnoreCase("m") ) {
				ph++;
			if(idade[i]<Hnovo){
			Hnovo=idade[i];
			novoo=nome[i];
			}
			}
		}
		for (int i = 0; i < sexo.length; i++) {
			if(idade[i]<18) {
				c++;
			}
		}
		////////recebe percentual de cada ;
		double percentualH =(ph*100);
		percentualH=percentualH/n;
		//////////////////////////
		double percentualM =(pm*100);
		percentualM=percentualM/n;
		////////////////////////////////////
		JOptionPane.showMessageDialog(null,"percentual de homens "+percentualH);
		JOptionPane.showMessageDialog(null,"percentual de mulheres "+percentualM);
		JOptionPane.showMessageDialog(null,"quantidade de pessoa menor de 18 "+"-"+c);
		JOptionPane.showMessageDialog(null,"mulher mais velha "+velha);
		JOptionPane.showMessageDialog(null,"homem mais novo "+novoo);
		
	}

}
