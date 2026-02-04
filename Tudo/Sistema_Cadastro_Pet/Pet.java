package Tudo.Sistema_Cadastro_Pet;

public class Pet {

    String nome;
    String especie;
    int idade;

    public Pet(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
}

    public String getNome(){
        return this.nome;
    }

    public String getEspecie(){
        return this.especie;
    } 

    public int getIdade(){
        return this.idade;
    }
    
    public void exibirDados(){
        System.out.println("----- Dados do pet -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especie: " +  this.especie);
        System.out.println("Idade: " + this.idade);
    }

    public void fazerSom(){
        if(this.especie.equalsIgnoreCase("Cão")){
            System.out.println(this.nome + " Diz: Au au!");
        } else if(this.especie.equalsIgnoreCase("Gato")){
                System.out.println(this.nome + " Diz: Miau!");
        } else {
            System.out.println(this.nome + " Faz um som desconhecido");
        }
    }

    public void fazerAniversario(){
        this.idade++;
        System.out.println("Parabés " + this.nome + " vc completou mais um ano de vida! Nova idade: " + this.idade);
    }


    }

    
