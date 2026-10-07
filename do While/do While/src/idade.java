import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 0, aA, aN, idade, test;
		
		do {
			System.out.println("Informe o ano atual");
			aA = ler.nextInt();
			
			System.out.println("Informe o seu ano de nascimento");
			aN = ler.nextInt();
			
			idade = aA - aN;
			
			if(idade >= 18) {
				System.out.println("Você tem " + idade  +" anos Você é maior de idade");
			} else {
				System.out.println("Você tem " + idade  +" anos Você é menor de idade");
			}
			
			System.out.println("deseja continuar a execução (1 para Sim ou 2 para Não)");
			test = ler.nextInt();
			
			switch(test) {
			case 1:
				i = 1;
				break;
			default:
				System.out.println("ate mais");
				i = 2;
			}
			
		} while(i == 1);

	}

}
