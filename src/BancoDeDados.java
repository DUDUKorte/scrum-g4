package src; //Pacote src = pasta com todas as classes do código fonte
// Importação das bibliotecas a serem usadas:
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    //Banco de dados apenas simulado, não funciona de fato
    private List<Associado> associados = new ArrayList<>(); //Lista com os associados cadastrados
    private List<Funcionario> funcionarios = new ArrayList<>(); //Lista com os funcionários cadastrados
    private List<Atividade> atividades = new ArrayList<>(); //Lista com as atividades cadastradas

    //ASSOCIADOS
    //Método que adiciona associados ao "banco de dados"
    public void adicionarAssociado(Associado associado){
        associados.add(associado); //Adiciona o assocado na lista
    }

    public Associado encontrarAssociado(String nome){
        //Verifica cada associado se possui o nome igual ao nome procurado
        for(Associado associado : associados){ //Vai verificar cada associado dentro da lista
            if(associado.getNome().toLowerCase().equals(nome.toLowerCase())){ //Verifica se o nome do associado procurado é igual ao nome do associado da lista, em lower case para não ter problema com letrar maiúsculas
                return associado; //Retorna o objeto do associado
            }
        }
        return null; //Associado não encontrado
    }

    public void atualizarAtributoAssociado(String nome, String atributo, String valor){ //Vai atualizar qualquer atributo do associado com base no nome do atributo
        Associado associado = encontrarAssociado(nome); //Procura o associado que quer atualizar o atributo
        if(associado instanceof Associado){ //Verifica se o associado encontrado é da classe do associado
            switch (atributo.toLowerCase()) { //Verifica qual é o atributo a ser atualizado, utilizei switch case para ficar mais simples, com menos métodos
                case "nome":
                    ((Associado) associado).setNome(valor);                
                    break;
                case "idade":
                    int valorInt = Integer.parseInt(valor);
                    ((Associado) associado).setIdade(valorInt);     
                    break;
                case "genero":
                    ((Associado) associado).setGenero(valor);                
                    break;
                case "titluoassociado":
                    ((Associado) associado).setTituloAssociado(valor);                
                    break;
                case "cpf":
                    ((Associado) associado).setCpf(valor);                
                    break;
                case "telefone":
                    ((Associado) associado).setTelefone(valor);            
                    break;
                case "email":
                    ((Associado) associado).setEmail(valor);             
                    break;
                case "endereco":
                    ((Associado) associado).setEndereco(valor);                
                    break;
                
                //Caso final se não for nenhum dos listados acima
                default: //SEMPRE DEVE FICAR NO FINAL DO SWITCH CASE
                    System.out.println("Atributo não existente!");
                    break;
            }
        }
    }

    //Método que remove Funcionário do "Bando de dados"
    //TODO: TESTAR, NÃO SABEMOS SE ESTÁ FUNCIONANDO, SE NÃO FUNCIONAR --> TENTE COM O USO DE INDEX PELO MÉTODO ENCONTRAR FUNCIONÁRIO
    public void removerFuncionario(String nome){
        Funcionario funcionario = encontrarFuncionario(nome); //Pega o funcionário pelo método próprio
        if(funcionario instanceof Funcionario){ //Verifica se o funcionário é do tipo funcionário
            funcionarios.remove(funcionario); //remove o objeto da lista, é p funcionar perfeitamente, na teoria...
        }
    }

    //FUNCIONÁRIOS
    //Método que adiciona Funcionário ao "banco de dados"
    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public Funcionario encontrarFuncionario(String nome){
        //Verifica cada Funcionário se possui o nome igual ao nome procurado
        for(Funcionario funcionario: funcionarios){
            if(funcionario.getNome().toLowerCase().equals(nome.toLowerCase())){
                return funcionario;
            }
        }
        return null; //Funcionário não encontrado
    }

    public void atualizarAtributoFuncionario(String nome, String atributo, String valor){
        Funcionario funcionario = encontrarFuncionario(nome);
        if(funcionario instanceof Funcionario){ //Verifica se o associado encontrado é da classe do associado
            switch (atributo.toLowerCase()) {
                case "nome":
                    ((Funcionario) funcionario).setNome(valor);                
                    break;
                case "cpf":
                    ((Funcionario) funcionario).setCpf(valor);                
                    break;
                case "telefone":
                    ((Funcionario) funcionario).setTelefone(valor);            
                    break;
                case "email":
                    ((Funcionario) funcionario).setEmail(valor);             
                    break;
                case "endereco":
                    ((Funcionario) funcionario).setEndereco(valor);                
                    break;
                case "salario":
                    ((Funcionario) funcionario).setSalario(valor);               
                    break;
                case "cargo":
                    ((Funcionario) funcionario).setCargo(valor);                
                    break;
                case "senha":
                    ((Funcionario) funcionario).setSenha(valor);
                    break;
                case "emprego":
                    ((Funcionario) funcionario).addHistoricoEmpregos(valor);
                    break;
                case "treinamento":
                    ((Funcionario) funcionario).addTreinamentos(valor);
                    break;
                case "feedback":
                    ((Funcionario) funcionario).addFeedback(valor);
                    break;

                //Caso final se não for nenhum dos listados acima
                default: //SEMPRE DEVE FICAR NO FINAL DO SWITCH CASE
                    System.out.println("Atributo não existente!");
                    break;
            }
        }
    }

    //Método que remove associado do "Bando de dados"
    //TODO: TESTAR, NÃO SABEMOS SE ESTÁ FUNCIONANDO, SE NÃO FUNCIONAR --> TENTE COM O USO DE INDEX PELO MÉTODO ENCONTRAR ASSOCIADO
    public void removeraAssociado(String nome){
        Associado associado = encontrarAssociado(nome);
        if(associado instanceof Associado){
            associados.remove(associado);
        }
    }

    //ATIVIDADES
    //Método que adiciona Atividade ao "Banco de dados"
    public void adicionarAtividade(Atividade atividade){
        atividades.add(atividade);
    }

    public Atividade encontrarAtividade(String nome){
        //Verifica cada atividade e retorna o objeto se for igual
        for(Atividade atividade: atividades){
            if(atividade.getNomeAtividade().toLowerCase().equals(nome.toLowerCase())){
                return atividade;
            }
        }
        return null;
    }

    //Método que atualiza qualquer atributo da atividade (só o nome)
    public void atualizarAtributoAtividade(String nome, String atributo, String valor){
        Atividade atividade = encontrarAtividade(nome); 
        if(atividade instanceof Atividade){ //Verifica se a atividade é da classe atividade
            switch(atributo.toLowerCase()){
                case "nome":
                ((Atividade) atividade).setNomeAtividade(nome);
                break;

                //Caso final se não for nenhum dos listados acima
                default: //SEMPRE DEVE FICAR NO FINAL DO SWITCH CASE
                    System.out.println("Atributo não existente!");
                    break;
            }
        }
    }

    //Método que remove atividade do "Bando de dados"
    //TODO: TESTAR, NÃO SABEMOS SE ESTÁ FUNCIONANDO, SE NÃO FUNCIONAR --> TENTE COM O USO DE INDEX PELO MÉTODO ENCONTRAR ATIVIDADE
    public void removerAtividade(String nome){
        Atividade atividade = encontrarAtividade(nome);
        if(atividade instanceof Atividade){
            atividades.remove(atividade);
        }
    }

    //Método que atualiza a atividade, é usado para adicioanr turmas, já que não da p adicionar pelo switch case no modo "convencional"
    public void atualizarAtividade(String nome, Atividade newAtividade){
        Atividade atividade = encontrarAtividade(nome); //Pega a atividade atual
        if(atividade instanceof Atividade){ //Verifica se é uma atividade
            atividades.remove(atividade); //Remove a atividade da lista
            atividades.add(newAtividade); //Adiciona exatamente a mesma atividade, mas com os novos atributos da turma
        }
    }
}
