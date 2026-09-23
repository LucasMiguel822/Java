import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1, n, a = 0, b = 1, c;
		
		System.out.println("Informe ate onde vôce quer que a sequencia vá");
		n = ler.nextInt();
		
		do {
			c = a + b;
            a = b;
            b = c;
            System.out.println(a);
            i++;
		} while(i <= n);

		
	}

}
