package map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	private Map<Long, Produto> estoqueProdutosMap;
	
	public EstoqueProdutos()
	{
		estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(long codigoProduto, String nomeProduto, int quantidade, double preco)
	{
		this.estoqueProdutosMap.put(codigoProduto, (new Produto(codigoProduto, nomeProduto, quantidade,preco)));
	}
	
	public void exibirProdutos()
	{
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotalEstoque() 
	{
		double valorTotalEstoque = 0;
		if (!this.estoqueProdutosMap.isEmpty())
		{
			for (Produto p: estoqueProdutosMap.values())
			{
				valorTotalEstoque += p.getPreco() * p.getQuantidade();
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro()
	{
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		
		if (!this.estoqueProdutosMap.isEmpty())
		{
			for (Produto p: estoqueProdutosMap.values())
			{
				if (p.getPreco() > maiorPreco)
				{
					produtoMaisCaro = p;
					maiorPreco = p.getPreco();
				}
			}
		}
		
		
		return produtoMaisCaro;
	}
	
	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();
		
		estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
		estoque.adicionarProduto(2L, "Produto B", 05, 10.0);
		estoque.adicionarProduto(3L, "Produto C", 02, 15.0);
		
		estoque.exibirProdutos();
		
		System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());
		System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
		
		
	}

}
