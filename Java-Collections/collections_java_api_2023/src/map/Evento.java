package map;

import java.time.LocalDate;

public class Evento {
	private LocalDate data;
	private String nome;
	private String atracao;
	
	public Evento(LocalDate data, String nome, String atracao)
	{
		this.data = data;
		this.nome = nome;
		this.atracao = atracao;				
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAtracao() {
		return atracao;
	}
	public void setAtracao(String atracao) {
		this.atracao = atracao;
	}
	public String toString()
	{
		return data +" , "+ nome +" , "+ atracao;
	}
	

}
