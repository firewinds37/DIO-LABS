package map;

public class Produto 
{
	private long codigoProduto;
	private String nomeProduto;
	private int quantidade;
	private double preco;
	
	public Produto(long codigoProduto, String nomeProduto, int quantidade, double preco)
	{
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.preco = preco;
		
		
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
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String toString()
	{
		return this.codigoProduto +" , "+ this.nomeProduto +" , "+ this.quantidade +" , "+ this.preco;
	}
}
