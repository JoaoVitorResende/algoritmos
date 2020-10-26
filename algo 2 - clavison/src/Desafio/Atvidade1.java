package Desafio;

import javax.swing.JOptionPane;

public class Atvidade1 {

	public static void main(String[] args) {
		String menu ="1 - Cadastrar \n"
				+ 	" 2 - menor que 10 no estoque \n"
				+ 	" 3 - tem valor 100 e tem mais que 10 no estoque\n"
				+ 	" 4 - preço da mercadoria com menor estoque\n"
				+ 	" 5 - percentual do estoque que está com zero\n"
				+ 	" 6 - sair";
		int [] unidades = new int [50];
		int [] valores = new int [50];
		String [] mercadoria = new String [50];
		int quantidade=0,op=0,menor=99,preçomenor=0,c=0,porcentagem=0;
		String menorM="";
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op==1){
				if(quantidade<50){
					mercadoria[quantidade]=JOptionPane.showInputDialog("nome da mercadoria");
					unidades[quantidade]=Integer.parseInt(JOptionPane.showInputDialog("quantidade de unidades"));
					valores[quantidade]=Integer.parseInt(JOptionPane.showInputDialog("valor do mercadoria "));
					quantidade++;
				}else{
					JOptionPane.showMessageDialog(null,"passou do limite");
				}
			}
			if(op==2){
				for (int i = 0; i <quantidade; i++) {
					if(unidades[i]<=10){
						JOptionPane.showMessageDialog(null,"mercadoria "+mercadoria[i]+" unidade "+unidades[i]+" valor "+valores[i]);
					}
				}
			}
			if(op==3){
				for (int i = 0; i <quantidade; i++) {
					if((valores[i]>=100) && (unidades[i]>=10)){
						JOptionPane.showMessageDialog(null,"mercadoria "+mercadoria[i]+" unidade "+unidades[i]+" valor "+valores[i]);
					}
				}
			}
			if(op==4){
				for (int i = 0; i < quantidade; i++) {
					if(unidades[i]<menor){
						menor=unidades[i];
						menorM=mercadoria[i];
						preçomenor=valores[i];
					}
				}
				JOptionPane.showMessageDialog(null,"mercadoria com menor unidades é "+menorM+" com o preço de "+preçomenor+" com total de unidades de "+menor);
			}
			if(op==5){
				for (int i = 0; i < quantidade; i++) {
					if(unidades[i]==0){
						c++;
					}
				}
				porcentagem = (c*100)/quantidade;
				JOptionPane.showMessageDialog(null," a porcentagem seria de "+porcentagem+" % ");
			}
		} while (op!=6);
	}

}
