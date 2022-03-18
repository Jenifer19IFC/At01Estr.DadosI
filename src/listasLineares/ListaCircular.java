package listasLineares;

public class ListaCircular {
	
	private Nodo inicio;
	private Nodo fim;
	
	public ListaCircular(int dado) {
		inicio = new Nodo(dado); 
		inicio.setProx(inicio); //Aponta para ele mesmo
		fim = inicio; //Aponta para inicio
	}

	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		
		if(inicio == null) {
			inicio = novoNodo;
			inicio.setProx(inicio);
			fim = inicio;
		}else {
			novoNodo.setProx(inicio);
			inicio = novoNodo;
			fim.setProx(inicio);
		}
	}
	
	public String mostraLista() {
		String lista = "";
		if(inicio == null) return lista;
		
		Nodo aux = inicio;
		
		//Primeiro faz e depois verifica
		do {
			lista+=aux.getDado()+"\n";
			aux = aux.getProx();
		}while(aux != inicio); //Enquanto aux não estiver apontando para o incio --- Verifica a partir do segundo 1 -aux == inicio / 2 - aux !=inicio
		return lista;
	}
	
	public void deleteComValor(int dado) {
		if(inicio == null) return; //Lista vazia
		if(inicio.getDado() == dado) { //Se tiver no inicio 
			if(inicio == fim) {
				inicio = null; //Nulo se tiver um elemento apenas
				return;
			}
			inicio = inicio.getProx(); //Quero o primeiro elemento
			fim.setProx(inicio);
			return;
		}
		//Elemento do meio
		Nodo aux = inicio;
		
		do {
			if(aux.getProx().getDado() == dado) { //Encontrando dado
				aux.setProx(aux.getProx().getProx()); //Ligação -- todos para frente
				return;
			}
			aux = aux.getProx(); //Manda aux para frente
		}while(aux != inicio);
	}
	
	
}
