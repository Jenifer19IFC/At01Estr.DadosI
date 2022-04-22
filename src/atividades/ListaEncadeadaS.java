package atividades;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ListaEncadeadaS {

	private NodoSimplesE inicio;
	
	
	public void ListaEncadeadaS(int dado) {
		inicio = new NodoSimplesE(dado); //THIS caso tenha outra variável dado dentro desta classe
	}
	
	public NodoSimplesE getInicio() {
		return inicio;
	}
	
	//Cada elemento que eu inserir é um novo Nodo
	
	public void inserirInicio(int dado) {
		NodoSimplesE novoNodo = new NodoSimplesE(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}
	
	
	
	public String mostraLista() {
		String lista = "";
		NodoSimplesE aux = inicio; //Auxiliar para percorrer a lista, se não eu perco o -inicio- AUX COMEÇA COM INCIO
		
		while(aux!=null) { //Quando encontrar nulo, ele para de percorrer
			lista+= aux.getDado()+" | "; //Pega valor de aux mesmo (6, por exemplo)
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
		NodoSimplesE aux = inicio; //´Posicionando no inicio
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
		NodoSimplesE aux = inicio; 
		int c = 0;
		
		while(aux != null) {
			lista+= aux.getDado()+"\n";
			aux = aux.getProx(); 
			c++;
		}
		return c;
	}
	
	public void inserirFinal(int dado) {
		NodoSimplesE novoNodo = new NodoSimplesE(dado);
		NodoSimplesE aux = inicio;
		
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
		NodoSimplesE aux = inicio;
		NodoSimplesE anterior = null;
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
		NodoSimplesE aux = inicio;
		
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
		NodoSimplesE aux = inicio; 
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
		NodoSimplesE aux = inicio;
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

	
	public boolean buscarDado(int valor) {
		NodoSimplesE aux = inicio;
		int posicao = 0;
		
		while(aux != null) {
			posicao++;
			if(aux.getDado() == valor) {
				return true;
			}
			aux = aux.getProx();
		}
		return false;
	}
	
	public String valorParametro(int x) {
		NodoSimplesE aux = inicio;
		int contParam = 0; //Contador de elementos iguais ao parâmetro
		int maiorParam = 0; //Contador de elementos maiores que o parâmetro
		int a = 0; 
		
		while(aux != null) {
			a++; // Contador de posições 
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
	
	
	public String intersecao (ListaEncadeadaS le1,ListaEncadeadaS le2 ) {
		NodoSimplesE aux1 = le1.getInicio();
		NodoSimplesE aux2 = le2.getInicio();
		ListaEncadeadaS l3 = new ListaEncadeadaS();
		
		
		while(aux1 != null) {
			while(aux2 != null) {
				if (aux1.getDado() == aux2.getDado()) {
					l3.inserirInicio(aux1.getDado());
				}
				aux2 = aux2.getProx();
			}
			aux2 = le2.getInicio();
			aux1 = aux1.getProx();	
		}
		return "Interseção:\n" + l3.mostraLista();
	}
	
	public String uniao (ListaEncadeadaS le1,ListaEncadeadaS le2 ) {
		NodoSimplesE aux1 = le1.getInicio();
		NodoSimplesE aux2 = le2.getInicio();
	
		while(aux1 != null) {
			while(aux2 != null) {
				if(le1.buscarDado(aux2.getDado()) == false) {
					le1.inserirInicio(aux2.getDado());
				}
				aux2 = aux2.getProx();
			}
			aux2 = le2.getInicio();
			aux1 = aux1.getProx();	
		}
		return "União:\n" + le1.mostraLista();
	}
	
	
	public String diferenca(ListaEncadeadaS le1,ListaEncadeadaS le2) {
		NodoSimplesE aux1 = le1.getInicio();
		NodoSimplesE aux2 = le2.getInicio();
		ListaEncadeadaS le3 = new ListaEncadeadaS();
		
		while(aux1 != null) {
				if(le2.buscarDado(aux1.getDado()) == false) {
					le3.inserirInicio(aux1.getDado());
				}
				aux1 = aux1.getProx();
		}
		return "Diferença:\n" + le3.mostraLista();
	}
	
	public void mostrarListaInvertida() {
		NodoSimplesE aux = inicio;
		int vet[] = new int[contNodos()];
		int i = 0;
		
		while(aux != null) { 
			vet[i] = aux.getDado();
			i++;
			aux = aux.getProx(); 
		}
		
		for(int j = vet.length-1; j >= 0; j--) {
			System.out.println(vet[j]);
		}
	}
	
	
	public String listasPI(ListaEncadeadaS F) {
		ListaEncadeadaS F_Pares = new ListaEncadeadaS();
		ListaEncadeadaS F_Impares = new ListaEncadeadaS();
		NodoSimplesE auxF = F.getInicio();
		NodoSimplesE auxP = F_Pares.getInicio();
		NodoSimplesE auxI = F_Impares.getInicio();
		
		while (auxF != null) {
			if (auxF.getDado() % 2 == 0) {
				F_Pares.inserirInicio(auxF.getDado());
				auxF = auxF.getProx();
			}else {
				F_Impares.inserirInicio(auxF.getDado());
				auxF = auxF.getProx();
			}
		}
		return "Pares: " + F_Pares.mostraLista() + "Ímpares: " + F_Impares.mostraLista();
	}
	
	public String mostrarListaOrdenada(ListaEncadeadaS le1,ListaEncadeadaS le2) {
		NodoSimplesE aux1 =  le1.getInicio();
		NodoSimplesE aux2 =  le2.getInicio();
		
        ListaEncadeadaS le3 = new ListaEncadeadaS();
        ListaEncadeadaS list = new ListaEncadeadaS();
        
        while (aux1 != null) {
			le3.inserirInicio(aux1.getDado());
			aux1 = aux1.getProx();		
		}
		
		while (aux2 != null) {
			le3.inserirInicio(aux2.getDado());
			aux2 = aux2.getProx();		
		}
		
		NodoSimplesE aux3 =  le3.getInicio();
		
		int vet[] = new int[le3.contNodos()];
		int i = 0;
			
		while (aux3 != null){
			vet[i] = aux3.getDado();
			i++;
			aux3 = aux3.getProx();
		}
		
		int aux = 0;
		int tam = le3.contNodos();
		
		for(i = 0; i < tam; i++){
			for(int j = 0; j < tam-1; j++){
				if(vet[j] < vet[j + 1]){
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		
		for(i = 0; i <tam; i++){
			list.inserirInicio(vet[i]);
		}
		
		return "Nova lista ordenada: \n" + list.mostraLista();
	}
	
	
}