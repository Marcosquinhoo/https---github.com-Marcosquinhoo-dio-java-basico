        import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, agencia;
        int conta;
        double saldo;

        System.out.println("Olá, Mundo!! Desenvolvendo meu projeto!!");

        // TODO: Conhecer e importar a classe Scanner

        // Exibir as menssagens para o nosso usuário

        // Obter pela scanner os valores digitados no terminal
        System.out.println("Cliente, Qual seu nome? ");
        nome = scanner.nextLine();

        System.out.println("Número da conta? ");
        conta = scanner.nextInt();

        // Limpar o buffer do scanner após ler um int
        scanner.nextLine();

        System.out.println("Digite o número da agência: ? ");
        agencia = scanner.nextLine();

        System.out.println("Qual é seu saldo? ");
        saldo = scanner.nextDouble();

        System.out.println("Olá cliente " + nome + ", Obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");

        // Fechar scanner para evitar vazamento de recursos
        scanner.close();
    }

}
