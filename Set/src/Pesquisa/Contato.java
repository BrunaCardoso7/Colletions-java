package Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int novoNumero;

    public Contato(String nome, int novoNumero) {
        this.nome = nome;
        this.novoNumero = novoNumero;
    }

    public String getNome() {
        return nome;
    }

    public int getNovoNumero() {
        return novoNumero;
    }

    public void setNovoNumero(int novoNumero) {
        this.novoNumero = novoNumero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "nome='" + nome +
                " novoNumero= " + novoNumero +
                "\n";
    }
}
