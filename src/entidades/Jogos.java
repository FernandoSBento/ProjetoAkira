package entidades;

import javax.persistence.Entity;

import javax.persistence.ManyToOne;

@Entity
public class Jogos extends Obra{
	
	private boolean multiplayer;
	private boolean ehOnline;
	@ManyToOne
	private Plataforma plataforma;
			
	public boolean isMultiplayer() {
		return multiplayer;
	}
	public void setMultiplayer(boolean multiplayer) {
		this.multiplayer = multiplayer;
	}
	public boolean isEhOnline() {
		return ehOnline;
	}
	public void setEhOnline(boolean ehOnline) {
		this.ehOnline = ehOnline;
	}
	public Plataforma getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (ehOnline ? 1231 : 1237);
		result = prime * result + (multiplayer ? 1231 : 1237);
		result = prime * result + ((plataforma == null) ? 0 : plataforma.hashCode());
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
		Jogos other = (Jogos) obj;
		if (ehOnline != other.ehOnline)
			return false;
		if (multiplayer != other.multiplayer)
			return false;
		if (plataforma == null) {
			if (other.plataforma != null)
				return false;
		} else if (!plataforma.equals(other.plataforma))
			return false;
		return true;
	}
	
}
