package Tudo.BancoComNotificacao;

public class GerenciadorDeImposto {

    private double totalImposto;

    public void calcular(Tributavel t){
        this.totalImposto += t.getValorImposto();

    }

    public double getTotalImposto(){
        return this.totalImposto;
    }
    
}
