package entidades;

public enum StatusObra {
	
	LOCADA(1),RESERVADA(2),DISPONIVEL(3),INDISPONIVEL(4);
	
	private final int valor;
	
	StatusObra(int valorOpcao){
		valor = valorOpcao;
	}
	
	public int getValor() {
		return valor;
	}
}
