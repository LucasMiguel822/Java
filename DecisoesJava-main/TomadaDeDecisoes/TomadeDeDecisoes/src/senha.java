import java.util.Scanner;
public class senha {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String senha;
		
		System.out.println("insira a senha");
		senha=ler.next();
		
		if(senha.equalsIgnoreCase("senha123")){
			System.out.println("acesso permitido");
		}
		else {
			System.out.println("acesso negado");
		}

	}

}
