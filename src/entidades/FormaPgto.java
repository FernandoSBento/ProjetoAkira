package entidades;

public enum FormaPgto {
	
	DINHEIRO(1),CARTÃO(2),BITCOIN(3);
	
	private final int valor;
	
	FormaPgto(int valorOpcao){
		valor = valorOpcao;
	}
	
	public int getValor() {
		return valor;
	}
	
}
