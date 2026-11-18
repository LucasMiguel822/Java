package matriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[][], n = 2, i , j;
		a = new int[4][4];
		
	
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				a[i][j] = n;
				n = n + n;
			}
		}
		
		for(i = 0; i < 4; i++) {
			System.out.println();
			for(j = 0; j < 4; j++) {
				System.out.print(a[i][j] + " ");
			}
		}	
	}

}
