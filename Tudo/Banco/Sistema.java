package Tudo.Banco;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            try{
                System.out.println("Informe o nome do titular: ");
                String titular = sc.nextLine();

                System.out.println("Quer criar uma conta corrente? (SIM-1 / NÃO-2) ");
                int tipo = sc.nextInt();

                ContaBancaria contaAtiva;

                if(tipo == 1){
                    contaAtiva = new ContaCorrente(titular);
                    System.out.println("Conta corrente criada com sucesso! ");
                } else {
                    contaAtiva = new ContaBancaria(titular);
                    System.out.println("Conta bancária criada com sucesso! ");
                }
                sc.nextLine();

                boolean continuarConta = true;
                while (continuarConta) {
                    try {
                         System.out.println("\n--- MENU DA CONTA: " + contaAtiva.getTitular() + " ---");
                    System.out.println("1-Depositar | 2-Sacar | 3-Saldo | 4-Trocar de Cliente");
                    int opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                                System.out.println("Informe o valor do depósito: ");
                                contaAtiva.depositar(sc.nextDouble());
                            break;
                        case 2:
                                System.out.println("Informe o valor do saque: ");
                                contaAtiva.sacar(sc.nextDouble());
                                break;
                        case 3:
                                System.out.printf("Saldo atual %.2f%n ", contaAtiva.getSaldo());
                                break;
                        case 4:
                                continuarConta = false;
                                sc.nextLine();
                                break;
                    
                        default:
                            System.out.println("Opção inválida! ");
                            break;
                    }
                    } catch (Exception e) {
                        System.out.println("Entrada inválida, tente novamente! ");
                    }
                }


            } catch(Exception e){
                System.out.println("Entrada inválida, digite um nome válido! ");
                sc.nextLine();
            }
        }
    }
}
