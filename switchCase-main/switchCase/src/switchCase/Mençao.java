package switchCase;

import java.util.Scanner;

public class Mençao {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
        String mencao;
        
        System.out.println("Informe a menção do aluno");
        mencao = ler.next();
        
        switch(mencao) {
        case "i":
        case "I":
        	System.out.println("Desempenho insatisfatorio");
        	break;
        case "r":
        case "R":
        	System.out.println("Desempenho regular");
        	break;
        case "b":
        case "B":
        	System.out.println("Bom desempenho ");
        	break;
        case "mb":
        case "MB":
        	System.out.println("Exelente desempenho");
        	break;
        default:
        	System.out.println("Invalido");
        }
	}

}
