package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOGenerico;
import entidades.Filmes;

@ManagedBean
@ViewScoped
public class FilmesMB {
	
	private Filmes filme = new Filmes();
	private List<Filmes> listaFilmes = new ArrayList<>();
	private DAOGenerico<Filmes> dao = new DAOGenerico<>(Filmes.class);
	
	public FilmesMB() {
		listaFilmes = dao.buscarTodos();
	}
	
	public void inserir() {
		if(filme.getId() == null) {
			dao.salvar(filme);
		}
		else {
			dao.alterar(filme);
		}
		filme = new Filmes();
		listaFilmes = dao.buscarTodos();
	}
	
	public void excluir (Long id) {
		dao.excluir(id);
		listaFilmes = dao.buscarTodos();
	}

	public Filmes getFilme() {
		return filme;
	}

	public void setFilme(Filmes filme) {
		this.filme = filme;
	}

	public List<Filmes> getListaFilmes() {
		return listaFilmes;
	}

	public void setListaFilmes(List<Filmes> listaFilmes) {
		this.listaFilmes = listaFilmes;
	}
	
}
