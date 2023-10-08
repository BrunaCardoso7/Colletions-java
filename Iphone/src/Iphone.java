public class Iphone {
    public void ReprodutorDeMusica() {
        // Métodos relacionados à reprodução de música
        tocar();
        pausar();
        selecionarMusica();
    }

    public void AparelhoTelefonico() {
        // Métodos relacionados ao aparelho telefônico
        ligar();
        atender();
        iniciarCorreioVoz();
    }
    public void NavegadornaInternet() {
        // Métodos relacionados ao aparelho telefônico
        exibirPagina();
        adicionarNovaAba();
        atualizarPagina();
    }
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    public void ligar() {
        System.out.println("Ligando");
    }

    public void atender() {
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    public void exibirPagina() {
        System.out.println("exibindo pagina");
    }
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba");
    }
    public void atualizarPagina() {
        System.out.println("atualizando nova aba");
    }
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ReprodutorDeMusica();
        iphone.AparelhoTelefonico();
        iphone.NavegadornaInternet();
    }
}

