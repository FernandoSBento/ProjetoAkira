package entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Locacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date dtLocacao;
	private Date dtDevolucao;
	private Double valorLocacao;
	private Double valorTotal;
	
	private FormaPgto formaPgto;
	@ManyToOne
	private Dependente dependente;
	@ManyToOne
	private Empregado empregado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDtLocacao() {
		return dtLocacao;
	}
	public void setDtLocacao(Date dtLocacao) {
		this.dtLocacao = dtLocacao;
	}
	public Date getDtDevolucao() {
		return dtDevolucao;
	}
	public void setDtDevolucao(Date dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}
	public Double getValorLocacao() {
		return valorLocacao;
	}
	public void setValorLocacao(Double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public FormaPgto getFormaPgto() {
		return formaPgto;
	}
	public void setFormaPgto(FormaPgto formaPgto) {
		this.formaPgto = formaPgto;
	}
	public Dependente getDependente() {
		return dependente;
	}
	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}
	public Empregado getEmpregado() {
		return empregado;
	}
	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dependente == null) ? 0 : dependente.hashCode());
		result = prime * result + ((dtDevolucao == null) ? 0 : dtDevolucao.hashCode());
		result = prime * result + ((dtLocacao == null) ? 0 : dtLocacao.hashCode());
		result = prime * result + ((empregado == null) ? 0 : empregado.hashCode());
		result = prime * result + ((formaPgto == null) ? 0 : formaPgto.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((valorLocacao == null) ? 0 : valorLocacao.hashCode());
		result = prime * result + ((valorTotal == null) ? 0 : valorTotal.hashCode());
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
		Locacao other = (Locacao) obj;
		if (dependente == null) {
			if (other.dependente != null)
				return false;
		} else if (!dependente.equals(other.dependente))
			return false;
		if (dtDevolucao == null) {
			if (other.dtDevolucao != null)
				return false;
		} else if (!dtDevolucao.equals(other.dtDevolucao))
			return false;
		if (dtLocacao == null) {
			if (other.dtLocacao != null)
				return false;
		} else if (!dtLocacao.equals(other.dtLocacao))
			return false;
		if (empregado == null) {
			if (other.empregado != null)
				return false;
		} else if (!empregado.equals(other.empregado))
			return false;
		if (formaPgto != other.formaPgto)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (valorLocacao == null) {
			if (other.valorLocacao != null)
				return false;
		} else if (!valorLocacao.equals(other.valorLocacao))
			return false;
		if (valorTotal == null) {
			if (other.valorTotal != null)
				return false;
		} else if (!valorTotal.equals(other.valorTotal))
			return false;
		return true;
	}
	
	
}
