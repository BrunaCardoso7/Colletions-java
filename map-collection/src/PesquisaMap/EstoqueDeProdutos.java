package PesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueDeProdutos {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueDeProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }
    public void adicionarProduto(Long codigo, String nome, double preco, int quantidade){
        estoqueProdutoMap.put(codigo, new Produto(nome, preco, quantidade));
    }
    public Map<Long, Produto> exibirProduto(){
        System.out.println(estoqueProdutoMap);
        return estoqueProdutoMap;
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutoMap.isEmpty()){
            for (Produto p: estoqueProdutoMap.values()){
                valorTotalEstoque+=p.getQuantidade()*p.getPreco();
            }
        }
        System.out.println(valorTotalEstoque);
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        if(!estoqueProdutoMap.isEmpty()){
            for (Produto p: estoqueProdutoMap.values()){
                if (maiorValor < p.getPreco()){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
}
