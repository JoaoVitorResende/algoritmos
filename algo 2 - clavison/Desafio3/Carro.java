package Desafio3;

public class Carro {
	String marca,modelo,cor,placa;
	int ano;
	int n;
	String [] pessoas ;
	@Override
	public String toString() {
		String p ="";
		for (int i = 0; i < pessoas.length; i++) {
			p+=pessoas[i]+"\n";
		}
		return "\n marca "+marca+"\n modelo "+modelo+"\n cor "+cor+"\n placa "+placa+"\n ano "+ano+"\n"+p;
	}
}
