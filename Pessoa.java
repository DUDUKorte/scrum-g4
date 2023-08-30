public class Pessoa {
    //Atributos da Superclasse Pessoa
    String nome;
    int idade;
    String telefone;
    String endereco;
    String genero;
    String cpf;
    String email;

    Pessoa(String nome, int idade, String telefone, String endereco, String genero, String cpf, String email){
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
        this.genero = genero;
        this.cpf = cpf;
        this.email = email;
    }

    //Pegar e setar nome
    public String getNome(){
        return nome;
    }

    void setNome(String novoNome){
        nome = novoNome;
    }

    //Pegaar e setar gênero
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Pgar e setar idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Pegar e setar cpf
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //Pegar e setar telefone
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Pegar e setar email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Pegar e setar endereço
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
