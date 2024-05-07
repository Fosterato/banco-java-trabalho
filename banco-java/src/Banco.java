import java.util.ArrayList;

public class Banco {

   public ArrayList<ContaBancaria> contas;

   public Banco(){
    contas = new ArrayList<>();
   }

   public void adicionarConta(ContaBancaria conta){
    this.contas.add(conta);
   }

    public void excluirConta(){
    this.contas.remove(contas);
   }

   public ContaBancaria gerenciarConta(String numeroDaConta){
    for(ContaBancaria conta : contas){
        if(conta.getNumeroDaConta() == numeroDaConta){
            return conta;
        }
    }
    return null;
   }


}


