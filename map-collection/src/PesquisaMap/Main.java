package PesquisaMap;

public class Main {
    public static void main(String[] args) {
        EstoqueDeProdutos estoqueDeProdutos = new EstoqueDeProdutos();
        estoqueDeProdutos.adicionarProduto(2L, "lapis", 1.50, 15);
        estoqueDeProdutos.adicionarProduto(1L, "arroz", 10.0, 5);
        estoqueDeProdutos.adicionarProduto(3L, "caneta", 30.0, 10);
        estoqueDeProdutos.exibirProduto();
        estoqueDeProdutos.calcularValorTotalEstoque();
        System.out.println( estoqueDeProdutos.obterProdutoMaisCaro());

    }
}
