package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroDeProduto {
    private Set<Produto> produtosSet;

    public CadastroDeProduto() {
        this.produtosSet = new HashSet<>();
    }
    public void adicionarProduto(Long cod, String nome, double preco, int quant){
        produtosSet.add(new Produto(cod, nome, preco, quant));
    }
    public Set<Produto> exibirListaProduto() {
        Set<Produto> produtosEmOrdemAlfabetica = new TreeSet<>(produtosSet);
        return produtosEmOrdemAlfabetica;
    }
    public Set<Produto> exibirProdutoPorPreco(){
        Set <Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }
    public Set<Produto> ExibirPorQuantidade(){
        Set<Produto> exibirPorqtd = new TreeSet<>(new ComparatorPorQtd());
        exibirPorqtd.addAll(produtosSet);
        return exibirPorqtd;
    }

}
