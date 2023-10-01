package src;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{
    private String cargo;
    private String salario;
    private int nivel = 0;
    private BancoDeDados bancoDeDados;
    private String senha = null;
    private boolean acessoSistemaPessoal = false;
    private List<String> hitoricoEmpregos = new ArrayList<>();
    private List<String> treinamentos = new ArrayList<>();
    private List<String> feedbacks = new ArrayList<>();

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

    public void setBancoDeDados(BancoDeDados bancoDeDados){
        this.bancoDeDados = bancoDeDados;
    }

    public boolean getAcessoSistemaPessoal(){
        return acessoSistemaPessoal;
    }

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

    public void acessarSistema(String email, String senha){
        if((email.equals(this.email)) && (senha.equals(this.senha))){
            this.acessoSistemaPessoal = true;
        }else{
            System.out.println("Email e/ou Senha incorreto(s)!");
        }
    }

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

    public void atualizarInformacoesPessoais(String atributo, String valor){
        if(acessoSistemaPessoal){
            if(!atributo.equals("cargo") || !atributo.equals("salario")){
                this.bancoDeDados.atualizarAtributoFuncionario(this.nome, atributo, valor);
            }
        }else{
            System.out.println("Você não possui acesso!");
        }
    }
}
