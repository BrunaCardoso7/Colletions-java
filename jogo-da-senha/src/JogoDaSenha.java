import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class JogoDaSenha {
    private int[] valoresAleatoriosEcolhidos;
    private final Random generator;
    private Scanner scanner;
    private int contadorPesquisa;
    public JogoDaSenha() {
        this.generator = new Random();
        this.valoresAleatoriosEcolhidos = getValoresAleatoriosEcolhidos();
        this.scanner = new Scanner(System.in);
        this.contadorPesquisa = 0;
    }
    private int[] getValoresAleatoriosEcolhidos() {
        valoresAleatoriosEcolhidos = new int[30];
        for(int n = 0; n < 30; n++){
            int randomNumber;
            do{
                randomNumber = generator.nextInt(101);
            }while(!isUnique(randomNumber, n));

            valoresAleatoriosEcolhidos[n] = randomNumber;
        }
        return valoresAleatoriosEcolhidos;
    }
    private boolean isUnique(int randomNum, int currentNum){
        for(int i = 0; i < currentNum; i++){
            if(valoresAleatoriosEcolhidos[i] == randomNum){
                return false;
            }
        }
        return true;
    }
    private void mostrarValoresGerados(){
        System.out.println("Lista gerada: \n"+Arrays.toString(valoresAleatoriosEcolhidos));
        System.out.println("total de pesquisas: \n"+ getContadorPesquisa());
    }
    public void fazerTentativa(int t1, int t2, int t3, int t4, int t5){
        int cont = 0;
        for(int c : valoresAleatoriosEcolhidos){
            if (t1 == c || t2 == c || t3 == c || t4 == c || t5 == c){
                cont++;
                contadorPesquisa ++;
            }
        }
        getSenha(cont ,t1, t2, t3, t4, t5);
        System.out.println("acertos: "+cont);
    }
    public void fazerTentativa(){
        int cont = 0;
        System.out.println("Qual o seu primeiro palpite?");
        int t1 = scanner.nextInt();
        System.out.println("Qual o seu segundo palpite?");
        int t2 = scanner.nextInt();
        System.out.println("Qual o seu terceiro palpite?");
        int t3 = scanner.nextInt();
        System.out.println("Qual o seu quarto palpite?");
        int t4 = scanner.nextInt();
        System.out.println("Qual o seu quinto palpite?");
        int t5 = scanner.nextInt();
        for(int c : valoresAleatoriosEcolhidos){
            if (t1 == c || t2 == c || t3 == c || t4 == c || t5 == c){
                cont++;
                contadorPesquisa ++;
            }
        }
        getSenha(cont ,t1, t2, t3, t4, t5);
        System.out.println("acertos: "+cont);
        continuarJogando();
    }
    private void getSenha(int cont, int t1, int t2, int t3, int t4, int t5){
        String msg = "Você ainda não adivinhou a senha!";
        if (cont == 5){
            System.out.println(Arrays.toString(valoresAleatoriosEcolhidos));
        }
        System.out.println(msg);
    }
    private int getContadorPesquisa(){
        return contadorPesquisa;
    }
    private void continuarJogando(){
        String opcao;
        System.out.println("quer mais uma partida? sim ou não");
        scanner.nextLine();
        opcao = scanner.nextLine();
        if (opcao.equalsIgnoreCase("sim")){
            fazerTentativa();
        }else{
            mostrarValoresGerados();
        }
    }
}