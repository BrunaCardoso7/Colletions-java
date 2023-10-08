import java.util.Arrays;
import java.util.List;

public class Predicator_TB {
    public static void main(String[] args) {
        List<String> linguagensProgramacao = Arrays.asList("Java", "javascript", "python", "go", "R", "lua");
        linguagensProgramacao.stream().filter(l->l.length()<=5).forEach(System.out::println);
    }
}
