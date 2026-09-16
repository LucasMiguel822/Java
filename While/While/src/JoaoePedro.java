import java.util.Scanner;

public class JoaoePedro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double joao = 1.34, pedro = 1.45;
        int ano = 0;

        while (joao < pedro) {
            System.out.printf(" o joão tinha %.2f metros%n", joao);
            System.out.printf(" o pedro tinha %.2f metros%n", pedro);
            
            joao = joao + 0.025;
            pedro = pedro + 0.02;
            ano++;
        }
        System.out.println("O João estara mais alto que pedro em " + ano + " anos");
    }
}