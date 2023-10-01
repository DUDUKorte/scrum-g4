package src; //Pacote src = pasta com todas as classes do código fonte

public class Turma { //Essa classe só deve ser utilizado dentro das atividade, NÃO CRIE UMA TURMA FORA DE ATIVIDADES, UTILIZE OS MÉTODOS DE ATIVIDADE PARA ISSO
    private String nome;
    private int diaSemana;
    private String horarioInicio;
    private String horarioTermino;

    //Método construtor
    public Turma(String nome, int diaSemana, String horarioInicio, String horarioTermino){
        this.nome = nome;
        this.diaSemana = diaSemana;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
    }

    //Getters e Setters
    //Get e set dia da semana
    public int getDiaSemana() {
        return diaSemana;
    }
    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    //Get e set horários de início
    public String getHorarioInicio() {
        return horarioInicio;
    }
    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    //Get e set horários de término
    public String getHorarioTermino() {
        return horarioTermino;
    }
    public void setHorarioTermino(String horarioTermino) {
        this.horarioTermino = horarioTermino;
    }

    //Get e set Nome da turma
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
