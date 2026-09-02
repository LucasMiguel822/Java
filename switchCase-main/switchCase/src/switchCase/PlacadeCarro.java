import java.util.Scanner;

public class PlacadeCarro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o ultimo digito da sua placa");
		numero = ler.nextInt();
		
		switch(numero){
			case 1:
			case 2:
				System.out.println("Você não pode dirigir as segundas");
				break;
				case 3:
				case 4:
					System.out.println("Você não pode dirigir as terças");
					break;
				case 5:
				case 6:
					System.out.println("Você não pode dirigir as Quartas");
					break;
				case 7:
				case 8:
					System.out.println("Você não pode dirigir as Quintas");
					break;
					case 9:
					case 0:
						System.out.println("Você não pode dirigir as sextas");
						break;
						default:
							System.out.println("Dia invalido");
		}

	}

}
