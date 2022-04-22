 package atividades;

public class NodoCircular {

	private int dado;
	private NodoCircular prox;
	private int code;
	private double preco;
	private int quant;
	private double desconto;
	
	/*public NodoCircular(int code, double preco, int quant, double desconto) {
		this.prox = null;
		setCode(code);
		setPreco(preco);
		setQuant(quant);
		setDesconto(desconto);
	}
	*/
	
	public NodoCircular(int dado) {
		this.prox = null;
		setCode(dado);
	;
	}


	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	private double desconto() {
		return desconto;
	}

	public int getDado() {
		return dado;
	}
	
	public NodoCircular getProx() {
		return prox;
	}
	
	public void setProx(NodoCircular prox) { //Fazer link dos próximos Nodos 
		this.prox = prox;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
	
}
