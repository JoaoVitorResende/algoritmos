package Simulado3;

import javax.swing.JOptionPane;
 
public class Biblioteca {
	  static Livro [] livros = new Livro[3];		
	  static int cont = 0;
	  public static void main(String[] args) {
	  int op =-1;
		do {
			op=menu();
			if(op==1) cadastra();
			if(op==2) busca();
			if(op==3) mostralivro(-1);
			if(op==4) organiza();
		} while (op!=0);
	}
	private static void organiza() {
		int m =cont-1;Livro aux ;
		for (int i = 0; i < cont; i++) {
			for (int j = 0; j < m; j++) {
				if(livros[j].paginas>livros[j+1].paginas) {
					aux = livros[j];
					livros[j] = livros[j+1];
					livros[j+1] = aux;
				}
			}
		}
		mostralivro(-1);
	}
	private static void busca() {
		boolean check = false;
		String busca = ler("ponha o seu titulo que deseja buscar");
		for (int i = 0; i < cont; i++) {
			if(busca.equalsIgnoreCase(livros[i].titulo)) {
				mostralivro(i);
				check = true;
			}
		}
		if(!check) {
			mostra("livro nao encontrado");
		}
	}
	private static void mostralivro(int x) {
		String r =" ";String re=" ";
		if(x <0) {
		for (int i = 0; i < cont; i++) {
			r+=livros[i]+"\n\n";
		}
		mostra(r);
		}else {
			re+=livros[x];
			mostra(re);
		}
	}
	private static void cadastra() {
		if(cont<500) {
		Livro l = new Livro();
		l.autor = ler("ponha o nome do autor");
		l.localizacao = ler("ponha a localização");
		l.titulo = ler("ponha o nome do titulo");
		l.paginas = inteiro("ponha o total de paginas");
		livros [cont] = l;
		cont++;
		}else {
			mostra("vetor cheio");
		}
	}
	private static int menu() {
		String menu ="1 – Incluir livro\n" + 
				"2 – Buscar por título \n" + 
				"3 – Listar todos os livros \n" + 
				"4 – Ordenar pelo número de páginas (após utilizar o método de ordenação exibir a listagem ordenada)\n\n" + 
				"0 – Sair do sistema";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
	private static int inteiro(String msg) {
		return Integer.parseInt(ler(msg));
	}
	private static String ler(String jop) {
		return JOptionPane.showInputDialog(jop);
	}
	private static void mostra(String msg) {
		JOptionPane.showMessageDialog(null,msg);
	}
}
