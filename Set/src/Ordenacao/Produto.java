package Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private Long codigoProduto;
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;


    public Produto(Long codigo, String nome, double preco, int quant) {
        this.codigoProduto = codigo;
        this.nomeProduto = nome;
        this.precoProduto = preco;
        this.quantidadeProduto = quant;
    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public Long getCodigoProduto() {
        return codigoProduto;
    }
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public int compareTo(Produto p) {
        return nomeProduto.compareToIgnoreCase(p.getNomeProduto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoProduto);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(codigoProduto, produto.codigoProduto);
    }
    @Override
    public String toString() {
        return "Produto{" +
                "NomeProduto='" + nomeProduto +
                "precoProduto=" + precoProduto +
                ", codigoProduto=" + codigoProduto +
                ", quantidadeProduto=" + quantidadeProduto +"\n" +
                '}';
    }

}
class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPrecoProduto(), p2.getPrecoProduto());
    }
}

class ComparatorPorQtd implements Comparator<Produto>{

    @Override
    public int compare(Produto q1, Produto q2) {
        return Double.compare(q1.getQuantidadeProduto(), q2.getQuantidadeProduto());
    }
}
