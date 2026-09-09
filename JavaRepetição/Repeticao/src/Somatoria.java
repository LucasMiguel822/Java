
public class Somatoria {
     public static void main(String[] args) {
		int i = 0, soma = 0;
		
		while (i <= 100) {
			soma = i + soma;
			i++;
		}
		System.out.println("a somatoria é "+soma);
	}
}
