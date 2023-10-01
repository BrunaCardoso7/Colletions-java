package Ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoDePessoas pessoa = new OrdenacaoDePessoas();
        pessoa.adicionarPessoa("jorge", 15, 1.40);
        pessoa.adicionarPessoa("bruna", 13, 1.70);
        pessoa.adicionarPessoa("ana", 17, 1.60);
        pessoa.ordenarPorIdade();
        System.out.println(pessoa.ordenarPorIdade());
    }
}
