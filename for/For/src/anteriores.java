import java.util.Scanner;

public class anteriores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		int n;
		
		System.out.println("Informe o numero desejado");
		n = ler.nextInt();
		
		for(i = n; i >= 1; i--) {
			System.out.println(i);
		}

	}

}
