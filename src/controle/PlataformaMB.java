package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOGenerico;
import entidades.Plataforma;

@ManagedBean
@ViewScoped
public class PlataformaMB {
	private Plataforma plataforma = new Plataforma();
	private List<Plataforma> listaPlataforma = new ArrayList<>();
	private DAOGenerico<Plataforma> dao = new DAOGenerico<>(Plataforma.class);
	
	public PlataformaMB() {
		listaPlataforma = dao.buscarTodos();
	}
	
	public void inserir() {
		if(plataforma.getId() == null) {
			dao.salvar(plataforma);
		}
		else {
			dao.alterar(plataforma);
		}
		plataforma = new Plataforma();
		listaPlataforma = dao.buscarTodos();
	}
	
	public void excluir(Long id) {
		dao.excluir(id);
		listaPlataforma = dao.buscarTodos();
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	public List<Plataforma> getListaPlataforma() {
		return listaPlataforma;
	}

	public void setListaPlataforma(List<Plataforma> listaPlataforma) {
		this.listaPlataforma = listaPlataforma;
	}
	
	
}
