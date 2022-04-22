package atividades;

public class NodoSimplesE {

	private int dado;
	private NodoSimplesE prox;// tipo Nodo --- Quarda o link do pr�ximo Nodo
	
	public NodoSimplesE(int dado) {
		this.dado = dado;
		this.prox = null; //Inicializa com nulo -- na cria��o n�o tem liga��o
	}

	public int getDado() {
		return dado;
	}
	
	public NodoSimplesE getProx() {
		return prox;
	}
	
	public void setProx(NodoSimplesE prox) { //Fazer link dos pr�ximos Nodos 
		this.prox = prox;
	}
	
	
}
