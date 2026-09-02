package switchCase;

import java.util.Scanner;

public class EscolaFutebol {

	public static void main(String[] args) {
	   Scanner ler = new Scanner (System.in);
	   int idade;
	   
	   System.out.println("Informe a idade do atleta");
	   idade = ler.nextInt();
	   
	   switch(idade) {
	   case 6:
		   System.out.println("O atleta é da categoria: dente de leite");
		   break;
	   case 7:
		   System.out.println("O atleta é da categoria: júnior");
		   break;
	   case 8:
		   System.out.println("O atleta é da categoria: júnior max");
		   break;
	   case 9:
		   System.out.println("O atleta é da categoria: júnior master");
		   break;
	   case 10:
		   System.out.println("O atleta é da categoria: master");
		   break;
	   default:
		   System.out.println("A escola não aceita jogadores dessa idade");
	   }
	}

}
