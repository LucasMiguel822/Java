package vetor;

import java.util.Scanner;

public class vetorQuadrado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i < TAM; i++) {
			System.out.println("digite o " +(i+1)+ " numero do vetor");
			a[i] = ler.nextInt();
			
			b[i] = a[i] * a[i];
		}
		
		for(i =0; i < TAM; i++) {
		System.out.print(b[i] + " ");
		}

	}

}
