import java.util.Arrays;
import java.util.Random;

public class JogoDaSenha {
    private int[] chosenRandomValues; //array com os numeros aleatórios gerados
    private final Random generator;

    public JogoDaSenha() {
        this.generator = new Random();
        this.chosenRandomValues = getChosenRandomValues();
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
}
