package at10;

public class NodoC {
	int dado;
	NodoC prox;  // prox: guarda o endere�o do pr�ximo dado
	
	public NodoC (int dado) {
		this.dado = dado;
		this.prox = null;
	}
	
	public int getDado() {
		return dado;
	}
	
	public NodoC getProx() {
		return prox;
	}
	
	public void setProx (NodoC prox) {
		this.prox = prox; 
	}
}