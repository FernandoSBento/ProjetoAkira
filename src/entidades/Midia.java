package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Midia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String tipo;
	private StatusObra status;
	@ManyToOne
	private Filmes filme;
	@ManyToOne
	private Jogos jogos;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public StatusObra getStatus() {
		return status;
	}
	public void setStatus(StatusObra status) {
		this.status = status;
	}
	public Filmes getFilme() {
		return filme;
	}
	public void setFilme(Filmes filme) {
		this.filme = filme;
	}
	public Jogos getJogos() {
		return jogos;
	}
	public void setJogos(Jogos jogos) {
		this.jogos = jogos;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filme == null) ? 0 : filme.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jogos == null) ? 0 : jogos.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Midia other = (Midia) obj;
		if (filme == null) {
			if (other.filme != null)
				return false;
		} else if (!filme.equals(other.filme))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jogos == null) {
			if (other.jogos != null)
				return false;
		} else if (!jogos.equals(other.jogos))
			return false;
		if (status != other.status)
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	public String verificaDisponibilidade(StatusObra status) {
		if(status == StatusObra.DISPONIVEL) {
			return "Disponível";
		}
		else {
			return "Indisponível";
		}
	}
	
}
