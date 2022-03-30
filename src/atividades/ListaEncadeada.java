package atividades;

public class ListaEncadeada {

	private Nodo inicio;
	private Nodo fim;
	ListaEncadeada l1 = new ListaEncadeada();
	ListaEncadeada l2 = new ListaEncadeada();
	
	public ListaEncadeada() {
		//inicio = new Nodo(dado); //THIS caso tenha outra variável dado dentro desta classe
		l1 = new ListaEncadeada();
		l2 = new ListaEncadeada();
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
			aux = aux.getProx(); //Aux verifica se tem null ou não
		}
		aux.setProx(novoNodo);// Quando o Prox for NULL ---> Adiciona elemento no final
		//Campo de modificação
	}
	
	public void deletarPrimeiroNodo() { 
		if(inicio == null) return;
		inicio = inicio.getProx(); //Inicio é o próximo -- AÇÃO DE TROCAR O INÍCIO --
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
				return "Valor " + valor + " encontrado na posição " + c + "";
			}
		c++;
		aux = aux.getProx(); 
		}
		return "Valor " + valor + " não encontrado"; 
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

	public String valorParametro(int x) {
		Nodo aux = inicio;
		int contParam = 0;
		int maiorParam = 0;
		int a = 0;
		
		while(aux != null) {
			a++;
			int posicao;
			
			if(aux.getDado() == x) {
				contParam++;
				posicao = a;
				System.out.println("Posição = " + posicao);
			}
			if(aux.getDado() > x) {
				maiorParam++;
			}
			aux = aux.getProx();
		}
		return "Há " + contParam + " nodo(s) com o valor passado no parâmetro, contando com ele mesmo"
		+ "\nN°s maiores que o parâmetro = "
	+ maiorParam ;
	}
	
	public int uniao() {
		
		
		
		return 0 ;
	}
}