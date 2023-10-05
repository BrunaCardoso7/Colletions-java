package OrdenacaoMap;
import jdk.jfr.Event;

import java.time.chrono.ChronoLocalDate;
import java.util.*;
import java.time.LocalDate;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventoMap;

    public AgendaEventos() {
        this.agendaEventoMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventoMap.put(data, new Evento(nome, atracao));
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventoMap);
        System.out.println(eventosTreeMap);
    }
    public void proximoEvento(){
        LocalDate date = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventoMap);
        for(Map.Entry<LocalDate, Evento> entry : agendaEventoMap.entrySet()){
            if(entry.getKey().isEqual(date)|| entry.getKey().isAfter(date)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento é "+ proximaData+"acontecera na data "+ proximoEvento);
                break;
            }
        }
    }

}
