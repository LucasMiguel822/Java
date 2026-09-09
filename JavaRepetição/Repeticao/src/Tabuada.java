import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int numero, i = 0, resultado; 
	    
	    
         System.out.println("Insira o numero");
         numero = ler.nextInt();
	    while(i <= 10) {
	    	resultado = numero * i;
	    	System.out.println(numero + " x "+ i + " = "+ resultado);
	    	i++;
	    }

	}

}
