import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número de Conta:");
        int usuario = scanner.nextInt();

        System.out.println("Por favor, digite o seu Nome:");
        String nome = scanner.next();
        System.out.println("Por favor, digite o seu Sobrenome:");
        String sobrenome = scanner.next();
        String nomeCliente = nome +" "+ sobrenome;
        System.out.println("Por favor, digite o seu Saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+usuario+" e seu saldo "+saldo+" já está disponível para saque.");

            }
}
