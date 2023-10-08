import java.util.Arrays;
import java.util.List;

public class BinaryOparator_TT_R {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4);
        int resultado = numeros.stream().reduce(0, Integer::sum);
        System.out.println(resultado);
    }
}
