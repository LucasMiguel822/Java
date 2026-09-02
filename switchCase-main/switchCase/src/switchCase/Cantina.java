package switchCase;

import java.util.Scanner;

public class Cantina {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int codigo;
		
		System.out.println("Informe o codigo do item desejado");
		codigo = ler.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println("O cachorro quente custa R$8");
			break;
		case 2:
			System.out.println("O Cheeseburguer custa R$12");
			break;
		case 3:
			System.out.println("O X-Salada custa R$15");
			break;
		case 4:
			System.out.println("O Misto quente custa R$11");
			break;
		case 5:
			System.out.println("O Pão na chapa custa R$6");
			break;
		default:
			System.out.println("Numero invalido");
		}

	}

}
