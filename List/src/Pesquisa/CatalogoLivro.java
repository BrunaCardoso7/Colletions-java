package Pesquisa;
import java.util.ArrayList;
import java.util.List;
public class CatalogoLivro {
    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }
    public List<Livro> buscarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> buscarPorAno(int anoInicial, int anoFinal){
        List<Livro> livroPorAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoDePublicao() >= anoInicial && l.getAnoDePublicao()<=anoFinal){
                    livroPorAno.add(l);
                }
            }
        }
        return livroPorAno;
    }

    public List<Livro> buscarPorTitulo(String titulo){
        List<Livro> livrosPorTitulo = null;
        if (!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo.add(l);
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }
    public void mostrarLivros(){
        System.out.println(livroList);
    }

}
