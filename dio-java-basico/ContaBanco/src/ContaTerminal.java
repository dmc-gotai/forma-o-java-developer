import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, informe o número da conta: ");
        int numeroConta = input.nextInt();
        input.nextLine();

        System.out.println("Por favor, informe o número da Agência: ");
        String numeroAgencia = input.nextLine();

        System.out.println("Por favor, informe seu nome e sobrenome: ");
        String nomeCliente = input.nextLine();

        System.out.println("Por favor, informe o seu saldo: ");
        double saldoAtual = input.nextDouble();
        input.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.\nSua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.", nomeCliente, numeroAgencia, numeroConta, saldoAtual);

    }
}
