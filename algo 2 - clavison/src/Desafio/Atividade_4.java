package Desafio;

import javax.swing.JOptionPane;

public class Atividade_4 {

	public static void main(String[] args) {
		String [] nome = new String [350];
		int [] idade = new int [350];
		String menu =" 1 - Cadastro \n"
					+ "2 - busca nome \n"
					+ "3 - sair ";
		int op=0;
		int quantidade=0;
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op==1){
				if(quantidade<350){
					nome[quantidade]=JOptionPane.showInputDialog("nome da pessoa");
					idade[quantidade]=Integer.parseInt(JOptionPane.showInputDialog("idade da pessoa"));
					quantidade++;
				}else{
					JOptionPane.showMessageDialog(null,"o cadastro foi completado");
				}
			}
			if(op==2){
				String busca =JOptionPane.showInputDialog("nome que busca ");
				String r="não encontrado";
				for (int i = 0; i < quantidade; i++) {
					if(nome[i].equalsIgnoreCase(busca)){
						if((idade[i] >= 5)&&(idade[i]<=7)){
							r=" nome "+nome[i]+" idade de  : "+idade[i]+" categoria : InfantilA" ;
						}
						if((idade[i]>=8) && (idade[i] <=10)){
							r=" nome "+nome[i]+" idade de  : "+idade[i]+" categoria : InfantilB ";
						}
						if((idade[i]>=11)&&(idade[i]<=17)){
							r=" nome "+nome[i]+" idade de  : "+idade[i]+" categoria : juvenil" ;
						}
						if((idade[i]>=18)){
							r=" nome "+nome[i]+" idade de  : "+idade[i]+" categoria : Adulto" ;
						}
					}
				}
				JOptionPane.showMessageDialog(null,r);
			}
		} while (op!=3);
	}

}
