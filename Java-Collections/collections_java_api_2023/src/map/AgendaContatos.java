package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	private Map<String, Integer> agendaContatoMap;
	
	public AgendaContatos() 
	{
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone)
	{
		this.agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome)
	{
		if (!this.agendaContatoMap.isEmpty())
		{
			this.agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContatos()
	{
		System.out.println(this.agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome)
	{
		if (!this.agendaContatoMap.isEmpty())
		{
			return this.agendaContatoMap.get(nome);
		}
		return null;
	}
	
	public static void main(String[] args) {
		AgendaContatos agenda = new AgendaContatos();
		
		agenda.adicionarContato("Camila", 123456);
		agenda.adicionarContato("Camila", 5665);
		agenda.adicionarContato("Camila Calvancante", 1111111);
		agenda.adicionarContato("Camila DIO", 654987);
		agenda.adicionarContato("Maria Silva", 99999);
		agenda.adicionarContato("Camila", 44444);
		
		agenda.exibirContatos();
		
		agenda.removerContato("Maria Silva");
		agenda.exibirContatos();
		
		System.out.println("O numero é: " + agenda.pesquisarPorNome("Camila DIO"));
		

	}

}
