package ed.t2.contadorPalavras;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LeitorArquivo {

	public ArrayList<Ocorrencia> lerArquivo() {
		String[] palavras = null;
		BufferedReader br = null;
		HashMap<String, Ocorrencia> ocorrenciasMap = new HashMap<String, Ocorrencia>();
		HashMap<String, String> palavrasInvalidas = lerPalavrasInvalidas();
		int contagemPalavras = 0;
		
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("livro.txt"), "UTF-8"));
			while (br.ready()) {
				String linha = br.readLine();
				palavras = linha.split(" ");		

				for (String palavra : palavras) {
					contagemPalavras++;
					palavra = removerCaracteresInvalidos(palavra);
					palavra = palavra.toLowerCase();
					
					if(palavra.length() > 0) {	
						if(palavrasInvalidas.get(palavra) == null) {
							Ocorrencia ocorrencia = new Ocorrencia(palavra, 1);
							
							if(ocorrenciasMap.get(palavra) == null) {
								ocorrenciasMap.put(ocorrencia.getPalavra(), ocorrencia);
							} else {
								if (ocorrenciasMap.get(palavra).getPalavra().equalsIgnoreCase(palavra)){
									ocorrenciasMap.get(palavra).contabilizarOcorrencia();
								}
							}
						}
					}
				}
			}
			br.close();

		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo \"livro.txt\" ");
		}
		
		ArrayList<Ocorrencia> ocorrencias = new ArrayList<Ocorrencia>(ocorrenciasMap.values());
		Collections.sort(ocorrencias, Collections.reverseOrder());
		System.out.println("Total de palavras: " + contagemPalavras);
		
		return ocorrencias;
	}
	
	private HashMap<String, String> lerPalavrasInvalidas() {
		HashMap<String, String> palavrasInvalidas = new HashMap<String, String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("palavrasInvalidas.txt"), "UTF-8"));
			while (br.ready()) {
				String linha = br.readLine();
				String[] palavrasInvalidasString = linha.split(";");
				for (String string : palavrasInvalidasString) {
					palavrasInvalidas.put(string, string);
				}
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Erro na leitura do arquivo \"palavrasInvalidas.txt\"");
		}
		return palavrasInvalidas;
	}

	private String removerCaracteresInvalidos(String p) {
		p = p.trim();
		p = p.replace(",", "");
		p = p.replace(".", "");
		p = p.replace("-", "");
		p = p.replace(":", "");
		p = p.replace(";", "");
		p = p.replace("?", "");
		p = p.replace("\"", "");
		return p;
	}	
	
}
