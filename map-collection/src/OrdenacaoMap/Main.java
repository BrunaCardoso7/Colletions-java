package OrdenacaoMap;

import operacaoBasica.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 15),"evento de tecnologia", "michel telo do foguetin");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.FEBRUARY, 15),"evento de culinaria", "michel telo do foguetin");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 15),"evento de educação", "michel telo do foguetin");

        agendaEventos.exibirAgenda();
        agendaEventos.proximoEvento();
    }

}
