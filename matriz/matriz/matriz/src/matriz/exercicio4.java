package matriz;

import java.util.Random;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[][],n, acertos = 0, t = 0, usado = 0, i, j;
		a = new int[4][4];
		Random in = new Random(75);
		
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				a[i][j] = in.nextInt(75) + 1;
			}
		}	
		
		while(acertos < 16) {
			System.out.println("digite o numero entre 1 e 75");
			n = ler.nextInt();
			
			for(i = 0; i < 4; i++) {
				for(j = 0; j < 4; j++) {
					if(n <= 0) {
						System.out.println("Numero invalido");
						break;
					}
					else if(n >75) {
						System.out.println("Numero invalido");
						break;
					}
					if(n == a[i][j]) {
						acertos++;
						System.out.println("Você acertou um numero");
						a[i][j] = 0;
					}
				}
			}	
			t++;
		}
		
		System.out.println("BINGO você acertou em " + t + " tentativas");

	}

}
