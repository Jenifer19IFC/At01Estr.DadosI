package listasLineares;

public class ListaEncadeada {

	private Nodo inicio;
	private Nodo fim;
	
	public ListaEncadeada(int dado) {
		inicio = new Nodo(dado); //THIS caso tenha outra vari�vel dado dentro desta classe
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	//Cada elemento que eu inserir � um novo Nodo
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}
	
	public String mostraLista() {
		String lista = "";
		Nodo aux = inicio; //Auxiliar para percorrer a lista, se n�o eu perco o -inicio- AUX COME�A COM INCIO
		
		while(aux!=null) { //Quando encontrar nulo, ele para de percorrer
			lista+= aux.getDado()+"\n"; //Pega valor de aux mesmo (6, por exemplo)
			aux = aux.getProx(); //Aux recebe ele mesmo e o c�digo do pr�ximo elemento
		}
		return lista;
	}
	
	public void deleteComValor(int valor) {
		if(inicio == null) //Nada para deletar, ent�o j� retorna
			return; 
		if(inicio.getDado() == valor) { //Tiro incio do prox e mando atual -- A��O DE DELETAR --
			inicio = inicio.getProx(); //Inicio � o pr�ximo -- A��O DE TROCAR O IN�CIO --
			return;
		}
		Nodo aux = inicio; //�Posicionando no inicio
		while(aux.getProx() != null) {
			if(aux.getProx().getDado() == valor) {
				aux.setProx(aux.getProx().getProx()); //Desfazendo a liga��o com om que t� no meio e setando o prox
				return;
			}
			aux = aux.getProx(); //Pegando o pr�ximo
			
		}//while
		
	}//M�todo deleteComValor
	
	public int contNodos() {
		String lista = "";
		Nodo aux = inicio; 
		int c = 0;
		
		while(aux != null) {
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
			aux = aux.getProx(); //Aux verifica se tem null ou n�o
		}
		aux.setProx(novoNodo);// Quando o Prox for NULL ---> Adiciona elemento no final
		//Campo de modifica��o
	}
	
	public void deletarPrimeiroNodo() { 
		if(inicio == null) return;
		inicio = inicio.getProx(); //Inicio � o pr�ximo -- A��O DE TROCAR O IN�CIO --
	}
	
	//PROFESSOR 
	public void deletarUltimo() {
		Nodo aux = inicio;
		Nodo anterior = null;
		if(inicio == null) return;
		if(inicio.getProx() == null) {
			inicio = null;
			return;
		}
		while(aux.getProx()!= null) {
			anterior = aux;
			aux = aux.getProx();
		}
		anterior.setProx(null);
	}
	
	
	public void deletarFinal() {
		Nodo aux = inicio;
		
		if(inicio == null) return;
		
		while(aux.getProx() != null) {
			if(aux.getProx().getProx() == null) {
				aux.setProx(null);
				return;
			}
		aux = aux.getProx();
		}
	} //deletarFinal
	
	public String contPosicao(int valor) {
		Nodo aux = inicio; 
		int c = 0;
		
		while(aux != null) {
			if(aux.getDado() == valor) { 
				return "Valor " + valor + " encontrado na posi��o " + c + "";
			}
		c++;
		aux = aux.getProx(); 
		}
		return "Valor " + valor + " n�o encontrado"; 
	}
	
	//PROFESSOR
	public int buscarValor(int valor) {
		Nodo aux = inicio;
		int posicao = 0;
		
		while(aux != null) {
			posicao++;
			if(aux.getDado() == valor) {
				return posicao;
			}
			aux = aux.getProx();
		}
		return -1;
	}
	
}