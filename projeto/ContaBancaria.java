// Classe base para Conta Bancária
public abstract class ContaBancaria {
    private String numeroConta;
    protected double saldo;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }

    public abstract void transferir(ContaBancaria destino, double valor);
}

// Classe para Conta Corrente (subclasse de ContaBancaria)
public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void transferir(ContaBancaria destino, double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada para conta " + destino.getNumeroConta());
        } else {
            System.out.println("Saldo insuficiente para transferência de R$" + valor);
        }
    }
}

// Classe para Conta Poupança (subclasse de ContaBancaria)
public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, double saldoInicial, double taxaRendimento) {
        super(numeroConta, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void transferir(ContaBancaria destino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada para conta " + destino.getNumeroConta());
        } else {
            System.out.println("Saldo insuficiente para transferência de R$" + valor);
        }
    }

    public void aplicarRendimento() {
        double rendimento = saldo * taxaRendimento / 100;
        saldo += rendimento;
        System.out.println("Rendimento aplicado. Novo saldo: R$" + saldo);
    }
}
