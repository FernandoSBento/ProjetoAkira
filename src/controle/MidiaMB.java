package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOGenerico;
import entidades.Midia;

@ManagedBean
@ViewScoped
public class MidiaMB {
	
	private Midia midia = new Midia();
	private List<Midia> listaMidias = new ArrayList<>();
	private DAOGenerico<Midia> dao = new DAOGenerico<>(Midia.class);
	
	public MidiaMB() {
		listaMidias = dao.buscarTodos();
	}
	
	public void inserir() {
		if(midia.getId() == null) {
			dao.salvar(midia);
		}
		else {
			dao.alterar(midia);
		}
		midia = new Midia();
		listaMidias = dao.buscarTodos();
	}
	
	public void excluir (Long id) {
		dao.excluir(id);
		listaMidias = dao.buscarTodos();
	}

	public Midia getMidia() {
		return midia;
	}

	public void setMidia(Midia midia) {
		this.midia = midia;
	}

	public List<Midia> getListaMidias() {
		return listaMidias;
	}

	public void setListaMidias(List<Midia> listaMidias) {
		this.listaMidias = listaMidias;
	}
	
}
