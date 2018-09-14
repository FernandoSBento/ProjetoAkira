package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOGenerico;
import entidades.Genero;

@ManagedBean
@ViewScoped
public class GeneroMB {
	
	private Genero genero = new Genero();
	private List<Genero> listaGeneros = new ArrayList<>();
	private DAOGenerico<Genero> dao = new DAOGenerico<>(Genero.class);
	
	public GeneroMB() {
		listaGeneros = dao.buscarTodos();
	}
	
	public void inserir() {
		if(genero.getId() == null) {
			dao.salvar(genero);
		}
		else {
			dao.alterar(genero);
		}
		genero = new Genero();
		listaGeneros = dao.buscarTodos();
	}
	
	public void excluir(Long id) {
		dao.excluir(id);
		listaGeneros = dao.buscarTodos();
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public List<Genero> getListaGeneros() {
		return listaGeneros;
	}

	public void setListaGeneros(List<Genero> listaGeneros) {
		this.listaGeneros = listaGeneros;
	}
	
}
