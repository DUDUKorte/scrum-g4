public class Funcionario extends Pessoa{
    String cargo;
    String salario;
    int nivel = 0;
    BancoDeDados bancoDeDados;

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

    public void cadastrarAssociado(String nome, int idade, String telefone, String endereco, String genero, String cpf, String email, String tituloAssociado, String formaDePagamento, double valorMensalidade){
        Associado associado = new Associado(nome, idade, telefone, endereco, genero, cpf, email, tituloAssociado);
        DadosDePagamento dadosPagamento = new DadosDePagamento(formaDePagamento, valorMensalidade);
        //Adicionar o associado ao banco de dados/tabela de associados aqui junto com os dados de pagamento
        bancoDeDados.adicionarAssociado(associado);
    }

    public void cadastrarDependente(String nome, String parentesco){
        Dependentes dependentes = new Dependentes(parentesco, nome, idade, telefone, endereco, genero, cpf, email);
        //Adicionar o dependente ao bancod e dados/tabela de dependentes relacionado aos associados aqui
        //BancoDeDados bancoDeDados = new BancoDeDados();
        //bancoDeDados.adicionarDependente(dependentes);
    }

}
