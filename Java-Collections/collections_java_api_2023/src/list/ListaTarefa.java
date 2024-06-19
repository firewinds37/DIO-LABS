package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	private List<Tarefa> tarefaList;
	
	public ListaTarefa()
	{
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao)
	{
		this.tarefaList.add(new Tarefa(descricao));		
	}
	
	public void removerTarefa(String descricao)
	{
		List<Tarefa> tarefaRemover = new ArrayList<>();
		
		for (Tarefa t : this.tarefaList)
		{
			
			if (t.getDescricao().equalsIgnoreCase(descricao))
			{
				tarefaRemover.add(t);
			}
			
		}
		
		this.tarefaList.removeAll(tarefaRemover);
	}
	
	public int obterNumeroTotalTarefas()
	{
		return this.tarefaList.size();
	}
	
	public void obterDescricoesTarefas()
	{
		System.out.println(tarefaList.toString());
	}
	
	
	public static void main(String[] args) {
		System.out.println("Hello!");
		
		ListaTarefa listaTarefa = new ListaTarefa();
		
		
		
		listaTarefa.adicionarTarefa("teste1");
		listaTarefa.adicionarTarefa("teste2");
		listaTarefa.adicionarTarefa("teste2");
		listaTarefa.adicionarTarefa("teste3");
		
		
		listaTarefa.removerTarefa("teste2");
		
		listaTarefa.obterDescricoesTarefas();
		
		System.out.println("Numero de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());
		
	}
}
