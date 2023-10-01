package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaDeContatos {
    private Set<Contato> contatosSet;

    public AgendaDeContatos() {
        this.contatosSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int contato){
        contatosSet.add(new Contato(nome, contato));
    }
    public void exibirContatos(){
        System.out.println(contatosSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> resultadoPesquisa = new HashSet<>();
        if(!contatosSet.isEmpty()){
            for (Contato c : contatosSet) {
                if (c.getNome().startsWith(nome)) {
                    resultadoPesquisa.add(c);
                }
            }
        }
        return resultadoPesquisa;
    }
    public Contato AtualizaContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNovoNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
