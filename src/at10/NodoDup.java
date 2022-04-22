package at10;

public class NodoDup {
	private int dado;
	private NodoDup prox;
	private NodoDup ant;
	
	public NodoDup (int dado) {
		this.dado = dado;
		prox = null;
		ant = null;
	}

	public NodoDup getProx() {
		return prox;
	}

	public void setProx(NodoDup prox) {
		this.prox = prox;
	}

	public NodoDup getAnt() {
		return ant;
	}

	public void setAnt(NodoDup ant) {
		this.ant = ant;
	}

	public int getDado() {
		return dado;
	}

}