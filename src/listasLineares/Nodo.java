package listasLineares;

public class Nodo {

	private int dado;
	private Nodo prox;// tipo Nodo --- Quarda o link do pr�ximo Nodo
	
	public Nodo(int dado) {
		this.dado = dado;
		this.prox = null; //Inicializa com nulo -- na cria��o n�o tem liga��o
	}

	public int getDado() {
		return dado;
	}
	
	public Nodo getProx() {
		return prox;
	}
	
	public void setProx(Nodo prox) { //Fazer link dos pr�ximos Nodos 
		this.prox = prox;
	}
	
	
}
