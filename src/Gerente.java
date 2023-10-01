package src;

public class Gerente extends Pessoa{
    private BancoDeDados bancoDeDados;

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

    public void visualizarInformacoesFuncionario(String funcionario){
        Funcionario infoFuncionario = bancoDeDados.encontrarFuncionario(funcionario);
        
        //Exibe todos os empregos anteriores do funcionário~
        System.out.println("Histórico de empregos: ");
        for(String i : infoFuncionario.getHistoricoEmpregos()){
            System.out.println("\t- "+i);
        }
        System.out.println("Treinamentos: ");
        for(String i : infoFuncionario.getTerinamentos()){
            System.out.println("\t- "+i);
        }
        System.out.println("Feedbacks: ");
        for(String i : infoFuncionario.getFeedbacks()){
            System.out.println("\t- "+i);
        }
    }
}
