package Tudo.Sistema_Notas_Lista_Dupla;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> listaDaTurma = new ArrayList<>();

        for(int i = 1; i <= 3; i++){

        System.out.println("Informe o nome do aluno " + i + ": ");
        String nome = sc.nextLine();

        Aluno alunoTemp = new Aluno(nome);

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

        for(Aluno a : listaDaTurma){
            System.out.println("Nome: " + a.getNome());
            System.out.println("media: " + a.calcularMedia());
        }
    }
}

