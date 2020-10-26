package Aula7;

import javax.swing.JOptionPane;

public class Principal {
	static Jogadores[] joga = new Jogadores[2];
	public static void main(String[] args) {
		int op =0;
		do {
		 op = menu();
		if(op==1) {
			cadastra();
		}
		if(op==2) {
			gols(0);
		}
		if(op==3) {
			gols(-1);
		}
		if(op==4) {
			goleiros();
		}
		if(op==5) {
			camisa();
		}
		if(op==6) {
			busca();
		}
		} while (op!=7);
	}
	private static void busca() {
		String r = " ";
		String re = "nao encontrado ";
		String busca = JOptionPane.showInputDialog("quem procuras");
		boolean ok = false;
		for (int i = 0; i < joga.length; i++) {
			if(busca.equalsIgnoreCase(joga[i].nome)) {
				r += joga[i];
			}
		}
		if(ok) {
			JOptionPane.showMessageDialog(null,r);
		}else {
			JOptionPane.showMessageDialog(null,re);
		}
	
	}
	private static void camisa() {
		String r = " ";
		for (int i = 0; i < joga.length; i++) {
			if(joga[i].numerocamisa.equalsIgnoreCase("10")) {
				r+=joga[i];
			}
		}
		JOptionPane.showMessageDialog(null,r);
	}
	private static void goleiros() {
		String r = " ";
		for (int i = 0; i < joga.length; i++) {
			if(joga[i].posicao.equalsIgnoreCase("goleiro")&&joga[i].gols>0) {
				r+=joga[i];
			}
		}
		JOptionPane.showMessageDialog(null,r);
	}
	private static void gols(int x) {
		if(x>=0) {
			Jogadores j = joga[0];
			for (int i = 1; i < joga.length; i++) {
				if(joga[i].gols>j.gols) {
					j =joga[i];
				}
			}
			JOptionPane.showMessageDialog(null,j);
		}else {
			Jogadores jo = joga[0];
			for (int i = 0; i < joga.length; i++) {
				if(joga[i].gols<jo.gols) {
					jo = joga[i];
				}
			}
			JOptionPane.showMessageDialog(null,jo);
		}
	}
	private static int menu() {
		String menu = "1 - Cadastrar Jogador\n" + 
				"2 - Mostrar os dados do jogador que teve o maior número de gols\n" + 
				"3 - Mostrar os dados do jogador com menor número de gols\n" + 
				"4 - Mostrar os dados de todos os goleiros que fizeram algum gol no campeonato\n" + 
				"5 - mostrar todos os jogadores que utilizaram a camisa número 10\n"
			   +"6 - buscar jogador\n\n"
			   +"7 - sair";
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return op;
	}
	private static void cadastra() {
		for (int i = 0; i < joga.length; i++) {
			Jogadores j = new Jogadores ();
			j.nome = JOptionPane.showInputDialog("ponha o nome do jogador");
			j.numerocamisa = JOptionPane.showInputDialog("ponha o nome da camisa");
			j.posicao = JOptionPane.showInputDialog("ponha a posição do jogador");
			j.time = JOptionPane.showInputDialog("nome do time ");
			j.gols = Integer.parseInt(JOptionPane.showInputDialog("numero de gols "));
			joga[i] = j;
		}
		
	}

}
