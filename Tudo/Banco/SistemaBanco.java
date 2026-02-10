package Tudo.Banco;

import java.util.Scanner;

public class SistemaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaramos fora do loop para o Java não se perder no escopo
        ContaBancaria contaAtiva = null; 

        while(true){
            try {
                // Se não temos uma conta ativa, precisamos criar uma
                if (contaAtiva == null) {
                    System.out.println("Informe o nome do titular: ");
                    String titular = sc.nextLine();

                    System.out.println("Quer criar uma conta corrente? (1-SIM / 2-NÃO) ");
                    int tipo = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer

                    if(tipo == 1){
                        contaAtiva = new ContaCorrente(titular);
                    } else {
                        contaAtiva = new ContaBancaria(titular);
                    }
                    System.out.println("Conta criada com sucesso!");
                }

                // Menu de Operações
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
                        contaAtiva.sacar(sc.nextDouble());
                        break;
                    case 3:
                        System.out.printf("Saldo: R$ %.2f%n", contaAtiva.getSaldo());
                        break;
                    case 4:
                        contaAtiva = null; // Reseta para o loop pedir nome de novo
                        sc.nextLine(); 
                        break;
                    case 5:
                        System.out.println("Encerrando o sistema bancário... Até logo!");
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }

            } catch(Exception e){
                System.out.println("Erro na entrada! Tente novamente.");
                sc.nextLine(); // Limpa o lixo do Scanner para não travar
            }
        }
    }
}