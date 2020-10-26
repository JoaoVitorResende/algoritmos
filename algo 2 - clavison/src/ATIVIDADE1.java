import javax.swing.JOptionPane;

public class ATIVIDADE1 {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("ponha o email ");
		boolean fluindo = true;
		int t1 = 0, t2 = 0, z = 0;
		char c = '.';
		if (email.length() < 10) {// verifica se tem 10 caracteres
			JOptionPane.showMessageDialog(null, "não tem mais que dez caracteres ");
			fluindo = false;
		}
		if (email.indexOf("@") == -1) {// verifica se tem @
			JOptionPane.showMessageDialog(null, "não tem @ ");
			fluindo = false;
		}
		if (fluindo) {// se ainda for verdadeiro
			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {// verifica se tem 6 caracteres
												// antes do @
					JOptionPane.showMessageDialog(null, "achado no indice " + i);// achou o @
					if (i >= 6) {
						t1 = i;// bota a posição do i
					} else {
						JOptionPane.showMessageDialog(null, "não tem caracter sufiente antes do @ ");// não achou o @
						fluindo = false;
					}
				}
			}
		}
		if (fluindo) {
			for (int i = 0; i < email.length(); i++) {// contador até o @
				if (email.charAt(i) == '.') {// verificação se tem ponto antes	 do @
					JOptionPane.showMessageDialog(null, "tem . antes do @");
					break;
				} else {
					fluindo = false;
				}
			}
			for (int k = t1 + 1; k < email.length(); k++) {// for para depois do
															// @
				if (email.contains(".com")) {// verifica se tem .com depois do @
					fluindo = true;
					JOptionPane.showMessageDialog(null, "tem .com após o @");// verificação após  @
					break;
				} else {
					fluindo = false;
				}
			}
		}
		if (!fluindo) {
			JOptionPane.showMessageDialog(null, "não tem o necessario para  um email ");
		}
		if (fluindo) {
			JOptionPane.showMessageDialog(null, "tem de tudo apra ser um email");
		}
	}
}
