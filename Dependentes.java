public class Dependentes extends Pessoa{
    String parentesco;

    Dependentes(String parentesco, String nome, int idade, String telefone, String endereco, String genero, String cpf, String email){
        super(nome, idade, telefone, endereco, genero, cpf, email);
        this.nome = nome;
        this.parentesco = parentesco;
    }

    //Pegar e setar parentesco
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    //Pegar e setar nome
    public String getNome(){
        return super.getNome();
    }

    public void setNome(String nome){
        super.setNome(nome);
    }

}
