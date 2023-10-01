package src; //Pacote src = pasta com todas as classes do código fonte

public class Associado extends Pessoa{
    String tituloAssociado; //título do associado, pode ser nome, id, etc... é um identificador dele
    DadosDePagamento dadosDePagamento; //Objeto de método de pagamento, como foi adicionado dps, deve usar o método setDadosPagamento pra adicionar/alterar

    public Associado(String nome, int idade, String telefone, String endereco, String genero, String cpf, String email, String tituloAssociado){ //Método construtor
        super(nome, idade, telefone, endereco, genero, cpf, email); //Super de pessoa
        this.tituloAssociado = tituloAssociado; //Definição do título associado
    }

    //Pegar e setar titulo associado
    public String getTituloAssociado() {
        return tituloAssociado; //Retorna o valor solicitado
    }
    public void setTituloAssociado(String tituloAssociado) {
        this.tituloAssociado = tituloAssociado; //Define o novo valor na variável da classe
    }

    //Setar dados de pagamento, tanto para definir inicarl como atualizar
    public void setDadosPagamento(DadosDePagamento dadosDePagamento){
        this.dadosDePagamento = dadosDePagamento;
    }

}
