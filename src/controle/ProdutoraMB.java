package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOGenerico;
import entidades.Produtora;

@ManagedBean
@ViewScoped
public class ProdutoraMB {
	
	private Produtora produtora = new Produtora();
	private List<Produtora> listaProdutoras = new ArrayList<>();
	private DAOGenerico<Produtora> dao = new DAOGenerico<>(Produtora.class);
	
	public ProdutoraMB() {
		listaProdutoras = dao.buscarTodos();
	}
	
	public void inserir() {
		if(produtora.getId() == null) {
			dao.salvar(produtora);
		}
		else {
			dao.alterar(produtora);
		}
		produtora = new Produtora();
		listaProdutoras = dao.buscarTodos();
	}
	
	public void excluir(Long id) {
		dao.excluir(id);
		listaProdutoras = dao.buscarTodos();
	}
	
	public Produtora getProdutora() {
		return produtora;
	}
	public void setProdutora(Produtora produtora) {
		this.produtora = produtora;
	}
	public List<Produtora> getListaProdutoras() {
		return listaProdutoras;
	}
	public void setListaProdutoras(List<Produtora> listaProdutoras) {
		this.listaProdutoras = listaProdutoras;
	}
	
	
}
