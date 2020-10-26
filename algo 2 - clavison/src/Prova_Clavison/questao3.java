package Prova_Clavison;

public class questao3 {

	public static void main(String[] args) {
		String[] v1 = new String[10];
		String[] v2 = new String[10];
		String[] v3 = new String[10];
		for(int i=0; i<10; i++){
			v1[i] = "N"+i;
			v2[i] = "x";
			v3[i] = "x";
			if(i%2==0)
				v2[i]=v1[i];
			else
				v3[i]=v1[i];
			System.out.println(v1[i]+"-"+v2[i]+"-"+v3[i]);
	}

	}

}
