import java.util.Scanner;
public class Aluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota da primeira prova (P1): ");
        double notaP1 = input.nextDouble();

        System.out.println("Digite a nota da segunda prova (P2): ");
        double notaP2 = input.nextDouble();

        if (notaP1 >= 3.0 && notaP2 >= 3.0) {
            double media = (notaP1 + notaP2) / 2;
            if (media >= 5.0) {
                System.out.println("Média final: " + media);
                System.out.println("Aprovado");
            } else {
                System.out.println("Média final: " + media);
                System.out.println("Reprovado");
            }
        } else {
            System.out.println("Digite a nota da terceira prova (P3): ");
            double notaP3 = input.nextDouble();

            double maiorNota = Math.max(notaP1, notaP2);
            double media = (maiorNota + notaP3) / 2;

            if (media >= 5.0) {
                System.out.println("Média final: " + media);
                System.out.println("Aprovado");
            } else {
                System.out.println("Média final: " + media);
                System.out.println("Reprovado");
            }
        }

        input.close();
    }
}
