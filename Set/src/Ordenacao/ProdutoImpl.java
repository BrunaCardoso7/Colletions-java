package Ordenacao;

public class ProdutoImpl extends Produto {
    public ProdutoImpl(Long codigo, String nome, double preco, int quant) {
        super(codigo, nome, preco, quant);
    }

    @Override
    public int compareTo(Produto o) {
        return 0;
    }
}
