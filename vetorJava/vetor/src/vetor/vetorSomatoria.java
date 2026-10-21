package vetor;

import java.util.Scanner;

public class vetorSomatoria {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], soma = 0, media, i;
		a = new int[TAM];
		
		for(i=0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + " valor do vetor A");
			a[i] = ler.nextInt(); 
			
			soma = soma + a[i];
		}
		
		media = soma / TAM;
		System.out.println(media);

	}

}
