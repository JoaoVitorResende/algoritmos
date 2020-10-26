import javax.swing.JOptionPane;

public class Matriz_com_menu {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("ponha o tamanho da matriz"));
		int [][] matriz = new int [n][n];
		String menu = "1 - cadastrar o valor \n"
				+	  "2 - mostrar a matriz \n"
				+ 	  "3 - ver o menor numero \n"
				+ 	  "4 - ver o maior numero \n"
				+ 	  "5 - ver media total d matriz\n"
				+ 	  "6 - media de cada linha \n"
				+ 	  "7 - troca de valor \n"
				+ 	  "8 - Busca numero \n\n"
				+ 	  "9 - Sair";
		int op =0 ,linha=0,coluna=0;
		 boolean check = true ;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op==1) {
				if(check) {
					matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("ponha o valor"));
					coluna++;
					if(linha == n-1 && coluna == n) {
						check = false ;
					}else {
						if(coluna == n) {
							linha++;
							coluna=0;
						}
					}
				}else {
					JOptionPane.showMessageDialog(null,"matriz cheia !");
				}
			}
			if(op==2) {
				String r =" Matriz \n";
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz.length; j++) {
						r += matriz[i][j]+" ";
					}
					r += "\n";
				}
				JOptionPane.showMessageDialog(null,r);
			}
			if(op==3) {
				int Menor = matriz [0][0];
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz.length; j++) {
						if(Menor > matriz[i][j]) {
							Menor = matriz[i][j];
						}
					}
				}
				JOptionPane.showMessageDialog(null," o menor numero da matriz é o "+Menor);
			}
			if(op==4) {
				int Maior = matriz[0][0];
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz.length; j++) {
						if(Maior < matriz[i][j]) {
							Maior = matriz[i][j];
						}
					}
				}
				JOptionPane.showMessageDialog(null,"o maior valor da matriz é o "+Maior);
			}
			if(op==5) {
				int somaT = 0;
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz.length; j++) {
						 somaT += matriz[i][j];
					}
				}
				somaT = somaT/(n*n);
				JOptionPane.showMessageDialog(null,"A media total é de "+somaT);
			}
			if(op==6) {
				int [] medias = new int [n];
				int soma = 0;
				for (int i = 0; i <matriz.length; i++) {
					soma = 0;
					for (int j = 0; j <matriz.length; j++) {
						soma+=matriz[i][j];
					}
					System.out.println(soma);
					soma = soma/n;
					medias[i]=soma;
				}
				//////////////
				for (int i = 0; i < medias.length; i++) {
					JOptionPane.showMessageDialog(null," meida de cada linha foram "+medias[i]);
				}
			}
			if(op==7) {
				int Linha = Integer.parseInt(JOptionPane.showInputDialog("informe a linha "));
				int Coluna = Integer.parseInt(JOptionPane.showInputDialog("informe a coluna"));
				if(Linha <=n-1 && Coluna<=n-1 && Linha >=0 && Coluna >=0) {
					matriz[Linha][Coluna] = Integer.parseInt(JOptionPane.showInputDialog("ponha o novo valor"));
				}else {
					JOptionPane.showMessageDialog(null,"valores de linha e coluna invalidos ");
				}
					
			}
			if(op==8) {
				int busca = Integer.parseInt(JOptionPane.showInputDialog("ponha o valor que deseja buscar"));
				boolean checagem =false;
				int L = 0;
				int C = 0 ;
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz.length; j++) {
						if(busca==matriz[i][j]) {
							checagem = true;
							L = i;
							C = j;
						}
					}
				}
				if(checagem) {
					JOptionPane.showMessageDialog(null,"numero encontrado na Linha "+L+" e na coluna "+ C);
				}else {
					JOptionPane.showMessageDialog(null,"valor não encontrado");
				}
			}
		} while (op!=9);
				
	}

}
