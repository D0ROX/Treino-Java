package Tudo.Banco;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente (String titular){
        super(titular);
    }

    @Override
    public void sacar(double valor){

        double valorComTaxa = valor + 2;
        
        super.sacar(valorComTaxa);
    }
    
}
