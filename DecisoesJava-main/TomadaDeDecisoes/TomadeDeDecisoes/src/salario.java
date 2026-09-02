import java.util.Scanner;
public class salario {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double salariop,salariom;
	
	System.out.println("Informe o seu salario");
	salariop = ler.nextDouble();
	System.out.println("Informe o salario minino");
	salariom = ler.nextDouble();
    if(salariop<salariom) {
    	System.out.println("o seu salario esta fora da lei");
    }
    else {
    	System.out.println("o seu salario esta dentro da lei");
    }

	}

}