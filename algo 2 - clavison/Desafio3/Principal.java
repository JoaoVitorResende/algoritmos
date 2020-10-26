package Desafio3;

import javax.swing.JOptionPane;

public class Principal {
	static Carro [] carros = new Carro [2]; 
	static int quantidade = 0;
	static int qt = 0;
	public static void main(String[] args) {
		int op=0 ;
		do {
		op =menu();
			if(op==1) {
				cadastra();
			}
			if(op==2) {
				buscaplaca();
			}
			if(op==3) {
				buscapessoa();
			}
			if(op==4) {
				buscaano();
			}
			if(op==5) {
				buscacor();
			}
		} while (op!=6);
	}
	private static void buscacor() {
		String r="";
		String busca = ler("qual cor buscas");
		for (int i = 0; i < qt; i++) {
			if(carros[i].cor.equalsIgnoreCase(busca)) {
				r+=carros[i];
			}
		}
		if(r.equalsIgnoreCase("")) {
			mostrar("cor não encontrado");
		}else {
			mostrar(r);
		}
	}
	private static void buscaano() {
		String r =""; 
		for (int i = 0; i < qt; i++) {
			if(carros[i].ano==2018) {
				r+="carros do ano 2018 \n";
				r+=carros[i]+"\n";
			}
		}
		if(r.equalsIgnoreCase("")) {
			mostrar("não encontrado");
		}else {
			mostrar(r);
		}
	}
	private static void buscapessoa() {
		String busca = ler("ponha o nome que procuras");
		String r ="";
		for (int i = 0; i < qt; i++) {
			Carro c = carros[i];
			for (int j = 0; j <c.pessoas.length; j++) {
				if(busca.equalsIgnoreCase(carros[i].pessoas[j])){
					r+=carros[i].marca+"\n";
				}
			}
		}
		if(r.equalsIgnoreCase("")) {
			mostrar("não encontrado");
		}else {
			mostrar(r);
		}
	}
	private static void buscaplaca() {
		String r ="";
		String busca =ler("qual placa deseja buscar");
		for (int i = 0; i <qt; i++) {
			if(busca.equalsIgnoreCase(carros[i].placa)){
				for (int j = 0; j <3; j++) {
					r +=carros[i].pessoas[j]+"\n";
				}
			}
		}
		if(r.equalsIgnoreCase("")) {
			mostrar("não tem cadastrado");
		}else {
			mostrar(r);
		}
	}
	private static void cadastra() {
		quantidade =0;
		if(qt<2) {
		String continua ="s";
		Carro c = new Carro();
		c.marca = ler(("ponha a marca do carro"));
		c.ano = Integer.parseInt(ler("ponha o ano do carro"));
		c.modelo = ler("modelo do carro");
		c.cor = ler("cor do carro");
		c.placa = ler ("placa do carro ");
		int qtcondutores = Integer.parseInt(JOptionPane.showInputDialog("ponha a quantidade de condutores"));
		c.pessoas = new String[qtcondutores];
		for (int i = 0; i < qtcondutores; i++) {
			c.pessoas[i] = JOptionPane.showInputDialog("ponha o nomes dos condutores");
		}
		carros[qt] = c ;
		qt++;
		}else {
			mostrar("vetor de carros cheio");
		}
	}
	private static void mostrar(String msg) {
		 JOptionPane.showMessageDialog(null,msg);;
	}
	private static String ler(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	private static int menu() {
		String menu = "1 - Cadastrar Carro\n" + 
				"2 - Localizar um carro pela Placa e mostrar os nomes condutores que podem dirigí-lo.\n" + 
				"3 - Perguntar um nome ao usuário e verificar qual(is) carro(s) ele pode dirigir.\n" + 
				"4 - Dados de todos os carros fabricados no ano 2018\n" + 
				"5 - Listar todos os carros de uma determinada cor\n\n"	+   
				"6 - sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
}
