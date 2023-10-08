import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/**
 * */
public class Consumer_T {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Consumer<Integer> listarNumeros = numero -> {
            if(numero%2 == 0){
                System.out.println(numero+": numero par");
            }
        };

        numeros.forEach(integer -> {
                if(integer%2 == 0){
                    System.out.println(integer + ": numero par!");
                }
        });
        numeros.forEach(System.out::println);
    }
}
