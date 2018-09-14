package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOGenerico;
import entidades.Locacao;

@ManagedBean
@ViewScoped
public class LocacaoMB {
	
	private Locacao locacao = new Locacao();
	private List<Locacao> locacoes = new ArrayList<>();
	private DAOGenerico<Locacao> dao = new DAOGenerico<>(Locacao.class);
	
	public LocacaoMB() {
		locacoes = dao.buscarTodos();
	}
	
	public void inserir() {
		if(locacao.getId() == null) {
			dao.salvar(locacao);
		}
		else {
			dao.alterar(locacao);
		}
		locacao = new Locacao();
		locacoes = dao.buscarTodos();
	}
	
	public Locacao getLocacao() {
		return locacao;
	}
	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}
	public List<Locacao> getLocacoes() {
		return locacoes;
	}
	public void setLocacoes(List<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
	
	
	
}
