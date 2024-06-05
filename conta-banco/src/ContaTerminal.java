import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("digite o numero da conta:" );
        int numero = scanner.nextInt();

        System.out.println("digite seu nome:" );
        String nomeCliente = scanner.next();

        System.out.println("digite o numero da agencia:" );
        String agencia = scanner.next();

        System.out.println("digite seu saldo:" );
        Double saldo = scanner.nextDouble();

       System.out.println("ola "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é ["+ agencia + "], conta [" + numero + "] e seu saldo de ["+ saldo + "] ja esta disponivel para saque");

    }
}
