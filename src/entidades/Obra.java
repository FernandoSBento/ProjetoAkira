package entidades;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Obra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String titulo;
	private Integer ano;
	private Integer idadeMinima;
	//@ManyToOne
	//private StatusObra status;
	@ManyToOne
	private Genero genero;
	@ManyToOne
	private Produtora produtora;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Integer getIdadeMinima() {
		return idadeMinima;
	}
	public void setIdadeMinima(Integer idadeMinima) {
		this.idadeMinima = idadeMinima;
	}
//	public StatusObra getStatus() {
//		return status;
//	}
//	public void setStatus(StatusObra status) {
//		this.status = status;
//	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Produtora getProdutora() {
		return produtora;
	}
	public void setProdutora(Produtora produtora) {
		this.produtora = produtora;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idadeMinima == null) ? 0 : idadeMinima.hashCode());
		result = prime * result + ((produtora == null) ? 0 : produtora.hashCode());
		//result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Obra other = (Obra) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idadeMinima == null) {
			if (other.idadeMinima != null)
				return false;
		} else if (!idadeMinima.equals(other.idadeMinima))
			return false;
		if (produtora == null) {
			if (other.produtora != null)
				return false;
		} else if (!produtora.equals(other.produtora))
			return false;
//		if (status != other.status)
//			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
//	public String verificaDisponibilidade(StatusObra status) {
//		if(status == StatusObra.DISPONIVEL) {
//			return "Disponível";
//		}
//		else {
//			return "Indisponível";
//		}
//	}
	
}
