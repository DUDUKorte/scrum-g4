package src;

public class DadosDePagamento {
    private String formaDePagamento;
    private double valorMensalidade;

    public DadosDePagamento(String formaDePagamento, double valorMensalidade){
        this.formaDePagamento = formaDePagamento;
        this.valorMensalidade = valorMensalidade;
    }

    //Pegar e setar a forma de pagamento
    public String getFormaDePagamento() {
        return formaDePagamento;
    }
    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    //Pegar e setar valor da mensalidade
    public double getValorMensalidade() {
        return valorMensalidade;
    }
    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }
}
