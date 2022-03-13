package listasLineares;

public class ListaEncadeada {

	private Nodo inicio;
	private Nodo fim;
	
	public ListaEncadeada(int dado) {
		inicio = new Nodo(dado); //THIS caso tenha outra variável dado dentro desta classe
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	//Cada elemento que eu inserir é um novo Nodo
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}
	
	public String mostraLista() {
		String lista = "";
		Nodo aux = inicio; //Auxiliar para percorrer a lista, se não eu perco o -inicio- AUX COMEÇA COM INCIO
		
		while(aux!=null) { //Quando encontrar nulo, ele para de percorrer
			lista+= aux.getDado()+"\n"; //Pega valor de aux mesmo (6, por exemplo)
			aux = aux.getProx(); //Aux recebe ele mesmo e o código do próximo elemento
		}
		return lista;
	}
	
	public void deleteComValor(int valor) {
		if(inicio == null) //Nada para deletar, então já retorna
			return; 
		if(inicio.getDado() == valor) { //Tiro incio do prox e mando atual -- AÇÃO DE DELETAR --
			inicio = inicio.getProx(); //Inicio é o próximo -- AÇÃO DE TROCAR O INÍCIO --
			return;
		}
		Nodo aux = inicio; //´Posicionando no inicio
		while(aux.getProx() != null) {
			if(aux.getProx().getDado() == valor) {
				aux.setProx(aux.getProx().getProx()); //Desfazendo a ligação com om que tá no meio e setando o prox
				return;
			}
			aux = aux.getProx(); //Pegando o próximo
			
		}//while
		
	}//Método deleteComValor
	
	public int contNodos() {
		String lista = "";
		Nodo aux = inicio; 
		int c = 0;
		
		while(aux!=null) {
			lista+= aux.getDado()+"\n";
			aux = aux.getProx(); 
			c++;
		}
		return c;
	}
	
	public void inserirFinal(int dado) {
		Nodo novoNodo = new Nodo(dado);
		Nodo aux = inicio;
		
		while(aux.getProx() != null){
			aux = aux.getProx(); //Aux verifica se tem null ou não
		}
		aux.setProx(novoNodo);

	}
	
}
