package aula2;

import javax.swing.JOptionPane;

public class exemplo2 {

	public static void main(String[] args) {
		String [] nome = new String [2];
		int [] idade = new int [2];
		for (int i = 0; i < idade.length; i++) {
			nome[i]=JOptionPane.showInputDialog("nome");
			idade[i]=Integer.parseInt(JOptionPane.showInputDialog("idade"));
		}
		String busca ="busca a pessoa mais velha ";
		int Idade =0;//busca pessoa mais velha;
		for (int i = 0; i < idade.length; i++) {
			if(idade[i]>=Idade) {
				Idade=idade[i];
				busca=nome[i];
			}
		}
		JOptionPane.showMessageDialog(null,"pessoa mais velha "+busca+" "+"idade da pessoa "+Idade);
		String buscap = JOptionPane.showInputDialog("qual nome seria para busca");
		for (int i = 0; i < idade.length; i++) {
			if(busca.equalsIgnoreCase(nome[i])) {
				JOptionPane.showMessageDialog(null,"achou o safado haha");
				break;
			}else {
				JOptionPane.showMessageDialog(null,"o safado foi achado");
			}
		}
	}

}
