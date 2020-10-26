package Aula7;

public class Jogadores {
	String nome;
	String numerocamisa;
	String posicao;
	String time;
	int gols;
	
	@Override
	public String toString() {
		return "\n Nome "+nome+"\n numero da camisa "+numerocamisa+"\n posicao "+posicao+"\n nome do time "+time +"\n gols marcados "+gols;
	}
}
