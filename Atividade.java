import java.util.ArrayList;
import java.util.List;

public class Atividade{
    private String nomeAtividade;
    private String descricao;
    private int faixaEtaria;
    private int niveisHabilidade;
    private List<Turma> turmas = new ArrayList<>();
    
    public Atividade(String nome, String descicao, int faixaEtaria, int niveisHabilidade){
        this.nomeAtividade = nome;
        this.descricao = descicao;
        this.faixaEtaria = faixaEtaria;
        this.niveisHabilidade = niveisHabilidade;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }
    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public int getNiveisHabilidade() {
        return niveisHabilidade;
    }
    public void setNiveisHabilidade(int niveisHabilidade) {
        this.niveisHabilidade = niveisHabilidade;
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }
    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    //Método para adicionar uma turma à atividade
    public void addTurmas(String nome, int diaSemana, String horarioInicio, String horarioTermino){
        Turma newTurma = new Turma(nome, diaSemana, horarioInicio, horarioTermino);
        turmas.add(newTurma);
    }
}
