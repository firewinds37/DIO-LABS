package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

	private List<Pessoa> listPessoa;
	
	public OrdenacaoPessoa() 
	{
		this.listPessoa = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura)
	{
		this.listPessoa.add(new Pessoa(nome, idade, altura));
	}
	
	
	public List<Pessoa> ordenarIdade()
	{
		List<Pessoa> pessoasIdade = new ArrayList<>(listPessoa);
		Collections.sort(pessoasIdade); 
		return pessoasIdade;
	}
	
	public List<Pessoa> ordenarAltura()
	{
		List<Pessoa> pessoaAltura = new ArrayList<Pessoa>(listPessoa);
		Collections.sort(pessoaAltura, new ComparatorPorAltura());
		return pessoaAltura;
	}
	
	public static void main(String[] args)
	{
		OrdenacaoPessoa ordenador = new OrdenacaoPessoa();
		
		ordenador.adicionarPessoa("Nome 1", 20, 1.56);
		ordenador.adicionarPessoa("Nome 2", 30, 1.80);
		ordenador.adicionarPessoa("Nome 3", 25, 1.70);
		ordenador.adicionarPessoa("Nome 4", 17, 1.56);
		
		System.out.println(ordenador.ordenarIdade());
		System.out.println(ordenador.ordenarAltura());
	}
}
