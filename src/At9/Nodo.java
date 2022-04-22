package At9;

public class Nodo {
	
	int dado;
	Nodo prox; 
	private String nome;
	private double salario;
	
	public Nodo (String nome, double salario) {
		this.prox = null;
		setNome(nome);
		setSalario(salario);
	}
	
	public int getDado() {
		return dado;
	}
	
	public Nodo getProx() {
		return prox;
	}
	
	public void setProx (Nodo prox) {
		this.prox = prox; 
	}
			
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}