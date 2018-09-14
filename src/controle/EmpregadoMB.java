package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOGenerico;
import entidades.Empregado;

@ManagedBean
@ViewScoped
public class EmpregadoMB {
	
	private Empregado empregado = new Empregado();
	private List<Empregado> empregados = new ArrayList<>();
	private DAOGenerico<Empregado> dao = new DAOGenerico<>(Empregado.class);
	
	public EmpregadoMB() {
		empregados = dao.buscarTodos();
	}
	
	public void inserir() {
		if(empregado.getId() == null) {
			dao.salvar(empregado);
		}
		else {
			dao.alterar(empregado);
		}
		empregado = new Empregado();
		empregados = dao.buscarTodos();
	}
	
	public void excluir(Long id) {
		dao.excluir(id);
		empregados = dao.buscarTodos();
	}

	public Empregado getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}

	public List<Empregado> getEmpregados() {
		return empregados;
	}

	public void setEmpregados(List<Empregado> empregados) {
		this.empregados = empregados;
	}
	
}
