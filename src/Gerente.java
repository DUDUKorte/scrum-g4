package src; //Pacote src = pasta com todas as classes do código fonte

public class Gerente extends Pessoa{
    private BancoDeDados bancoDeDados;

    //Método construtor
    Gerente(String nome, int idade, String telefone, String endereco, String genero, String cpf, String email){
        super(nome, idade, telefone, endereco, genero, cpf, email);
    }

    //Setter banco de dados para usar o mesmo banco de dados do main, apenas provisório, quando fizermos o banco de dados on-line de fato, esse método será decscartado 
    public void setBancoDeDados(BancoDeDados bancoDeDados){
        this.bancoDeDados = bancoDeDados;
    }

    //Método para cadastrar funcionários
    public void cadastrarFuncionario(String cargo, String salario, String nome, int idade, String telefone, String endereco, String genero, String cpf, String email){
        Funcionario funcionario = new Funcionario(cargo, salario, nome, idade, telefone, endereco, genero, cpf, email);
        //Adicionar novo funcionário ao banco de dados
        bancoDeDados.adicionarFuncionario(funcionario); 
    }

    //Adicionar/Alterar permissão de um funcionário
    public void definirPermissao(String funcionario, int nivel){
        Funcionario objFuncionario = bancoDeDados.encontrarFuncionario(funcionario);
        if(objFuncionario != null){
            objFuncionario.setNivel(nivel);
        }
    }

    //Verifica qual é o nível de permissão atual do funcionário
    public void verificarPermissao(String funcionario){
        Funcionario objFuncionario = bancoDeDados.encontrarFuncionario(funcionario);
        if(objFuncionario != null){
            System.out.println("Nível de acesso de "+funcionario+": "+ objFuncionario.getNivel());
        }
    }

    //Método para ver as informações do funcionário
    public void visualizarInformacoesFuncionario(String funcionario){
        Funcionario infoFuncionario = bancoDeDados.encontrarFuncionario(funcionario); //Pega o funcionário no banco de dados
        
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
