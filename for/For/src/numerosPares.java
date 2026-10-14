import java.util.Scanner;

public class numerosPares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		int n, par = 0;
		
		for(i = 1; i <= 10; i++) {
			System.out.println("informe o numero");
			n = ler.nextInt();
			
			if(n % 2 == 0) {
				par++;
			}
		}
		
		System.out.println(par +  " são pares");

	}

}
