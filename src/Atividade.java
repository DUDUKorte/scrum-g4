package src; //Pacote src = pasta com todas as classes do código fonte
// Importação das bibliotecas a serem usadas:
import java.util.ArrayList;
import java.util.List;

public class Atividade{
    private String nomeAtividade;
    private String descricao;
    private int faixaEtaria;
    private int niveisHabilidade;
    private List<Turma> turmas = new ArrayList<>(); //Lista com objetos de turmas que facilita o "tráfego de atributos" (perguntar pro esquilo se tiver alguma dúvida dessa nomenclatura)
    
    //Método construtor
    public Atividade(String nome, String descicao, int faixaEtaria, int niveisHabilidade){
        this.nomeAtividade = nome;
        this.descricao = descicao;
        this.faixaEtaria = faixaEtaria;
        this.niveisHabilidade = niveisHabilidade;
    }

    //Getters e Setters
    //Get e set descrição
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Get e set Faixa etária
    public int getFaixaEtaria() {
        return faixaEtaria;
    }
    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    //Get e set niveis de habilidade
    public int getNiveisHabilidade() {
        return niveisHabilidade;
    }
    public void setNiveisHabilidade(int niveisHabilidade) {
        this.niveisHabilidade = niveisHabilidade;
    }

    //Get e set nome da atividade
    public String getNomeAtividade() {
        return nomeAtividade;
    }
    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    //Get lsita com turmas dessa atividade específica, sempre irá pegar as turmas por atividade, não o inverso (vai acarretar em muita gambiarra, mas da p fazer)
    public List<Turma> getTurmas() {
        return turmas;
    }

    //Método para adicionar uma turma à atividade
    public void addTurmas(String nome, int diaSemana, String horarioInicio, String horarioTermino){ //Deve receber o nome da turma, dia e horários da turma
        Turma newTurma = new Turma(nome, diaSemana, horarioInicio, horarioTermino); //Cria novo objeto Turma com os parâmetros pegos
        turmas.add(newTurma); //Adiciona objeto turma na lista de objetos de turmas (da p ter várias turmas em uma só atividade)
    }
}
