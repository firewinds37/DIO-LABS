package controleFluxo;

import java.util.Scanner;



public class Contador  {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parametro");
		
		int param1 = scanner.nextInt();
		
		

		System.out.println("Digite o segundo parametro");
		
		int param2 = scanner.nextInt();
		
		
		
		try 
		{
			contar(param1, param2);
		}
		catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}
		finally 
		{
			
		}
		
		scanner.close();
		

	}
	
	static void contar(int param1, int param2) throws ParametroInvalidoException
	{
		int iteracoes = 0;
		
		if (param1 > param2)
		{			
			throw new ParametroInvalidoException();
		}
		else
			iteracoes = param2 - param1;
		
		for (int i = 0; i < iteracoes; i++)
		{
			System.out.println("Imprimindo na tela: " + (i+1));
		}
 
	}

}
