package Pesquisa;

public class Main {
    public static void main(String[] args) {
        AgendaDeContatos contatos = new AgendaDeContatos();

        contatos.adicionarContato("bruna", 88620502);
        contatos.adicionarContato("bruna", 29384234);
        contatos.adicionarContato("joao", 98063735);
        System.out.println(contatos.pesquisarPorNome("bruna"));
        contatos.exibirContatos();
        contatos.AtualizaContato("bruna", 12345678);
        contatos.exibirContatos();

    }
}
