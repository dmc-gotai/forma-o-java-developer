import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Qual foi a nota?");
            int nota = scan.nextInt();
            scan.nextLine();

            if (nota <= 4) {
                System.out.println("Reprovado");
            } else if (nota < 6) {
                System.out.println("Em recuperaçao.");
            } else {
                System.out.println("Aprovado!");
            }
        }
    }
}
