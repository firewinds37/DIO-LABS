package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	
	private Set<Convidado> convidadoSet;
	
	public ConjuntoConvidados()
	{
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidade(String nome, int codigoConvidado)
	{
		
		this.convidadoSet.add(new Convidado(nome, codigoConvidado));
	}
	
	public void removerConvidadoPorCodigo(int codigoConvite)
	{
		Convidado convidado = null;
		
		for (Convidado c : convidadoSet)
		{
			if (c.getCodigoConvite() == codigoConvite)
			{
				convidado = c;
				break;
			}
		}
		
		this.convidadoSet.remove(convidado);
	}
	
	
	public int contarConvidados()
	{
		return this.convidadoSet.size();
	}
	
	public void exibirConvidados()
	{
		System.out.println(this.convidadoSet.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidado(s)");
		
		conjuntoConvidados.adicionarConvidade("Convidado 1", 0001);
		conjuntoConvidados.adicionarConvidade("Convidado 2", 0002);
		conjuntoConvidados.adicionarConvidade("Convidado 3", 0003);
		conjuntoConvidados.adicionarConvidade("Convidado 3", 0003);
		conjuntoConvidados.adicionarConvidade("Convidado 4", 0004);
		
		System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidado(s)");
		
		conjuntoConvidados.removerConvidadoPorCodigo(0004);
		System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidado(s)");
		
		conjuntoConvidados.exibirConvidados();
				
		
	}

}
