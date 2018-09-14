package entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Devolucao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double valorTotal;
	private boolean statusPagamento;
	private Date dtRealDevolucao;
	private boolean estaDanificado;
	@OneToOne
	private Locacao locacao;
	
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public boolean isStatusPagamento() {
		return statusPagamento;
	}
	public void setStatusPagamento(boolean statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	public Date getDtRealDevolucao() {
		return dtRealDevolucao;
	}
	public void setDtRealDevolucao(Date dtRealDevolucao) {
		this.dtRealDevolucao = dtRealDevolucao;
	}
	public boolean isEstaDanificado() {
		return estaDanificado;
	}
	public void setEstaDanificado(boolean estaDanificado) {
		this.estaDanificado = estaDanificado;
	}
	
	
}
