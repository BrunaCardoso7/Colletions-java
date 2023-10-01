package Pesquisa;

public class Main {
    public static void main(String[] args) {
        CatalogoLivro livro = new CatalogoLivro();
        livro.adicionarLivro("Entendendo Algoritmos", "Bhargava", 2021);
        livro.adicionarLivro("Entendendo python", "junior", 2022);
        livro.adicionarLivro("Estrutura de dados", "Loiane", 2020);
        livro.mostrarLivros();
        System.out.println(livro.buscarPorTitulo("estrutura de dados"));

    }

}
