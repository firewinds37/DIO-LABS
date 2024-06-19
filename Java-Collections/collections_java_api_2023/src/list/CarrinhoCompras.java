package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

	private List<Item> carrinhoList;
	
	public CarrinhoCompras()
	{
		this.carrinhoList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade)
	{
		this.carrinhoList.add(new Item(nome, preco, quantidade));	
	}
	
	public void removerItem(String nome)
	{
		List<Item> itemRemover = new ArrayList<>();
		
		for (Item t : this.carrinhoList)
		{
			
			if (t.getNome().equalsIgnoreCase(nome))
			{
				itemRemover.add(t);
			}
			
		}
		
		this.carrinhoList.removeAll(itemRemover);		
	}
	
	public double calcularValorTotal() 
	{
		double valorTotal = 0.0;
		
		for (Item t : this.carrinhoList)
		{
			valorTotal += t.getPreco() * t.getQuantidade();
		}
		
		return valorTotal;
	}
	
	public void exibirItens()
	{
		System.out.println(carrinhoList.toString());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarrinhoCompras carrinho = new CarrinhoCompras();
		
		carrinho.adicionarItem("Macbook Pro M3", 35000 , 1);
		carrinho.adicionarItem("Monitor Dell 27 4K", 5000, 1);
		carrinho.adicionarItem("teste repetido", 1.00, 2);
		carrinho.adicionarItem("teste repetido", 1.00, 2);
		
		//carrinho.removerItem("teste repetido");
		carrinho.exibirItens();
		
		System.out.println("Valor total do carrinho: "+carrinho.calcularValorTotal());
	}

}
