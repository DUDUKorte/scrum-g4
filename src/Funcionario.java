package src; //Pacote src = pasta com todas as classes do código fonte
// Importação das bibliotecas a serem usadas:
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{
    private String cargo;
    private String salario;
    private int nivel = 0; //é definido pelo gerente em outro método
    private BancoDeDados bancoDeDados;
    private String senha = null; //Definida pela primeira vez no setSenha
    private boolean acessoSistemaPessoal = false; //pra verificação de alterar os dados pessoais
    private List<String> hitoricoEmpregos = new ArrayList<>(); //Lista com o histórico de empregos do funcionário, ele mesmo pode adicionar e o gerente vai visualizar
    private List<String> treinamentos = new ArrayList<>(); //Lista com treinamentos do funcionário
    private List<String> feedbacks = new ArrayList<>(); //Lista com feedbacks do funcionário

    //Método construtor
    Funcionario(String cargo, String salario, String nome, int idade, String telefone, String endereco, String genero, String cpf, String email){
        super(nome, idade, telefone, endereco, genero, cpf, email);
        this.cargo = cargo;
        this.salario = salario;
    }

    //Pega e seta cargos
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //Pega e seta salario
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }

    //Pega e seta nível
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //Setter banco de dados para usar o mesmo banco de dados do main, apenas provisório, quando fizermos o banco de dados on-line de fato, esse método será decscartado
    public void setBancoDeDados(BancoDeDados bancoDeDados){
        this.bancoDeDados = bancoDeDados;
    }

    //Método para verificar se o funcionário já fez login e se tem o acesso ao sistema pessoal para alterar seu atributos, usado no acessoPessoalFuncionario.java
    public boolean getAcessoSistemaPessoal(){
        return acessoSistemaPessoal;
    }

    //Setter da senha, funciona no primeiro uso para criar a senha, depois tem que redefinir, sistema de redefinição não funciona ainda
    public void setSenha(String newSenha){
        if(senha != null){
            this.senha = newSenha;
        }else{
            System.out.println("Uma solicitação de redefinição de senha foi enviada para seu email!");
        }
    }

    //Adicionar itens às listas com empregos anteriores, treinamentos e feedbacks
    public void addHistoricoEmpregos(String emprego){
        this.hitoricoEmpregos.add(emprego);
    }
    public void addTreinamentos(String treinamento){
        this.treinamentos.add(treinamento);
    }
    public void addFeedback(String feedback){
        this.feedbacks.add(feedback);
    }

    //Retorna as listas com empregos anteriores, treinamentos e feedbacks
    public List<String> getHistoricoEmpregos(){
        return this.hitoricoEmpregos;
    }
    public List<String> getTerinamentos(){
        return this.treinamentos;
    }
    public List<String> getFeedbacks(){
        return this.feedbacks;
    }

    //Função de acessar o sistema, vai liberar o acesso a metódos de visualizar e atualizar infos pessoais
    public void acessarSistema(String email, String senha){
        if((email.equals(this.email)) && (senha.equals(this.senha))){
            this.acessoSistemaPessoal = true;
        }else{
            System.out.println("Email e/ou Senha incorreto(s)!");
        }
    }

    //Método para o funcionário visualizar suas prórprias informações
    public void visualizarInformacoesPessoais(){
        if(acessoSistemaPessoal){
            System.out.println();
            System.out.println("Nome: "+this.nome);
            System.out.println("Idade: "+this.idade);
            System.out.println("Telefone: "+this.telefone);
            System.out.println("Endereço: "+this.endereco);
            System.out.println("Gênero: "+this.genero);
            System.out.println("CPF: "+this.cpf);
            System.out.println("Email: "+this.email);
            System.out.println();
        }else{
            System.out.println("Você não possui acesso!");
        }
    }

    //Método para alterar as informações pessoas do funcionário
    public void atualizarInformacoesPessoais(String atributo, String valor){
        if(acessoSistemaPessoal){ //Verifica se o funcionário tem acesso
            if(!atributo.equals("cargo") || !atributo.equals("salario")){ //Não permite o funcionário alterar seu próprio cargo ou salário (seria muito bom se desse)
                this.bancoDeDados.atualizarAtributoFuncionario(this.nome, atributo, valor); //Altera atributo pelo método do banco de dados que já tá pronto
            }
        }else{
            System.out.println("Você não possui acesso!");
        }
    }
}
