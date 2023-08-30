import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    //Banco de dados apenas simulado, não funciona de fato
    private List<Associado> associados = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();

    //ASSOCIADOS
    //Método que adiciona associados ao "banco de dados"
    public void adicionarAssociado(Associado associado){
        associados.add(associado);
    }

    public Associado encontrarAssociado(String nome){
        //Verifica cada associado se possui o nome igual ao nome procurado
        for(Associado associado : associados){
            if(associado.getNome().equals(nome)){
                return associado;
            }
        }
        return null; //Associado não encontrado
    }

    public void atualizarAtributoAssociado(String nome, String atributo, String valor){
        Associado associado = encontrarAssociado(nome);
        if(associado instanceof Associado){ //Verifica se o associado encontrado é da classe do associado
            switch (atributo.toLowerCase()) {
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
            if(funcionario.getNome().equals(nome)){
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
