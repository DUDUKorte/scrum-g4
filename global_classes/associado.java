package global_classes;

public class Associado(pessoas){
    //Superclasse herdando da classe pessoas
    String[] atividades_cadastradas;
    String dependentes;
    String metodo_de_pagamento;
    String status_de_pagamento;

    public Associado(String[] atividades_cadastradas, String dependentes, String metodo_de_pagamento, String status_de_pagamento){
        //Método construtor
        this.atividades_cadastradas = atividades_cadastradas;
        this.dependentes = dependentes;
        this.metodo_de_pagamento = metodo_de_pagamento;
        this.status_de_pagamento = status_de_pagamento;
    }
}