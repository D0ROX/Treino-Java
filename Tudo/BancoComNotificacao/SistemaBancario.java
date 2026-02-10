package Tudo.BancoComNotificacao;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria contaAtiva = null; 

        while(true){
            try {
                // ETAPA 1: CRIAÇÃO DA CONTA E CONFIGURAÇÃO (Só acontece uma vez por cliente)
                if (contaAtiva == null) {
                    System.out.println("Informe o nome do titular: ");
                    String titular = sc.nextLine();

                    System.out.println("Quer criar uma conta corrente? (1-SIM / 2-NÃO) ");
                    int tipo = sc.nextInt();
                    
                    if(tipo == 1){
                        contaAtiva = new ContaCorrente(titular);
                    } else {
                        contaAtiva = new ContaBancaria(titular);
                    }

                    // 🟢 MOVI PARA CÁ: Pergunta a notificação logo após criar a conta
                    System.out.println("Escolha o canal de notificação: 1-Email / 2-SMS");
                    int n = sc.nextInt();
                    if(n == 1) {
                        contaAtiva.setNotificacao(new Email());
                    } else {
                        contaAtiva.setNotificacao(new SMS());
                    }

                    System.out.println("Conta configurada com sucesso!");
                    sc.nextLine(); // Limpa o buffer para não pular o próximo input
                }

                // ETAPA 2: MENU DE OPERAÇÕES (Fica repetindo aqui)
                System.out.println("\n--- MENU: " + contaAtiva.getTitular() + " ---");
                System.out.println("1-Depositar | 2-Sacar | 3-Saldo | 4-Trocar de Cliente | 5-Sair");
                int opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Valor depósito: ");
                        contaAtiva.depositar(sc.nextDouble());
                        break;
                    case 2:
                        System.out.println("Valor saque: ");
                        contaAtiva.sacar(sc.nextDouble()); // A notificação já foi setada lá em cima!
                        break;
                    case 3:
                        System.out.printf("Saldo: R$ %.2f%n", contaAtiva.getSaldo());
                        break;
                    case 4:
                        contaAtiva = null; // Reseta para pedir nome e notificação de novo
                        sc.nextLine(); 
                        break;
                    case 5:
                        System.out.println("Encerrando... Até logo!");
                        sc.close();
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida!");
                }

            } catch(Exception e){
                System.out.println("Erro na entrada! Tente novamente.");
                sc.nextLine(); 
            }
        }
    }
}