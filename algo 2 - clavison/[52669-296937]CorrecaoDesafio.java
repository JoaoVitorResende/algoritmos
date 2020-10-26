package subrotinas;

import javax.swing.JOptionPane;

public class CorrecaoDesafio {
	
	private static String nomes [] = new String [4];
	private static double idades[] = new double [4];
	private static String sexo [] = new String [4];
	private static double notas [][] = new double [4][3];
	private static int cont =0 ;
	private static double medias[] = new double [4];
	
	
	public static void main(String[] args) {
	 int op =0 ;
	 do {
		 op = menu();
		 escolha(op);
	 } while (op!=8);
	}
	
	private static void escolha(int op) {
		switch (op) {
			case 1:	cadastro();				break;
			case 2:	medias(0);				break;
			case 3:	resultados();			break;
			case 4:	percentualReprovados();	break;
			case 5:	medias(-1);				break;
			case 6:	listasexo();			break;
			case 7:	listaidade();			break;
		}
	}
	
	private static int inteiro(String vl) {
		return Integer.parseInt(vl);
	}
	
	private static void listaidade() {
		String r = " ";
		int busca = inteiro(ler("ponha a idade desejada"));
		for (int i = 0; i < idades.length; i++) {
			if(idades[i]==busca) {
				r+=nomes[i]+" - "+idades[i]+"\n";
			}
		}
		if(r.equalsIgnoreCase(" ")) {
			mostra("idade não encontrada",2);
		}else {
			mostra(r,1);
		}
	}
	
	private static void listasexo() {
		String r =" ";
		String busca = ler("qual sexo procuras");
		for (int i = 0; i < sexo.length; i++) {
			if(sexo[i].equalsIgnoreCase(busca)) {
				r+=montaAluno(i);
			}
		}
		if(r.equalsIgnoreCase(" ")) {
			mostra("ninguem encontrado",2);
		}else
		mostra(r,1);
	}
	
	private static void percentualReprovados() {
		int m = 0 ;
		int f = 0;
		String homens = " percentual de homens reprovados \n";
		String mulheres = " percentual de mulheres reprovados \n";
		for (int i = 0; i < medias.length; i++) {
			if(medias[i]<3) {
				if(sexo[i].equalsIgnoreCase("m")) {
					m++;
				}else{
					f++;
				}
			}
		}
		m = (m*100)/sexo.length;
		f = (f*100)/sexo.length;
		
		homens +="o percentual é de "+m; 
		mulheres +="o percentual é de "+f; 
		
		mostra(homens+"\n"+mulheres,1);
		
	}
	
	private static String montaAluno(int i) {
		return "Aluno "+nomes[i]+"\n com media de "+medias[i]+"\n";
	}
	
	private static String verificaResultados(int tipo) {
		String ret = "";
		for (int i = 0; i < medias.length; i++) {
			if(tipo == 1) {
				if(medias[i]>=7) 
					ret += montaAluno(i);
			}
			if(tipo == 2) {
				if(medias[i]<7 && medias[i]>=3)
					ret += montaAluno(i);
			}
			if(tipo == 3) {
				if(medias[i]<3)
					ret += montaAluno(i);
			}
		}
		return ret;
		
	}
	
	private static void resultados() {
		String aprovados =" Aprovados \n" + verificaResultados(1);
		String reprovados =" reprovados \n" + verificaResultados(3);
		String recuperacao =" recuperação \n"+ verificaResultados(2);
		mostra(aprovados+"\n\n"+recuperacao+"\n\n"+reprovados,1);
	}
	
	private static double calcMedia(double[] valores) {
		double total = 0;
		for(int i=0; i< valores.length; i++) {
			total += valores[i];
		}
		return total / valores.length;
	}
	
	private static void medias(int x) {
		if(x>=0) {
			for (int i = 0; i < notas.length; i++) {
				medias[i]=calcMedia(notas[i]);
			}
			mostra("Médias calculadas",1);
		}else {
			mostra("a media de idades da tuma é de "+calcMedia(idades),1);
		}
	}
	
	private static void gravaSexo(int i, String s) {
		if(s.equalsIgnoreCase("f")||s.equalsIgnoreCase("m"))
			sexo[i]= s;
		else
			gravaSexo(i, ler("sexo do aluno - SOMENTE M OU F"));
	}
	
	private static void cadastro() {
		if(cont<4) {
			nomes[cont]= ler("ponha o nome do aluno");
			idades[cont]= inteiro(ler("ponha a idade do aluno"));
			gravaSexo(cont, ler("sexo do aluno"));
			for (int j = 0; j < 3; j++) {
				notas[cont][j]= Double.parseDouble(ler("ponha a nota do "+nomes[cont]));
			}
			cont++;
		}else {
			mostra("tudo cadastrado",2);
		}
			
	}
	
	private static int menu() {
		String menu ="1 - Cadastrar aluno\n" + 
				"2 - Calcular a média de todos os alunos\n" + 
				"3 - Exibir alunos e se estão aprovados, reprovados ou em recuperação \n" + 
				"4 - Percentual de mulheres e homens reprovados\n" + 
				"5 - Média das idades da turma\n" + 
				"6 - Listar alunos por sexo\n" + 
				"7 - Listar alunos por idade\n\n"+
				"8- sair";
		return inteiro(ler(menu));
	}
	
	private static String ler(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	private static void mostra(String msg, int tp) {
		if(tp == 1)
		JOptionPane.showMessageDialog(null, msg,"", JOptionPane.INFORMATION_MESSAGE);
			else
				if(tp == 2)
					JOptionPane.showMessageDialog(null, msg,"", JOptionPane.ERROR_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, msg,"", JOptionPane.WARNING_MESSAGE);
	}

}
