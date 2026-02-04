package Tudo.Sistema_Notas;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do aluno1 ");
        String aluno1 = sc.nextLine();

        Aluno a1 = new Aluno(aluno1);

        for(int i = 1; i <= 3; i++){
            double notaTemp;
            System.out.println("Informe a nota " + i + " :");
            notaTemp = sc.nextDouble();

            a1.adicionarNota(notaTemp);
        }

       System.out.println("Media do " + a1.getNome() + ": " + a1.calcularMedia() );
       
       if(a1.calcularMedia() > 7){
        System.out.println("Parabéns, o aluno foi aprovado! ");
       } else{
        System.out.println("O aluno não atingiu a nota necessária, tera q refazer os testes! ");
       }
    }
}
