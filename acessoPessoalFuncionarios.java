import src.*;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class acessoPessoalFuncionarios {
    public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados();

        String nomeFuncionario = JOptionPane.showInputDialog("Insira seu Usuário: ");
        Funcionario atualFuncionario = bancoDeDados.encontrarFuncionario(nomeFuncionario);
        
        if(atualFuncionario != null){
            String email = JOptionPane.showInputDialog("Insira seu Email");
            String senha = JOptionPane.showInputDialog("Insira sua Senha");
            atualFuncionario.acessarSistema(email, senha);
            if(atualFuncionario.getAcessoSistemaPessoal()){
                JOptionPane.showMessageDialog(null, "Você obteve acesso ao seu perfil pessoal!", "Sucesso!", 0);
            }else{
                JOptionPane.showMessageDialog(null, "Você não possui acesso!", "ERRO!", 0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado!", "ERRO!", 0);
        }
    }
}
