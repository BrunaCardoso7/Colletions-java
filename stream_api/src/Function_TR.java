import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function_TR {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

//        Function<Integer, Integer> dobrarNumero = numero -> numero*2;

        List<Integer> numerosDobrados = numeros.stream().map(numero -> numero*2).toList();

        numerosDobrados.forEach(System.out::println);
    }
}
