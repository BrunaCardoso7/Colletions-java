import java.util.Arrays;
import java.util.Random;
public class JogoDaSenha {
    //array=lista
    private int[] listaDeSenhaGerada;
    private Random random;
    public JogoDaSenha() {
        this.random = new Random();
        this.listaDeSenhaGerada = gerarListaAleatoria();
    }
    private int[] gerarListaAleatoria(){
        listaDeSenhaGerada = new int[30];
        //pecorrendo a lista
        for(int i = 0; i < 30; i++){
            int numeroAleatorio;
            do{
                numeroAleatorio = random.nextInt(101);//42
            }while(isUnique(numeroAleatorio, i));

            listaDeSenhaGerada[i] = numeroAleatorio;
        }
        return listaDeSenhaGerada;
    }
    private boolean isUnique(int numAL, int index){
        for(int i = 0; i < index; i++){
           if(listaDeSenhaGerada[i] == numAL){
               System.out.println("numero repetido");
               return true;
           }
        }
        System.out.println("numeros diferentes");
        return false;
    }
    @Override
    public String toString() {
        return "JogoDaSenha" +
                "listaDeSenhaGerada=" + Arrays.toString(listaDeSenhaGerada) ;

    }
    public static void main(String[] args) {
        JogoDaSenha jogoDaSenha = new JogoDaSenha();
        System.out.println(jogoDaSenha.toString());
    }
}