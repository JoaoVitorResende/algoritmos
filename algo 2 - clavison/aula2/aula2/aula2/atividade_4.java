package aula2;

import javax.swing.JOptionPane;

public class atividade_4 {

	public static void main(String[] args) {
		String menu = " 1- cadastra carro \n" + "  2 - verificar mais novo \n " + "  3 - buscar por placa  \n "
				+ "  4 - sair ";
		String[] marca = new String[20];
		String[] placas = new String[20];
		int[] anos = new int[20];
		int op = 0;
		int quantidade = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (op == 1) {
				if (quantidade < 20) {
					marca[quantidade] = JOptionPane.showInputDialog("ponha a marca do carro");
					placas[quantidade] = JOptionPane.showInputDialog("ponha a placa do carro");
					anos[quantidade] = Integer.parseInt(JOptionPane.showInputDialog("ponha o ano do carro"));
					quantidade++;
				} else {
					JOptionPane.showMessageDialog(null, "tem carro de mais man vc ta roubando  190 chegando meu parça");
				}
			}
			if (op == 2) {
				int anomaisnovo = anos[0];
				String marcamaisnovo = marca[0];
				String placamaisnovo = placas[0];
				for (int i = 0; i < quantidade; i++) {
					if (anomaisnovo < anos[i]) {
						///////////////
						anomaisnovo = anos[i];
						marcamaisnovo = marca[i];
						placamaisnovo = placas[i];
					}
				}
				JOptionPane.showMessageDialog(null, "\n ano mais novo " + anomaisnovo + " \nmarca do carro mais novo "
						+ marcamaisnovo + "\n placa do carro mais novo " + placamaisnovo);
			}
			if (op == 3) {
				String busca = JOptionPane.showInputDialog("qual placa buscas ?");
				String resultado ="placa não encontrada";
				for (int i = 0; i < quantidade; i++) {
					if (placas[i].equalsIgnoreCase(busca)) {
						resultado = "placa encontrada " + placas[i] + "ano " + anos[i] + "marca " + marca[i];
					}
				}
					JOptionPane.showMessageDialog(null, resultado);
			}
		} while (op != 4);
	}

}
