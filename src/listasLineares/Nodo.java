package listasLineares;

public class Nodo {

	private int dado;
	private Nodo prox;// tipo Nodo --- Quarda o link do próximo Nodo
	
	public Nodo(int dado) {
		this.dado = dado;
		this.prox = null; //Inicializa com nulo -- na criação não tem ligação
	}

	public int getDado() {
		return dado;
	}
	
	public Nodo getProx() {
		return prox;
	}
	
	public void setProx(Nodo prox) { //Fazer link dos próximos Nodos 
		this.prox = prox;
	}
	
	
}
