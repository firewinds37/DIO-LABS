package controleFluxo;

public class ParametroInvalidoException extends Exception {

	public String getMessage()
	{
		return "O segundo parametro deve ser maior que o primeiro";
	}
}
