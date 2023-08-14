import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o valor de saque?");
        double valorSolicitado = scan.nextDouble();

        if(valorSolicitado <= saldo) {
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.printf("Saldo atual: %.2f", saldo);
    }
}
