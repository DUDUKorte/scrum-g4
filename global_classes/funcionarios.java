package global_classes;

public class Funcionario(pessoas){
    //Superclasse herdando da classe pessoas
    double salario;
    String cargo;
    int nivel_de_acesso;

    public Funcionario(double salario, String cargo, int nivel_de_acesso){
        //Método construtor
        this.salario = salario;
        this.cargo = cargo;
        this.nivel_de_acesso = nivel_de_acesso;
    }
}