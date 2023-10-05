package operacaoBasica;
import java.util.HashMap;
import java.util.Map;
public class AgendaContatos {
    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer numero){
        contatosMap.put(nome, numero);
    }
    public void removerContato(String nome){
        if(!contatosMap.isEmpty()){
            contatosMap.remove(nome);
        }
    }
    public Map<String, Integer> exibirContatos(){
        return contatosMap;
    }
    public Integer ExibirPorNome(String nome){
        Integer numeroTelefone = null;
        if(!contatosMap.isEmpty()){
            numeroTelefone = contatosMap.get(nome);
        }
        return numeroTelefone;
    }


}
