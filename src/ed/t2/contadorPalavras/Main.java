package ed.t2.contadorPalavras;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		long tempoInicio = new Date().getTime();
		
		LeitorArquivo leitorArquivo = new LeitorArquivo();
		ArrayList<Ocorrencia> ocorrencias = leitorArquivo.lerArquivo();
		
		System.out.println("Contado palavras com HashMap");
		System.out.println("Total de palavras únicas: " + ocorrencias.size());
		System.out.println("As palavras de maior ocorência são:");
		System.out.println("=======================================");
		
		for (int i = 0; i < 20; i++) {
			System.out.println(i + 1 + ") " + ocorrencias.get(i));
		}
		
		long tempoFinal = new Date().getTime();
		
		BigDecimal tempoProcessamento = new BigDecimal((tempoFinal-tempoInicio));
		tempoProcessamento = tempoProcessamento.divide(new BigDecimal(1000));
		
		System.out.format("Tempo de processament0: %s segundos\n", tempoProcessamento);
	}	
}
	