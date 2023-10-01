package Ordenacao;

public class Main {
    public static void main(String[] args) {
        CadastroDeProduto cadastroDeProduto = new CadastroDeProduto();
        cadastroDeProduto.adicionarProduto(102901L, "caneta", 1.30, 16);
        cadastroDeProduto.adicionarProduto(132901L, "Arroz", 1.50, 18);
        cadastroDeProduto.adicionarProduto(209238L, "Borracha", 2.10, 15);
        cadastroDeProduto.adicionarProduto(345023L, "Boi", 20.00, 5);
        System.out.println("Lista sem ordenação: \n"+cadastroDeProduto.exibirListaProduto());

        System.out.println("Ordenando por preço: \n"+cadastroDeProduto.exibirProdutoPorPreco());

        System.out.println("Ordenando por quantidade: \n"+cadastroDeProduto.ExibirPorQuantidade());
    }

}
