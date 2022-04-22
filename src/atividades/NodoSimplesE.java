package atividades;

public class NodoSimplesE {

	private int dado;
	private NodoSimplesE prox;// tipo Nodo --- Quarda o link do próximo Nodo
	
	public NodoSimplesE(int dado) {
		this.dado = dado;
		this.prox = null; //Inicializa com nulo -- na criação não tem ligação
	}

	public int getDado() {
		return dado;
	}
	
	public NodoSimplesE getProx() {
		return prox;
	}
	
	public void setProx(NodoSimplesE prox) { //Fazer link dos próximos Nodos 
		this.prox = prox;
	}
	
	
}
