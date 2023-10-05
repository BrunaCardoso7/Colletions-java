import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class JogoDaSenha {
    private int[] chosenRandomValues;
    private final Random generator;
    private Scanner scanner;
//
    public JogoDaSenha() {
        this.generator = new Random();
        this.chosenRandomValues = getChosenRandomValues();
        this.scanner = new Scanner(System.in);
    }

    private int[] getChosenRandomValues() {
        chosenRandomValues = new int[30];
        for(int n = 0; n < 30; n++){
            int randomNumber;
            do{
                randomNumber = generator.nextInt(101);
            }while(!isUnique(randomNumber, n));

            chosenRandomValues[n] = randomNumber;
        }
        return chosenRandomValues;
    }
    private boolean isUnique(int randomNum, int currentIndex){
        for(int i = 0; i < currentIndex; i++){
            if(chosenRandomValues[i] == randomNum){
                return false;
            }
        }
        return true;
    }
    public void showValuesGenerator(){
        System.out.println(Arrays.toString(chosenRandomValues));
    }
    //metodo façaTentativa
    public int makeAttempts(int t1, int t2, int t3, int t4, int t5){
        int cont = 0;
        for(int c : chosenRandomValues){
            if (t1 == c || t2 == c || t3 == c || t4 == c || t5 == c){
                cont++;
            }
        }
        getPassWord(cont ,t1, t2, t3, t4, t5);
        getCountSearch(cont);
        return cont;
    }
    //sobrecarga de métodos façaTentativa
    public int makeAttempts(){
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

        for(int c : chosenRandomValues){
            if (t1 == c || t2 == c || t3 == c || t4 == c || t5 == c){
                cont++;
            }
        }
        getPassWord(cont ,t1, t2, t3, t4, t5);
        return cont;
    }
    private void getPassWord(int cont, int t1, int t2, int t3, int t4, int t5){
        String msg = "Você ainda não adivinhou a senha!";
        if (cont == 5){
            System.out.println(chosenRandomValues);
        }
        System.out.println(msg);
        makeAttempts();
    }
    public int getCountSearch(int count){

        return 1;
    }
}
