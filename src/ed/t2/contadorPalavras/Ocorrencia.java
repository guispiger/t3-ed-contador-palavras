package ed.t2.contadorPalavras;

public class Ocorrencia implements Comparable<Ocorrencia>{
	private String palavra;
	private int numero;	
			
	public Ocorrencia(String palavra, int numero) {
		super();
		this.palavra = palavra;
		this.numero = numero;
	}
	
	public void contabilizarOcorrencia() {
		this.numero++;		
	}
	
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int compareTo(Ocorrencia o) {
		return Integer.compare(this.numero, o.getNumero());
	}

	@Override
	public String toString() {
		return  palavra + " (" + numero + " ocorrencias)";
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode");

		final int prime = 31;
		int result = 1;
		result = prime * result + ((palavra == null) ? 0 : palavra.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ocorrencia other = (Ocorrencia) obj;
		if (palavra == null) {
			if (other.palavra != null)
				return false;
		} else if (!palavra.equals(other.palavra))
			return false;
		return true;
	}
	
	
}
