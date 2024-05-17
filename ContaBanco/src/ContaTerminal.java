import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Conhecer e importar a classe scanner

        //exibir as mensagens para o usuário

        //obter pela classe scanner os valores digitados no terminal

        //exibir mensagem da conta criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();  

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Construir a mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                          + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibir a mensagem
        System.out.println(mensagem);

       
    }
}
