package set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatoSet;
	
	public AgendaContatos()
	{
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero)
	{
		this.contatoSet.add(new Contato(nome, numero));
	} 
	
	public void exibirContato()
	{
		System.out.println(this.contatoSet.toString());
	}
	
	public Set<Contato> pesquisarNome(String nome)
	{
		Set<Contato> contatoBuscaNome = new HashSet<>();
		for (Contato c : this.contatoSet)
		{
			if (c.getNome().startsWith(nome))
			{
				contatoBuscaNome.add(c);
			}
		}
		
		return contatoBuscaNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int numero)
	{
		Contato contatoAtualizado = null;
		for (Contato c : this.contatoSet )
		{
			if (c.getNome().equalsIgnoreCase(nome))
			{
				c.setNumero(numero);
				contatoAtualizado = c;
				break;
			}

		}
		return contatoAtualizado;
	}
	
	
	
	public static void main(String[] args) 
	{
		AgendaContatos agenda = new AgendaContatos();
		
		agenda.adicionarContato("Camila", 0001);
		agenda.adicionarContato("Camila", 0);
		agenda.adicionarContato("Camila Cavalcante", 1111);
		agenda.adicionarContato("Camila DIO", 654897);
		agenda.adicionarContato("Maria Silva", 11111);
		
		agenda.exibirContato();
		
		System.out.println(agenda.pesquisarNome("Camila"));
		
		System.out.println(agenda.atualizarNumeroContato("Maria Silva", 9999));
		
		agenda.exibirContato();
	}

}
