package set;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable
{
	private String nomeProduto;
	private long codigoProduto;
	private double preco;
	private int quantidade;
	
	public Produto(String nomeProduto, long codigoProduto, double preco, int quantidade) 
	{
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public long getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(long codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String toString()
	{
		return "Nome:" +nomeProduto+ "codigo:" + codigoProduto +"preco:" + preco + "quantidade:" + quantidade;
	}
	  @Override
	  public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Produto produto)) return false;
	    return getCodigoProduto() == produto.getCodigoProduto();
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(getCodigoProduto());
	  }

	
	public int compareTo(Produto p) {
		// TODO Auto-generated method stub
		return nomeProduto.compareToIgnoreCase(p.getNomeProduto());
		//return 0;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class ComparatorPorPreco implements Comparator<Produto>
{

	@Override
	public int compare(Produto p1, Produto p2) {
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
}
