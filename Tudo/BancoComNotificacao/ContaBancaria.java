package Tudo.BancoComNotificacao;

public class ContaBancaria {

    protected String titular;
    protected double saldo;
    protected Notificacao notificacao;

    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if (valor > 0 ){
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("O valor minimo de deposito é R$ 1,00 ");
        }
    }

    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } if(this.notificacao != null) {
            this.notificacao.enviar("Saque de R$ " + valor + " feito por " + this.titular);
        } else {
            System.out.println("Valor do saque maior que saldo! ");
        } 
        
    }

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setNotificacao(Notificacao notificacao){
        this.notificacao = notificacao;
        
    }
    
}