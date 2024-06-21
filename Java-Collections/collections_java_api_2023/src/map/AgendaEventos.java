package map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventosMap;
	
	public AgendaEventos() 
	{
		eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao)
	{
		Evento evento = new Evento(data, nome, atracao);
		eventosMap.put(data, evento);
	}
	
	public void exibirAgenda() 
	{
		Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventoTreeMap);
	}
	
	
	public void obterProximoEvento() 
	{
		Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>();
		LocalDate dataAtual = LocalDate.now();
		for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet())
		{
			if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual))
			{
				System.out.println("O proximo evento: " + entry.getValue() + " acontecera na data: "+ entry.getKey());
				break;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();

		agendaEventos.adicionarEvento(LocalDate.of(2022,7, 15), "Evento 1", "Atracao 1");
		agendaEventos.adicionarEvento(LocalDate.of(2022,7, 9), "Evento 2", "Atracao 2");
		agendaEventos.adicionarEvento(LocalDate.of(2000,1, 10), "Evento 3", "Atracao 3");
		agendaEventos.adicionarEvento(LocalDate.of(2024,7, 22), "Evento 3", "Atracao 3");
		//agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
	}

}
