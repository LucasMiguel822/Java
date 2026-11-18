package matriz;

import java.util.Random;;
public class exercicio2 {

	public static void main(String[] args) {
		int a[][], maior = -9999999, menor = 99999999, lmaior = 0, cmaior = 0, lmenor = 0, cmenor = 0, i, j;
		a = new int[3][3];
	    Random in = new Random();
	    
	    for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				a[i][j] = in.nextInt();
						
						if(a[i][j] > maior) {
							maior = a[i][j];
							lmaior = i;
							cmaior = j;
						}
						
						if(a[i][j] < menor) {
							menor = a[i][j];
							lmenor = i;
							cmenor = j;
						}
			}
		}
	    
	    System.out.println("O maior numero é " + maior + ". ele esta na linha " + (lmaior + 1) + " Coluna " + (cmaior + 1));
	    
	    System.out.println("O menor numero é " + menor + ". ele esta na linha " + (lmenor + 1) + " Coluna " + (cmenor + 1));
	    
	    for(i = 0; i < 3; i++) {
			System.out.println();
			for(j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
		}	

	}

}
