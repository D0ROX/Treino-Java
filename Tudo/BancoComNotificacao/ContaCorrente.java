package Tudo.BancoComNotificacao;

public class ContaCorrente extends ContaBancaria implements Tributavel {

    public ContaCorrente (String titular){
        super(titular);
    }

    @Override
    public void sacar(double valor){

        double valorComTaxa = valor + 2;
        
        super.sacar(valorComTaxa);
    }

    @Override
    public double getValorImposto(){
        return this.saldo*0.01;
    }
    
}
