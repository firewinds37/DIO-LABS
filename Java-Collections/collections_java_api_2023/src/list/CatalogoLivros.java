package list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> listLivro;
	
	public CatalogoLivros()
	{
		listLivro = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao)
	{
		this.listLivro.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor)
	{
		List<Livro> livrosPorAutor = new ArrayList<>();
		
		if (!listLivro.isEmpty())
		{
			for (Livro l : listLivro)
			{
				if (l.getAutor().equalsIgnoreCase(autor))
				{
					livrosPorAutor.add(l);
				}
			}
		}
		
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal)
	{
		List<Livro> livrosPorAno = new ArrayList<>();
		
		if (!listLivro.isEmpty())
		{
			for (Livro l : listLivro)
			{
				if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
				{
					livrosPorAno.add(l);
				}
			}
		}
		
		return livrosPorAno;
	}
	
	public Livro pesquisarPorTitulo(String titulo)
	{		
		
		if (!listLivro.isEmpty())
		{
			for (Livro l : listLivro)
			{
				if (l.getTitulo().equalsIgnoreCase(titulo))
				{
					return l;
				}
			}
		}
		
		return null;
		
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Hello");
		CatalogoLivros catalogo = new CatalogoLivros();
		
		catalogo.adicionarLivro("Livro 1", "Autor 1", 2020);
		catalogo.adicionarLivro("Livro 1", "Autor 2", 2021);
		catalogo.adicionarLivro("Livro 2", "Autor 2", 2022);
		catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
		catalogo.adicionarLivro("Livro 4", "Autor 4", 1994);
		
		//System.out.println(catalogo.pesquisarPorAutor("Autor 2"));
		//System.out.println(catalogo.pesquisarPorIntervaloAnos(1990,1994));
		//System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));
		System.out.println(catalogo.pesquisarPorAutor("Autor 1"));
		
	}
}
