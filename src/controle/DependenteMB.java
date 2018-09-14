package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOGenerico;
import entidades.Dependente;

@ManagedBean
@ViewScoped
public class DependenteMB {
	
	private Dependente dependente = new Dependente();
	private List<Dependente> listaDependentes = new ArrayList<>();
	private DAOGenerico<Dependente> dao = new DAOGenerico<>(Dependente.class);
	
	public DependenteMB() {
		listaDependentes = dao.buscarTodos();
	}
	
	public void inserir() {
		if(dependente.getId() == null) {
			dao.salvar(dependente);
		}
		else {
			dao.alterar(dependente);
		}
		dependente = new Dependente();
		listaDependentes = dao.buscarTodos();
	}
	
	public void excluir(Long id) {
		dao.excluir(id);
		listaDependentes = dao.buscarTodos();
	}

	public Dependente getDependente() {
		return dependente;
	}

	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}

	public List<Dependente> getListaDependentes() {
		return listaDependentes;
	}

	public void setListaDependentes(List<Dependente> listaDependentes) {
		this.listaDependentes = listaDependentes;
	}
	
	
}
