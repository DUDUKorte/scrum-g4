import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    //Banco de dados apenas simulado, não funciona de fato
    private List<Associado> associados = new ArrayList<>(); //Lista com os associados cadastrados
    private List<Funcionario> funcionarios = new ArrayList<>(); //Lista com os funcionários cadastrados

    //ASSOCIADOS
    //Método que adiciona associados ao "banco de dados"
    public void adicionarAssociado(Associado associado){
        associados.add(associado);
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
            }
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
            }
        }
    }
}
