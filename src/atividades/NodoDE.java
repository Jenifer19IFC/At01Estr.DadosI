package atividades;

public class NodoDE {

	private int dado;
	private NodoDE prox;
	private NodoDE ant;
	
	public NodoDE(int dado) {
		this.dado = dado;
		prox = null;
		ant = null;
	}

	public int getDado() {
		return dado;
	}

	public NodoDE getProx() {
		return prox;
	}

	public void setProx(NodoDE prox) {
		this.prox = prox;
	}

	public NodoDE getAnt() {
		return ant;
	}

	public void setAnt(NodoDE ant) {
		this.ant = ant;
	}
}
