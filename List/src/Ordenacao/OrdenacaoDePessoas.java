package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDePessoas {
    List <Pessoa> pessoaList;
    public OrdenacaoDePessoas() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasOrdenadasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasOrdenadasPorIdade);
        return pessoasOrdenadasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> ordenadasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(ordenadasPorAltura, new ComparatorPorAltura());
        return ordenadasPorAltura;
    }
}
