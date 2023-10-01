package src;

public class Turma {
    private String nome;
    private int diaSemana;
    private String horarioInicio;
    private String horarioTermino;

    public Turma(String nome, int diaSemana, String horarioInicio, String horarioTermino){
        this.nome = nome;
        this.diaSemana = diaSemana;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
    }

    public int getDiaSemana() {
        return diaSemana;
    }
    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }
    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioTermino() {
        return horarioTermino;
    }
    public void setHorarioTermino(String horarioTermino) {
        this.horarioTermino = horarioTermino;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
