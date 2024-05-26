package map.Ordenacao;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        //Evento evento = new Evento(nome, atracao);
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
//        Set<LocalDate> dateSet = agendaEventosMap.keySet(); // Não podemos usar pois o Set e o Colletions
//        Collection<Evento> values = agendaEventosMap.values(); // Não conversão entre si
//        agendaEventosMap.get(); // Não podemos usar pois não sabemos qual a data.

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
            proximaData = entry.getKey();
            proximoEvento = entry.getValue();
            System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data: " + proximaData);
            break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2020,12,31), "Ano Novo", "Safadão");
        agendaEventos.adicionarEvento(LocalDate.of(2024,5,29), "São João de Quixadá", "Murilo Rufh");
        agendaEventos.adicionarEvento(LocalDate.of(2024,9,7), "Independência", "Lula");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
        System.out.println("Data de Hoje: " + LocalDate.now());

    }
}
