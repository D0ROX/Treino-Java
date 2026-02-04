package Tudo.Sistema_Notas;
import java.util.ArrayList;

public class Aluno {

    private String nome;
    private ArrayList<Double> notas;

    public Aluno(String nome){
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota){
        this.notas.add(nota);
    }

    public double calcularMedia(){
        double soma = 0;

        for (double n : notas){
            soma += n;
        }

        return soma / notas.size();
    }

    public String getNome(){
        return this.nome;
    }

    
}
