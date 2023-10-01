public class Divisao {
    private int n1;
    private int n2;
    public Divisao(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public int getN1() {return n1;}
    public int getN2() {return n2;}
    public int dividirNumero() {
        if(getN2() == 0){
            throw new ArithmeticException("Erro ao dividir: divisão por zero");
        }
        return getN1()/getN2();
    }
    public static void main(String[] args) {
        Divisao divisao = new Divisao(100, 0);
        try{
            System.out.println(divisao.dividirNumero());
        }
        catch (ArithmeticException e){
            System.out.println("Erro ao dividir: divisão por zero");
        }
    }
}