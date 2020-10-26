package Prova_Clavison;

public class questão2 {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		for(int i=0; i<10; i++){
			vetor[i] = i*3;
			if(vetor[i]>10)
				vetor[i] = vetor[i] - (2*i);
			System.out.println(vetor[i]);
		}

	}

}
