package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOGenerico;
import entidades.Jogos;

@ManagedBean
@ViewScoped
public class JogosMB {
	
	private Jogos jogo = new Jogos();
	private List<Jogos> listaJogos = new ArrayList<>();
	private DAOGenerico<Jogos> dao = new DAOGenerico<>(Jogos.class);
	
	public JogosMB() {
		listaJogos = dao.buscarTodos();
	}
	
	public void inserir() {
		if(jogo.getId() == null) {
			dao.salvar(jogo);
		}
		else {
			dao.alterar(jogo);
		}
		jogo = new Jogos();
		listaJogos = dao.buscarTodos();
	}
	
	public void excluir (Long id) {
		dao.excluir(id);
		listaJogos = dao.buscarTodos();
	}

	public Jogos getJogo() {
		return jogo;
	}

	public void setJogo(Jogos jogo) {
		this.jogo = jogo;
	}

	public List<Jogos> getListaJogos() {
		return listaJogos;
	}

	public void setListaJogos(List<Jogos> listaJogos) {
		this.listaJogos = listaJogos;
	}
	
}
