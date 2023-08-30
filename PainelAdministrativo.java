public class PainelAdministrativo {
    BancoDeDados bancoDeDados;
    int nivel = 0;

    PainelAdministrativo(String nomeFuncionario, BancoDeDados bancoDeDados){
        Funcionario funcionario = bancoDeDados.encontrarFuncionario(nomeFuncionario);
        if(funcionario != null){
            this.nivel = funcionario.getNivel();
        }
    }

    public void procurarAssociado(String nome){
        if(this.nivel >= 2){
            Associado associado = bancoDeDados.encontrarAssociado(nome);
            if(associado != null){
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

    public void atualizarAtributoDoAssociado(String nome, String atributo, String valor){
        if(this.nivel >= 2){
            bancoDeDados.atualizarAtributoAssociado(nome, atributo, valor);
            System.out.println("Dados Atualizados!");
            procurarAssociado(nome);
        }
    }

}
