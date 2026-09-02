import java.util.Scanner;
public class idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoAtual,anoNasc,idade;
		
		System.out.println("informe o ano atual");
		anoAtual=ler.nextInt();
		System.out.println("informe o ano de nascimento");
		anoNasc=ler.nextInt();
		idade = anoAtual - anoNasc;
		if(idade < 18) {
			System.out.println("sua idade é: "+idade);
			System.out.println("você é menor de idade");
		}
		else {
			System.out.println("sua idade é: "+idade);
			System.out.println("você é maior de idade");
		}
		
	}

}
