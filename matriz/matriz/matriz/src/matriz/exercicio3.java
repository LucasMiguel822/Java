package matriz;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[][], r, i, j;
		a = new int[3][4];
		
		for(i = 0; i < 3; i++) {
			r = 0;
			for(j = 0; j < 3; j++) {
				System.out.println("digite o " + (j + 1) + " numero da coluna " + (i + 1));
				a[i][j] = ler.nextInt();
				
				r = a[i][j] + r;
			}
			a[i][3] = r;
		}
		
		for(i = 0; i < 3; i++) {
			System.out.println();
			for(j = 0; j < 4; j++) {
				System.out.print(a[i][j] + " ");
			}
		}	

	}

}
