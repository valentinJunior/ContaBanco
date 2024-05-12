
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome e aperte ENTER");
        String nomeCliente = scanner.next();

        System.out.println("Digite sua agencia e aperte ENTER");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta e aperte ENTER");
        int conta = scanner.nextInt();

        System.out.println("Digite o valor do deposito e aperte ENTER");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " Obrigado por abrir uma conta em nosso Banco!!!");
        System.out.println("Sua Agencia é: " + agencia);
        System.out.println("Sua Conta é: " + conta);
        System.out.println("Seu saldo disponivel para saque é: " + saldo);
    }
}
