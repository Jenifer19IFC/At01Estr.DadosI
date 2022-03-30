package atividades;

public class NodoEncadeada {

	private int dado;
	private NodoEncadeada prox;// tipo Nodo --- Quarda o link do pr�ximo Nodo
	
	public NodoEncadeada(int dado) {
		this.dado = dado;
		this.prox = null; //Inicializa com nulo -- na cria��o n�o tem liga��o
	}

	public int getDado() {
		return dado;
	}
	
	public NodoEncadeada getProx() {
		return prox;
	}
	
	public void setProx(NodoEncadeada prox) { //Fazer link dos pr�ximos Nodos 
		this.prox = prox;
	}
	
	
}
