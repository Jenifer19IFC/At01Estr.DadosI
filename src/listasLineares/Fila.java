package listasLineares;

public class Fila {
	
	private Nodo inicio = null;//Remove no início
	private Nodo fim = null;//Add elementos no final
	private int limite = 0;
	private int tamanho = 0;
	
	public Fila (int limite) {//Construtor
		this.limite = limite;
	}

	public int getTamanho() {
		return tamanho;
	}
	
	public boolean temEspaco() {
		return limite > tamanho;
	}
	
	public boolean estaVazio() {
		return tamanho == 0;
	}
	
	public void inserir (int dado) {
		if(temEspaco()){
			Nodo novoItem = new Nodo(dado);
			System.out.println(novoItem.getDado() + " inserido na fila");
		if (estaVazio()) {
			inicio = novoItem; //1 elemento 
			fim = novoItem;
		}else {
			fim.setProx(novoItem); //Apontandoo para o próximo elemento
			fim = novoItem;
		}
		tamanho++;
		}else 
			System.out.println("Fila cheia");
	}
	
	public void remover() {
		if(tamanho > 0) {//Se tem elementos 
			System.out.println(inicio.getDado() + " removido da fila");
			if(getTamanho() == 1) {//1 elemento
				inicio = null; //Apaga tudo 
				fim = null;
				//Se tiver mais de um elemento
			}else inicio = inicio.getProx();//Manda início para frente
			tamanho--;
		}else System.out.println("Fila vazia");
	}
	
	public int getInicio() {
		if(!estaVazio()) return inicio.getDado(); //Se tem elemntos
		else {
			System.out.println("Fila está vazia");
			return 1;
		}
	}
	
}

	

