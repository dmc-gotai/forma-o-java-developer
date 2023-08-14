import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Ola, " + args[0]);
        System.out.println("Bem vindo ao mundo " + args[1]);

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Quantos anos você tem?");
            int idade = input.nextInt();
            System.out.printf("Idade informada: %d anos", idade);
        }
    }
}
