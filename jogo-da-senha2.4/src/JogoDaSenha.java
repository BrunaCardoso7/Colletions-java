import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JogoDaSenha {
    int[] senha;
    private boolean venceu;
    private int contadorPesquisa;
    public JogoDaSenha() {
        senha = new int[30];
        gerarSenha();
        this.contadorPesquisa = 0;
    }

    private void gerarSenha() {
        Random random = new Random();
        int index = 0;

        while (index < 30) {
            int valor = random.nextInt(100) + 1;

            // Verifica se o valor já está no array senha
            if (!contemValor(senha, valor)) {
                senha[index] = valor;
                index++;

            }
        }
    }

    boolean contemValor(int[] array, int valor) {
        for (int num : array) {
            if (num == valor) {
                return true;
            }
        }
        return false;
    }

    public int fazerTentativa(int[] tentativa) {
        int acertos = 0;
        for (int i = 0; i < 5; i++) {
            if (contemValor(senha, tentativa[i])) {
                acertos++;
                contadorPesquisa++;
            }
        }
        return acertos;
    }

    public int fazerTentativa() {
        Scanner scanner = new Scanner(System.in);
        int[] tentativa = new int[5];

        System.out.println("Digite 5 valores de 1 a 100 separados por espaços:");

        for (int i = 0; i < 5; i++) {
            tentativa[i] = scanner.nextInt();
            contadorPesquisa++;
        }

        return fazerTentativa(tentativa);
    }

    public String getSenha(Boolean venceu) {
        if (venceu) {
            return Arrays.toString(senha);
        } else {
            return "Você ainda não adivinhou a senha!";
        }
    }

    public int getContadorPesquisa() {
        return contadorPesquisa;
    }

    public static void main(String[] args) {
        JogoDaSenha jogo = new JogoDaSenha();

        while (!jogo.venceu) {
            int acertos = jogo.fazerTentativa();
            System.out.println("Você adivinhou " + acertos + " valores corretamente!");
            System.out.println("Número de comparações realizadas: " + jogo.getContadorPesquisa());
        }

    }
}