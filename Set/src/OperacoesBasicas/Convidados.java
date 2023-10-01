package OperacoesBasicas;

import java.util.Objects;

public class Convidados {
    private String nome;
    private int codigoDoConvite;

    public Convidados(String nome, int codigoDoConvite) {
        this.nome = nome;
        this.codigoDoConvite = codigoDoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoDoConvite() {
        return codigoDoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidados that = (Convidados) o;
        return codigoDoConvite == that.codigoDoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDoConvite);
    }

    @Override
    public String toString() {
        return "nome = " + nome +
                "- codigoDoConvite = " + codigoDoConvite + "\n" ;
    }
}
