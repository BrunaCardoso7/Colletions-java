import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Supplier_T {
    public static void main(String[] args) {
        List<String> listaSuadacoes = Stream.generate(() -> "olá seja bem vindo!").limit(5).toList();

        listaSuadacoes.forEach(System.out::println);
    }
}
