package atividades;

public class NodoEncadeada {

	private int dado;
	private NodoEncadeada prox;// tipo Nodo --- Quarda o link do próximo Nodo
	
	public NodoEncadeada(int dado) {
		this.dado = dado;
		this.prox = null; //Inicializa com nulo -- na criação não tem ligação
	}

	public int getDado() {
		return dado;
	}
	
	public NodoEncadeada getProx() {
		return prox;
	}
	
	public void setProx(NodoEncadeada prox) { //Fazer link dos próximos Nodos 
		this.prox = prox;
	}
	
	
}
