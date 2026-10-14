import java.util.Scanner;

public class maior {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		int n, maior = 0;
		
		for(i = 1; i <= 10; i++) {
			System.out.println("Informe o numero");
			n = ler.nextInt();
			
			if(n > maior) {
				maior = n;
			}
		}
		System.out.println("o maior numero é "+ maior);

	}

}
