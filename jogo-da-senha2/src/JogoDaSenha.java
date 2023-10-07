    import java.util.Random;
    import java.util.Arrays;
    import java.util.Scanner;
    public class JogoDaSenha {
        private int[] listaDeNumerosAleatorios;
        private Random rodar;
        private Scanner scanner;
        private int pesquisa;

        public JogoDaSenha(){
            this.rodar = new Random();
            this.listaDeNumerosAleatorios = getlistadenumerosaleatorios();
            this.scanner = new Scanner(System.in);
            this.pesquisa = 0;
        }

        @Override
        public String toString() {
            return "JogoDaSenha" +
                    "listaDeNumerosAleatorios=" + Arrays.toString(listaDeNumerosAleatorios);
        }
        private int[] getlistadenumerosaleatorios(){
            listaDeNumerosAleatorios   = new int [30];
            int numeroAl;


            for(int k = 0; k < 30; k++){
                do{
                    numeroAl = rodar.nextInt(101);//54
                }while(!isUnique(numeroAl, k));
                listaDeNumerosAleatorios[k] = numeroAl;
            }
                return listaDeNumerosAleatorios;

        }
        private boolean isUnique(int numAl, int indice){
            for(int i = 0; i < indice; i++){
                if(listaDeNumerosAleatorios[i] == numAl){
                    return false;
                }
            }
            return true;
        }

        public int fazerTentativa(int t1, int t2, int t3, int t4, int t5 ){
            int acertos=0;
            for (int i = 0; i < 30; i++){
                pesquisa++;
                if( t1 == listaDeNumerosAleatorios[i] ||
                        t2 == listaDeNumerosAleatorios[i] ||
                        t3 == listaDeNumerosAleatorios[i] ||
                        t4 == listaDeNumerosAleatorios[i] ||
                        t5 == listaDeNumerosAleatorios[i]){
                    acertos ++;
                }
            }
            System.out.println("pesquisas: "+getContadorPesquisa());
            System.out.println("acertos: "+ acertos);
            getSenha(acertos);
            return acertos;
        }
        public int fazerTentativa(){
            int acertos = 0;

            System.out.println("qual o seu primeiro palpite?");
            int t1 = scanner.nextInt();
            System.out.println("qual o seu segundo palpite?");
            int t2 = scanner.nextInt();
            System.out.println("qual o seu terceiro palpite?");
            int t3 = scanner.nextInt();
            System.out.println("qual o seu quarto palpite?");
            int t4 = scanner.nextInt();
            System.out.println("qual o seu quinto palpite?");
            int t5 = scanner.nextInt();
            for (int i = 0; i < 30; i++){
                pesquisa++;
                if( t1 == listaDeNumerosAleatorios[i] ||
                    t2 == listaDeNumerosAleatorios[i] ||
                    t3 == listaDeNumerosAleatorios[i] ||
                    t4 == listaDeNumerosAleatorios[i] ||
                    t5 == listaDeNumerosAleatorios[i]){
                    acertos ++;
                }
            }
            System.out.println("pesquisas: "+getContadorPesquisa());

            getSenha(acertos);
            System.out.println("acertos: "+ acertos);
            return acertos;
        }
        private String getSenha(int acertos){
            String msg2 = "você ganhou";
            String msg1 = "Você ainda não acertou!";
            if(acertos == 5){
                System.out.println("você ganhou!");
                System.out.println(Arrays.toString(listaDeNumerosAleatorios));
                return msg2;
            }
            System.out.println("você ainda não ganhou!");
            return msg1;
        }
        public int getContadorPesquisa(){
            return pesquisa;
        }
        public static void main(String[] args)  {
            JogoDaSenha jogoDaSenha = new JogoDaSenha();
            jogoDaSenha.fazerTentativa(12, 34, 98, 14, 30);
            jogoDaSenha.fazerTentativa();
        }
    }