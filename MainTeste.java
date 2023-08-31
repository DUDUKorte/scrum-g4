public class MainTeste {
    public static void main(String[] args){
        BancoDeDados bancoDeDados = new BancoDeDados(); //Declarar o banco de dados "global" a ser utilizado
        //Para testes
        //Declara o funcionário
        //ESTE FUNCIONÀRIO NÃO IRÁ PARA O BANCO DE DADOS, DEVE SER CADASTRADO PELO GERENTE PARA ENTRAR NO BD
        Funcionario funcionarioTeste = new Funcionario("Testador", "1200", "Esquilo", 19, "45-999148099", "Rua bacana, 2653", "Masculino", "152.177.699-71", "dudu.korte@gmail.com");
        //Define o banco de dados a ser utilizado
        funcionarioTeste.setBancoDeDados(bancoDeDados);
        //Cria um associado
        funcionarioTeste.cadastrarAssociado("Carol", 35, "45-999347588", "Rua diferente, 5326", "Fêmea", "123.456.789-00", "carol.korte@icloud.com", "Carol Korte", "Pix", 300);

        //como funcionário, consulta o banco de dados e atualiza um dado
        PainelAdministrativo painel1 = new PainelAdministrativo("Esquilo", bancoDeDados);
        //Encontra um associado registrado
        painel1.procurarAssociado("CAROL");
        //Altera um dado do associado cadastrado
        painel1.atualizarAtributoDoAssociado("Carol", "Idade", "45");


        //Como gerente cadastrar novos funcionários e definir nível
        Gerente gerente1 = new Gerente("Esquilão", 98, "45-9993452355", "Rua muito bacana", "Masculino", "177.155.699-17", "edu.korteifpr@gmail.com");
        //Definir banco de dados a utilizar
        gerente1.setBancoDeDados(bancoDeDados);
        //Cadastrar funcionario como gerente
        gerente1.cadastrarFuncionario("Administração", "3000", "Buzz", 43, "45-999999999", "Rua normal", "Fêmea", "009.876.543-21", "email.veraddeiro@gmail.com");
        //Atualizar nível do funcionário para teste
        gerente1.definirPermissao("Buzz", 3);

        //Funcionário, agora com nível mais alto pode usar o painel administrativo
        //Atualizar o nível do funcionário no painel
        painel1.recarregarNivelFuncionario("BUZZ");
        //Encontra um associado registrado
        painel1.procurarAssociado("CAROL");
        //Altera um dado do associado cadastrado
        painel1.atualizarAtributoDoAssociado("Carol", "Idade", "45");

    }
}
