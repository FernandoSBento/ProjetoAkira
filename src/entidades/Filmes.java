package entidades;

import javax.persistence.Entity;

@Entity
public class Filmes extends Obra{
	
	private String elenco;
	private String diretor;
	
	public String getElenco() {
		return elenco;
	}
	public void setElenco(String elenco) {
		this.elenco = elenco;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diretor == null) ? 0 : diretor.hashCode());
		result = prime * result + ((elenco == null) ? 0 : elenco.hashCode());
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
		Filmes other = (Filmes) obj;
		if (diretor == null) {
			if (other.diretor != null)
				return false;
		} else if (!diretor.equals(other.diretor))
			return false;
		if (elenco == null) {
			if (other.elenco != null)
				return false;
		} else if (!elenco.equals(other.elenco))
			return false;
		return true;
	}
	
	
}
