package listasLineares;

public class Pilha {
	
	private Nodo topo;
	private int tamanho = 0; //Já definido no construtor, caso passe estouro de pilha
	private int limite = 0;
	
	public Pilha(int limite) {
		this.limite = limite;
	}
	
	public boolean estaVazio() { //
		return tamanho == 0; //Se tamanho = 0, true
	}
	
	public boolean temEspaco() {
		return limite > tamanho; //Se limite menor que tamanho --- Se for igual: acaba ali(tá cheio)
	}
	
	public void push(int dado) {
		if(temEspaco()) {
			Nodo novoItem = new Nodo(dado);
			novoItem.setProx(topo);
			topo = novoItem;
			tamanho++;
		}else {
			System.out.println("Pilha cheia");
		}
	}
	
	//POP - Deletar no início
	
	public void pop() {
		if(!estaVazio()) { //Quero que seja falso
			System.out.println(topo.getDado() + " foi retirado da pilha");
			topo = topo.getProx();
			tamanho--;
		}
		else {
			System.out.println("Pilha está vazia");
		}
	}
	
	public int getTopo() {
		return topo.getDado();
	}
	
	
	
}
