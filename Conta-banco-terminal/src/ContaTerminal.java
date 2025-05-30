import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Entrada de dados
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Por favor, digite o número da Agência: ");
            agencia = scanner.nextLine();

            System.out.print("Por favor, digite o número da Conta: ");
            numero = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            System.out.print("Por favor, digite o nome do Cliente: ");
            nomeCliente = scanner.nextLine();

            System.out.print("Por favor, digite o saldo da Conta: ");
            saldo = scanner.nextDouble();

            // Mensagem final usando concatenação
            String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque.");

            System.out.println(mensagem);
        }
    }
}