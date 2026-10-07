
public class somatoria {

	public static void main(String[] args) {
		int i = 1, soma= 0;
		
		do {
			soma = soma + i;
			i = i + 2;
		} while(i <= 1000);
		
		System.out.println(soma);

	}

}
