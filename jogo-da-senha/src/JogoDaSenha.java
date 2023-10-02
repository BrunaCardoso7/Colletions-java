import java.util.Arrays;
import java.util.Random;

public class JogoDaSenha {
    private int[] chosenRandomValues;
    private final Random generator;

    public JogoDaSenha() {
        this.generator = new Random();
        this.chosenRandomValues = getChosenRandomValues();
    }
    private int[] getChosenRandomValues() {
        chosenRandomValues = new int[30];
        for(int n = 0; n < 30; n++){
            int randomNumber 

        }
        return chosenRandomValues;
    }
    private boolean mapArray(){
        boolean result=true;
        for(int i : chosenRandomValues){
            for(int n = 0; n<30 ; n++){
               if(chosenRandomValues[n] != i){
                   return result = true;
               }else {
                   return result = false;
               }
            }
        }
        return result;
    }
    public void showValuesGenerator(){
        System.out.println(Arrays.toString(chosenRandomValues));
    }
}
