package operacaoBasica;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("bruna", 88620502);
        agendaContatos.adicionarContato("maria", 88635875);
        agendaContatos.adicionarContato("joão", 88312083);
        agendaContatos.adicionarContato("ludmilla", 94012326);

        System.out.println(agendaContatos.exibirContatos());

        System.out.println(agendaContatos.ExibirPorNome("bruna"));

        agendaContatos.removerContato("bruna");
        System.out.println(agendaContatos.exibirContatos());
    }
}