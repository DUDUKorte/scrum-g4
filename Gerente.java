public class Gerente extends Pessoa{
    BancoDeDados bancoDeDados;

    Gerente(String nome, int idade, String telefone, String endereco, String genero, String cpf, String email){
        super(nome, idade, telefone, endereco, genero, cpf, email);
    }

    public void setBancoDeDados(BancoDeDados bancoDeDados){
        this.bancoDeDados = bancoDeDados;
    }

    public void cadastrarFuncionario(String cargo, String salario, String nome, int idade, String telefone, String endereco, String genero, String cpf, String email){
        Funcionario funcionario = new Funcionario(cargo, salario, nome, idade, telefone, endereco, genero, cpf, email);
        //Adicionar novo funcionário ao banco de dados
        bancoDeDados.adicionarFuncionario(funcionario);
    }

    public void definirPermissao(String funcionario, int nivel){
        Funcionario objFuncionario = bancoDeDados.encontrarFuncionario(funcionario);
        if(objFuncionario != null){
            objFuncionario.setNivel(nivel);
        }
    }

    public void verificarPermissao(String funcionario){
        Funcionario objFuncionario = bancoDeDados.encontrarFuncionario(funcionario);
        if(objFuncionario != null){
            System.out.println("Nível de acesso de "+funcionario+": "+ objFuncionario.getNivel());
        }
    }
}
