package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.DAOGenerico;
import entidades.Obra;

@ManagedBean
public class ObraMB {

	Obra obra = new Obra();
	private List<Obra> obras = new ArrayList<>();
	private DAOGenerico<Obra> dao = new DAOGenerico<>(Obra.class);

	public ObraMB() {
		obras = dao.buscarTodos();
	}

	public void inserir() {
		if (obra.getId() == null) {
			dao.salvar(obra);
		} else {

			dao.alterar(obra);
		}
		obra = new Obra();
		obras = dao.buscarTodos();
	}

	public void excluir(Long id) {
		dao.excluir(id);
		obras = dao.buscarTodos();

	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}

	public List<Obra> getObras() {
		return obras;
	}

	public void setObras(List<Obra> obras) {
		this.obras = obras;
	}

}
