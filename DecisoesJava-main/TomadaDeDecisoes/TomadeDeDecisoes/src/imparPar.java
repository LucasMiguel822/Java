import java.util.Scanner;

public class imparPar {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int a, b;
	
	System.out.println("Informe um numero inteiro");
	a = ler.nextInt();
	b = a % 2;
	if(b != 0){
		System.out.println("O seu numero é impar");
	}
	else {
		System.out.println("O seu numero é par");
	}
	}

}
