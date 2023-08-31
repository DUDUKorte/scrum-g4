public class PainelAdministrativo {
    BancoDeDados bancoDeDados; //Variável para usar de banco de dados
    int nivel = 0; //Nível de referência do funcionário
    int nivel_necessario = 2; //Nível mínimo para acesso do funcionário ao painel

    PainelAdministrativo(String nomeFuncionario, BancoDeDados bancoDeDados){ //Método construtor
        this.bancoDeDados = bancoDeDados; //Usa o banco de dados informado
        recarregarNivelFuncionario(nomeFuncionario); //Carrega o nível do funcionário que está usando o painel pelo nome do funcionário
    }

    public void recarregarNivelFuncionario(String nomeFuncionario){
        Funcionario funcionario = bancoDeDados.encontrarFuncionario(nomeFuncionario);
        if(funcionario != null){
            this.nivel = funcionario.getNivel(); //Atualiza nível do funcionário que está usando o painel
        }
    }

    public void procurarAssociado(String nome){ //Método para procuar o associado
        if(this.nivel >= nivel_necessario){ //Verifica se o funcionário tem permissão para usar o painel
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
        }else{ //Aviso ao funcionário caso ele tente acessar o painel, mas não possui permissão
            System.out.println("Nível "+nivel_necessario+" Necessário");
        }
    }

    public void atualizarAtributoDoAssociado(String nome, String atributo, String valor){ //Método para atualizar algum atributo do associado
        if(this.nivel >= nivel_necessario){ 
            bancoDeDados.atualizarAtributoAssociado(nome, atributo, valor); //Atualiza o atributo do associado no banco de dados
            System.out.println("Dados Atualizados!");
            procurarAssociado(nome); //Mostra as informações atualizadas na tela
        }else{
            System.out.println("Nível "+nivel_necessario+" Necessário");
        }
    }

}
