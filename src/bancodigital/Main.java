package bancodigital;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("cliente1");

        Conta correnteCliente1 = new ContaCorrente(cliente1);
        Conta poupancaCliente1 = new ContaPoupanca(cliente1);

        correnteCliente1.depositar(100);
        correnteCliente1.transferir(100, poupancaCliente1);

        correnteCliente1.imprimirExtrato();
        poupancaCliente1.imprimirExtrato();

        poupancaCliente1.transferir(50, correnteCliente1);

        correnteCliente1.imprimirExtrato();
        poupancaCliente1.imprimirExtrato();

        correnteCliente1.sacar(50);
        poupancaCliente1.sacar(50);

        correnteCliente1.imprimirExtrato();
        poupancaCliente1.imprimirExtrato();
    }

}