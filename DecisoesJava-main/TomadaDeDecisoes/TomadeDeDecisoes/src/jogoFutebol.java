import java.util.Scanner;
public class jogoFutebol {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int timeA, timeB;
		
		System.out.println("informe quantos gols o time A marcou");
		timeA = ler.nextInt();
		System.out.println("informe quantos gols o time B marcou");
		timeB = ler.nextInt();
		if(timeA >timeB){
			System.out.println("o resutado do jogo foi de "+timeA+" a "+ timeB);
			System.out.println("o time A ganhou");
		}
		if(timeB>timeA) {
			System.out.println("o resutado do jogo foi de "+timeB+" a "+ timeA);
			System.out.println("o time B ganhou");
		}
		else {
		System.out.println("o resutado do jogo foi de "+timeB+" a "+ timeA);
		System.out.println("o jogo acabou em empate");
		}
	}

}
