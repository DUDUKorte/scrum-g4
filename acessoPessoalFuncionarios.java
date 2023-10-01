import src.*; //Import das classes do código fonte
// Importação das bibliotecas a serem usadas:
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class acessoPessoalFuncionarios {
    public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados(); //Criação do banco de dados que vai utilizar, ainda é provisório (APENAS PARA TESTES)

        String nomeFuncionario = JOptionPane.showInputDialog("Insira seu Usuário: "); //pega o nome de usuário do funcionário cm JOptionPane
        Funcionario atualFuncionario = bancoDeDados.encontrarFuncionario(nomeFuncionario); //Procura o funcionário no banco de dados
        
        if(atualFuncionario != null){ //Se encontrar o funcionário no bd
            String email = JOptionPane.showInputDialog("Insira seu Email"); //Pede email para "login"
            String senha = JOptionPane.showInputDialog("Insira sua Senha"); //Pede senha para "login"
            atualFuncionario.acessarSistema(email, senha); //Faz o "login" com email e senha infromados

            if(atualFuncionario.getAcessoSistemaPessoal()){ //Verifica se o acesso foi concedido (logou com sucesso)
                //Aqui deve mostrar todas as infos., mas acho que é melhor deixar no terminal por enquanto ao invés de colocar no JOptionPane
                //Vai ser melhor mostrar as informações quando agnt fizer as interfaces
                JOptionPane.showMessageDialog(null, "Você obteve acesso ao seu perfil pessoal!", "Sucesso!", 0);
            }else{
                //Caso não teve acesso concedido
                JOptionPane.showMessageDialog(null, "Você não possui acesso!", "ERRO!", 0);
            }
        }else{
            //Caso não encontre o funcionário no bd
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado!", "ERRO!", 0);
        }
    }
}
