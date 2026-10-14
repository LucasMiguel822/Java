import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		int n, resultado = 0;
		
		for(i = 1; i <= 10; i++) {
			System.out.println("Informe o numero");
			n = ler.nextInt();
			
			resultado = resultado + n;
		}
		System.out.println("o resultado é " + resultado);

	}

}
