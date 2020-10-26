package metodos;

import javax.swing.JOptionPane;

public class Desafio {
	private static String nomes [] = new String [4];
	private static int idades[] = new int [4];
	private static String sexo [] = new String [4];
	private static int notas [] = new int [12];
	private static int cont =0 ;
	public static void main(String[] args) {
	 int op =0 ;
	 do {
		 op=menu();
		 if(op==1) {
			 cadastro();
		 }
		 if(op==2) {
			 medias();
		 }
		 if(op==3) {
			 
		 }
		 if(op==4) {
			 
		 }
		 if(op==5) {
			 
		 }
		 if(op==6) {
			 
		 }
		 if(op==7) {
			 
		 }
		 
	} while (op!=8);
	}
	private static void medias() {
		String aprovados =" Aprovados \n";
		String reprovados =" reprovados \n";
		String recuperacao =" recuperação \n";
		for (int i = 0; i < nomes.length; i++) {
			for (int j = 0; j < notas.length; j++) {
				
			}
			
		}
	}
	private static void cadastro() {
		if(cont<4) {
			nomes[cont]= JOptionPane.showInputDialog("ponha o nome do aluno");
			idades[cont]= Integer.parseInt(JOptionPane.showInputDialog("ponha o nome do aluno"));
			sexo[cont]= JOptionPane.showInputDialog("ponha o sexo do aluno");
		
			for (int i = 0; i < notas.length; i++) {
				notas[i]= Integer.parseInt(JOptionPane.showInputDialog("ponha a nota do aluno"));
			}
			cont++;
		}
	}
	private static int menu() {
		String menu ="1 - Cadastrar aluno\n" + 
				"2 - Calcular a média de todos os alunos\n" + 
				"3 - Exibir alunos e se estão aprovados, reprovaos ou em recuperação (critérios: acima de 7 aprovado, abaixo de 3 reprovado)\n" + 
				"4 - Percentual de mulheres e homens reprovados\n" + 
				"5 - Média das idades da turma\n" + 
				"6 - Listar alunos por sexo\n" + 
				"7 - Listar alunos por idade\n\n"+
				"8- sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

}
