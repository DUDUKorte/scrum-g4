package src; //Pacote src = pasta com todas as classes do código fonte
// Importação das bibliotecas a serem usadas:
import java.util.List;

public class PainelAdministrativo {
    private BancoDeDados bancoDeDados; //Variável para usar de banco de dados
    private int nivel = 0; //Nível de referência do funcionário
    private int nivel_necessario = 2; //Nível mínimo para acesso do funcionário ao painel
    private boolean permissao = false;

    //Método construtor
    PainelAdministrativo(String nomeFuncionario, BancoDeDados bancoDeDados){ //Método construtor
        this.bancoDeDados = bancoDeDados; //Usa o banco de dados informado
        recarregarNivelFuncionario(nomeFuncionario); //Carrega o nível do funcionário que está usando o painel pelo nome do funcionário
    }

    //Método para recaerregar o nível do funcionário que está acessando o painel administrativo, caso ele seja iniciado e depois troque de funcinário ou o nível dele aumente
    public void recarregarNivelFuncionario(String nomeFuncionario){ //Também funciona como troca de funcionário do painel
        Funcionario funcionario = bancoDeDados.encontrarFuncionario(nomeFuncionario);
        if(funcionario != null){ //Verifica se o funcionário que retornou é um funcionário
            this.nivel = funcionario.getNivel(); //Atualiza nível do funcionário que está usando o painel
            if(this.nivel >= this.nivel_necessario){ //se funcionário tiver acesso, ele vai trocar a variável de permissão
                this.permissao = true;
            }else{ //Aviso ao funcionário caso ele tente acessar o painel, mas não possui permissão
                System.out.println("Nível "+this.nivel_necessario+" Necessário");
            }
        }
    }

    public void exibirInfoAssociado(String nome){ //Método para procuar o associado
        if(permissao){ //Verifica se o funcionário tem permissão para usar o painel
            Associado associado = bancoDeDados.encontrarAssociado(nome); //Procura pelo associado no banco de dados
            if(associado != null){ //Se encontrou o associado, exibe as informações dele na tela
                System.out.println();
                System.out.println("Nome: " + associado.getNome());
                System.out.println("Idade: " + associado.getIdade());
                System.out.println("Telefone: " + associado.getTelefone());
                System.out.println("Endereço: " + associado.getEndereco());
                System.out.println("Gênero: " + associado.getGenero());
                System.out.println("CPF: " + associado.getCpf());
                System.out.println("Email: " + associado.getEmail());
                System.out.println("Título Associado: " + associado.getTituloAssociado());
                System.out.println();
            }
        }
    }

    public void atualizarAtributoDoAssociado(String nome, String atributo, String valor){ //Método para atualizar algum atributo do associado
        if(permissao){ 
            bancoDeDados.atualizarAtributoAssociado(nome, atributo, valor); //Atualiza o atributo do associado no banco de dados
            System.out.println("Dados Atualizados!");
            exibirInfoAssociado(nome); //Mostra as informações atualizadas na tela
        }
    }

    public void cadastrarAssociado(String nome, int idade, String telefone, String endereco, String genero, String cpf, String email, String tituloAssociado, String formaDePagamento, double valorMensalidade){
        if(permissao){
            Associado associado = new Associado(nome, idade, telefone, endereco, genero, cpf, email, tituloAssociado);
            DadosDePagamento dadosPagamento = new DadosDePagamento(formaDePagamento, valorMensalidade);
            associado.setDadosPagamento(dadosPagamento);
            //Adicionar o associado ao banco de dados/tabela de associados aqui junto com os dados de pagamento
            bancoDeDados.adicionarAssociado(associado);
        }
    }

    public void cadastrarDependente(String nome, String parentesco, int idade, String telefone, String endereco, String genero, String cpf, String email){
        if(permissao){
            Dependentes dependentes = new Dependentes(parentesco, nome, idade, telefone, endereco, genero, cpf, email);
            //Adicionar o dependente ao bancod e dados/tabela de dependentes relacionado aos associados aqui
            //BancoDeDados bancoDeDados = new BancoDeDados();
            //bancoDeDados.adicionarDependente(dependentes);
        }
    }

    //Método para cadastrar nova atividade no bd
    public void cadastrarAtividade(String nome, String descicao, int faixaEtaria, int niveisHabilidade){
        Atividade atividade = new Atividade(nome, descicao, faixaEtaria, niveisHabilidade);
        bancoDeDados.adicionarAtividade(atividade);
    }

    //Método para exbiri as ativisdades cadastradas no bd
    public void visualizarAtividades(String nome){
        Atividade atividade = bancoDeDados.encontrarAtividade(nome);
        if(atividade != null){ //Verifica se encontrou a atividade
            System.out.println();
            System.out.println("Nome: "+atividade.getNomeAtividade());
            System.out.println("Descrição: "+atividade.getDescricao());
            System.out.println("Faixa Etária: "+atividade.getFaixaEtaria());
            System.out.println("Níveis de Habilidade: "+atividade.getNiveisHabilidade());
            
            //Esqueminha para mostrar todas as turmas das atividades
            List<Turma> turmas = atividade.getTurmas(); //Pega as turmas da atividade atual em uma nova lista
            System.out.println("Turmas: ");
            if(turmas.size() > 0){ //Verifiac se tem turmas cadastradas TODO: VERIFICAR SE ESSE IF ESTÁ CORRETO
                for(Turma i : turmas){ //Percorre todas as turmas e mostra cada uma separada por "======="
                    System.out.println("\tNome: "+i.getNome());
                    System.out.println("\tDia da Semana: "+i.getDiaSemana());
                    System.out.println("\tHorário de Início: "+i.getHorarioInicio());
                    System.out.println("\tHorário de Término: "+i.getHorarioTermino());
                    System.out.println("=============================================");
                }
            }else{
                System.out.println("Nenhuma turma cadastrada");
            }
            System.out.println();
        }
    }

    //adicioarTurma à atividade com aquele esquema de remover a atividade do bd e adicionar ela mesma com a nova turma
    public void adicionarTurma(String nomeAtividade, String nomeTurma, int diaSemana, String horarioInicio, String horarioTermino){
        Atividade atividade = bancoDeDados.encontrarAtividade(nomeAtividade);
        if(atividade != null){
            atividade.addTurmas(nomeTurma, diaSemana, horarioInicio, horarioTermino); //Adiciona a turma na atividade localmente
            bancoDeDados.atualizarAtividade(nomeAtividade, atividade); //Atualiza a atividade do bd com as turmas novas
        }
    }
}
