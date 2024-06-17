package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
	
	public static void main(String[] args) {
		System.out.println("Processo seletivo");
		
		contactarCandidato();

	}
	
	static void contactarCandidato()
	{
		String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE",};
		
		for (String candidato: candidatos)
		{
			entrarContato(candidato);
		}
				
	}
	
	static void entrarContato(String candidato) 
	{
		int tentivaContato = 0;
		boolean continuarTentativa = true;
		boolean atendeu=false;
		
		do 
		{
						
			atendeu = atender();
			
			continuarTentativa = !atendeu;

			if (continuarTentativa)
				tentivaContato++;			
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");

			
		}while(continuarTentativa && tentivaContato < 3);
		
		if (atendeu)
			System.out.println("Conseguimos contato com " + candidato + " na tentativa de número " + tentivaContato);
		else
			System.out.println("Não conseguimos contato com o candidato " + candidato);
	}

	static void selecaoCandidatos()
	{
		double salarioBase = 2000.00;
		int candidatosselecionados = 0;
		int candidatoAtual = 0;
		String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE",};
		
		while (candidatosselecionados < 5 || candidatoAtual < candidatos.length)
		{
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato "+ candidato + " solicitou o salario de R$"+ String.format("%.2f",salarioPretendido));
			
			if (salarioBase >= salarioPretendido)
			{
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosselecionados++;
			}
			
			candidatoAtual++;
		}
		
	}
	
	static double valorPretendido() 
	{
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}

	static boolean atender() 
	{
		return new Random().nextInt(3) == 1;
	}
	
	static void analisarCandidato(double salarioPretendido) 
	{
		double salarioBase = 2000.00;
		
		if (salarioBase > salarioPretendido)
			System.out.println("Ligar para o candidato");
		else if (salarioBase == salarioPretendido)
			System.out.println("Ligar para o candidato com contraproposta");
		else
			System.out.println("Aguardando resultado dos demais candidatos");
		
		
	}
}
