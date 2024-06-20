package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> produtoSet;
	
	public CadastroProdutos()
	{
		produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int qtd)
	{
		produtoSet.add(new Produto(nome, cod, preco, qtd));
	}
	
	public Set<Produto> exibirProdutosPorNome()
	{
		Set<Produto> produtoNome = new TreeSet<>(produtoSet);
		
		return produtoNome;
	}
	
	
	public Set<Produto> exibirProdutosPreco()
	{
		Set<Produto> produtoPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPreco.addAll(produtoSet);
		
		return produtoPreco;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CadastroProdutos produtos = new CadastroProdutos();
		
		produtos.adicionarProduto(00000L, "Produto0", 0.99, 0);
		produtos.adicionarProduto(11111L, "Produto3", 10.99, 3);
		produtos.adicionarProduto(12345L, "Produto5", 17.99, 5);	
		produtos.adicionarProduto(99999L, "Produto2", 9.99, 2);
		produtos.adicionarProduto(54321L, "Produto4", 15.99, 4);
		
		
		//System.out.println(produtos.produtoSet);
		//System.out.println(produtos.exibirProdutosPorNome());
		System.out.println(produtos.exibirProdutosPreco());

	}

}
