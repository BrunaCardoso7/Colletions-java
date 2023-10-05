import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JogoDaSenha partida = new JogoDaSenha();
        partida.showValuesGenerator();
        System.out.println(partida.makeAttempts(10, 57,27, 92, 48));
    }
}