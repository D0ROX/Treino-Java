package Tudo.Sistema_Notas_Bolsista;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> listaDaTurma = new ArrayList<>();

        for(int i = 1; i <= 3; i++){

        System.out.println("Informe o nome do aluno " + i + ": ");
        String nome = sc.nextLine();

        System.out.println("O aluno é bolsista? (SIM - 1 / NÃO - 2) ");
        int tipo = sc.nextInt();

        Aluno alunoTemp;

        if(tipo == 1){
             alunoTemp = new AlunoBolsista(nome);
        } else {
             alunoTemp = new Aluno(nome);
        }

        for(int j = 1; j <= 3; j++){
            double notaTemp;
            System.out.println("Nota " + j + ": ");
            notaTemp = sc.nextDouble();

            alunoTemp.adicionarNota(notaTemp);
            
        }

            listaDaTurma.add(alunoTemp);
            sc.nextLine();
        }
        
        System.out.println("Se media > 7, aprovado! ");
        

        for (Aluno a : listaDaTurma) {
    System.out.println("Nome: " + a.getNome());
    System.out.printf("Média: %.2f %n", a.calcularMedia());

    if (a instanceof AlunoBolsista) {
        System.out.println(">> Este aluno possui bônus de incentivo!");
    }
}
    }
}

