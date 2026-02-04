package Tudo.Sistema_Cadastro_Pet;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        
        Pet Cão1 = new Pet ("Rex", "Cão", 3);
        Pet Gato1 = new Pet("Thor", "gato", 2);

        Cão1.exibirDados();
        Cão1.fazerSom();
        Cão1.fazerAniversario();
        Cão1.fazerAniversario();

        Gato1.exibirDados();
        Gato1.fazerSom();
        Gato1.fazerAniversario();
        
    }
}
