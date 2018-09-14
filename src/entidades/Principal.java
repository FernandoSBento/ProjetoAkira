package entidades;

import dao.DAOGenerico;

public class Principal {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("afgfwvb");
		
		DAOGenerico<Cliente> dao = new DAOGenerico<>(Cliente.class);
		dao.salvar(cliente);
	}
	
}
