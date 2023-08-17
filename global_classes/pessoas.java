package global_classes;

public class Pessoas{
    //Superclasse
    String nome;
    int idade;
    String telefone;
    String endereco;
    String genero;
    String cpf;

    public Pessoas(String nome, int idade, String telefone, String endereco, String genero, String cpf){
        //Método construtor
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
        this.genero = genero;
        this.cpf = cpf;
    }
}