import javax.swing.JOptionPane;

public class Matriz_Recebe_vetor {

	public static void main(String[] args) {
		int [][] matriz = new int [4][4];
		int [] vetor = new int [12];
		int x =0 ;
		int co = 0; 
		int conta = 0 ;
		int z =0;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("valores "));
		}
		for (int i = 0; i < vetor.length; i++) {// quantos negativos
			if(vetor[i]<0) {
				x++;
			}else {
				conta++;
			}
		}
		int [] aux = new int [x];
		int [] positivo = new int [conta];
		int c =0;
		int con = 0 ;
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i]<0) {
				aux [c] = vetor[i];
				c++;
			}else {
				positivo[con] = vetor[i];
				con++;
			}
		}
		for (int i = 0; i < aux.length; i++) {
			System.out.println(aux[i]);
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i==j) {
					matriz[i][j]=0;
				}
				if(i<j) {
				
					matriz[i][j] = aux[co];
					co++;
				}
				if(i>j) {
					matriz[i][j] = positivo [z];
					z++;
				}
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
