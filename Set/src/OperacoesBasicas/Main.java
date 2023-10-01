package OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Bruna", 1982);
        conjuntoConvidados.adicionarConvidado("Maria", 2983);
        conjuntoConvidados.adicionarConvidado("João", 2983);
        conjuntoConvidados.adicionarConvidado("Ludmila", 4957);

        conjuntoConvidados.exibirConvidados();
    }
}