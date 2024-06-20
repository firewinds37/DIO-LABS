package set;

public class Convidado {
	private String nome;
	private int codigoConvite;
	
	public Convidado(String nome, int codigoConvite)
	{
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigoConvite() {
		return codigoConvite;
	}
	public void setCodigoConvite(int codigoConvite) {
		this.codigoConvite = codigoConvite;
	}
	
	public String toString()
	{
		return nome + " , " + String.valueOf(codigoConvite);		
	}

	public boolean equals(Object o)
	{
		if (this == o)
			return true;
		if(!(o instanceof Convidado convidado))
			return false;
		
		return getCodigoConvite() == convidado.getCodigoConvite();
 	}
	
}
