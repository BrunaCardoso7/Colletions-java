import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JogoDaSenha partida = new JogoDaSenha();
        partida.fazerTentativa(20, 10, 42, 39, 91);
        partida.fazerTentativa();

    }
}