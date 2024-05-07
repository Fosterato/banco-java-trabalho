import java.util.Scanner;


public class ContaBancaria {
    String titular;
    double saldo;
    String numeroDaConta;
    double limiteEspecial = 1000;

    ContaBancaria(String numeroDaConta, String titular, double saldo){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void deposito(double valorDeposito){
       saldo += valorDeposito;
       System.out.println("Seu saldo atual e de: " + saldo);
    }
    
    public void saque(double valorDoSaque){
        if(saldo >= valorDoSaque){
            saldo = saldo - valorDoSaque;
            System.out.println("Operacao realizada com sucesso");
            System.out.println("Seu saldo atual e de: " + saldo);
        }
        else if(valorDoSaque > saldo && valorDoSaque < limiteEspecial){
            System.out.println("Operacao realizada com sucesso");
            System.out.println("Essa operacao acarretou em uso de limite especial");
            limiteEspecial -= valorDoSaque;
            System.out.println("Seu limite especial atual e de: " + limiteEspecial);
        }
        else{
        System.out.println("Nao ha limite disponivel para realizar essa operacao");
        }
    }

}

