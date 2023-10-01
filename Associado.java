
public class Associado extends Pessoa{
    String tituloAssociado;
    DadosDePagamento dadosDePagamento;

    public Associado(String nome, int idade, String telefone, String endereco, String genero, String cpf, String email, String tituloAssociado){
        super(nome, idade, telefone, endereco, genero, cpf, email);
        this.tituloAssociado = tituloAssociado;
    }

    //Pegar e setar titulo associado
    public String getTituloAssociado() {
        return tituloAssociado;
    }

    public void setTituloAssociado(String tituloAssociado) {
        this.tituloAssociado = tituloAssociado;
    }

    public void setDadosPagamento(DadosDePagamento dadosDePagamento){
        this.dadosDePagamento = dadosDePagamento;
    }

}
