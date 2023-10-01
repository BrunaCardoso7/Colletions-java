package operacoesBasicas;
import java.util.List;
import java.util.ArrayList;
public class LIstaTarefa {
    private List<Tarefa> tarefaList;

    public LIstaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoes(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        LIstaTarefa estudar = new LIstaTarefa();
        estudar.obterNumeroTotalDeTarefas();

        estudar.adicionarTarefa("estudar java");
        estudar.obterNumeroTotalDeTarefas();

        estudar.adicionarTarefa("estudar java");
        estudar.obterNumeroTotalDeTarefas();

        estudar.adicionarTarefa("comer");
        estudar.obterNumeroTotalDeTarefas();

        System.out.println(estudar.obterNumeroTotalDeTarefas());
        estudar.obterDescricoes();

        estudar.removerTarefa("estudar java");
        estudar.obterDescricoes();
    }
}
