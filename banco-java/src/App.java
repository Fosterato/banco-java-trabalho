import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria contaBancaria = new ContaBancaria(null, null, 0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(null, null, 100);
        ContaCorrente contaCorrente = new ContaCorrente(null, null, 0);
        
        contaCorrente.CalcularCdb(500);

        
    }
}
