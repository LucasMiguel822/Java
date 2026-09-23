import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 0, expoente, numero, resultado = 1;
		
		System.out.println("Informe o numero");
		numero = ler.nextInt();
		
		System.out.println("Informe o expoente");
		expoente = ler.nextInt();
		
		if(expoente == 0) {
			System.out.println("O resultado é: 1");
		}else {
			
		
		do {
			
			resultado = numero * resultado;
   			i++;
		} while(i < expoente);
		
        System.out.println("O resultado é: "+ resultado);
		}
	
		ler.close();
	}

}
