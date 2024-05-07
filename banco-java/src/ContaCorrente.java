import java.util.Scanner;

public class ContaCorrente extends ContaBancaria {
    Scanner scan = new Scanner(System.in);

    ContaCorrente(String numeroDaConta, String titular, double saldo) {
        super(numeroDaConta, titular, saldo);
    }
    

    public void CalcularCdb(double saldo){

    double retornoInvestimento = 0;
    
    System.out.println("Digite a quantidade que deseja investir no CDB");
    double valorInvestido = scan.nextDouble();

    System.out.println("Digite a quantidade de meses que deseja deixar o dinhero investido no CDB: ");
    int mesesInvestidos = scan.nextInt();

    if(valorInvestido > saldo){
        System.out.println("Saldo insuficiente para realizar o investimento, caso queira continuar com a solicitacao, faca um deposito");
        System.out.println("Seu saldo e de: " + saldo);
        System.out.println("O valor que voce deseja investir foi de: " + valorInvestido);
    }
    else{

    for(int indice = 0; mesesInvestidos > indice; indice++){
    retornoInvestimento += valorInvestido * 0.8875;
    }


    System.out.printf("O valor investido por %d meses e rendeu um total de: %.2f", mesesInvestidos, retornoInvestimento);
}    

    } 
}


