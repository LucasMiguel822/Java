import java.util.Scanner;

public class AnoNascimento {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int anoN, anoA, idade, i=1;
		
		while(i <= 6) {
			System.out.println("Insira o ano atual");
			anoA = ler.nextInt();
			System.out.println("Insira o seu ano de nascimento da pessoa: "+ i);
			anoN = ler.nextInt();
			idade = anoA - anoN;
			System.out.println("A idade da pessoa "+ i + "é: "+ idade);
			if (idade >= 18) {
				System.out.println("A pessoa " + i + " é maior de idade");
			}
			else {
				System.out.println("A pessoa " + i + " é menor de idade");
			}
			i++;
		}

	}

}
