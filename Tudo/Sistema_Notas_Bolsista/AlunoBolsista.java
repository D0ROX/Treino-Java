package Tudo.Sistema_Notas_Bolsista;

public class AlunoBolsista extends Aluno {

    public AlunoBolsista(String nome){
        super(nome);
    }

    @Override
    public double calcularMedia(){
        return super.calcularMedia() *1.1;
    }
    
}
