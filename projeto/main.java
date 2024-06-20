public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("123", 1000.0, 500.0);
        ContaPoupanca conta2 = new ContaPoupanca("456", 500.0, 1.5);

        conta1.depositar(200.0);
        conta1.sacar(1500.0); // saldo insuficiente

        conta2.depositar(300.0);
        conta2.aplicarRendimento();

        conta1.transferir(conta2, 500.0);
    }
}
