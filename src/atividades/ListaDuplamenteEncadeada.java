package atividades;

import listaDuplamenteEncadeada.Nodo;

public class ListaDuplamenteEncadeada {

	private Nodo inicio = null;
	private Nodo fim = null;
	
	public void inserirInicio(int dado) {
		Nodo novoInicio = new Nodo(dado);
		
		if(inicio != null) {
			inicio.setAnt(novoInicio);//Aponta para tr�s
			novoInicio.setProx(inicio);//Aponta para frente
		}
		inicio = novoInicio;
		if(fim == null) {
			fim = novoInicio;
		}
				
	}	

	public void inserirFinal(int dado) {
		Nodo novoFim = new Nodo(dado);
		if(fim != null) {//Se tem elemento
			fim.setProx(novoFim);
			novoFim.setAnt(fim);
		}
		fim = novoFim; //Recebe realmente
		
		//Se lista vazia
		if(inicio == null) {
			inicio = novoFim;
		}
	}
	
	public void removeInicio () {
		Nodo nodoRemovido = inicio;
		if (inicio == null) return;
		inicio = inicio.getProx();//Mandando inicio para frente
		if  (inicio != null) { //Mais elementoss
			inicio.setAnt(null); //Desafzendo liga��o
		}
		if (nodoRemovido == fim) { //Apenas um elemento
			removeFinal();
		}
	}
	
	public void removeFinal() {
		Nodo nodoRemovido = fim;
		if(fim == null)  return;
		fim = fim.getAnt(); //Mandado fim para tr�s -- removendo �ltimo elemento
		if(fim != null) { //Mais elementos
			fim.setProx(null);
		}
		//Quando tiver um elemento s�
		if(nodoRemovido == inicio) {
			removeInicio();
		}		
	}
	
	public void removeComValor(int dado) {
		Nodo nodoRemovido = null;
		Nodo aux = inicio;//Aux percorre a lista
		
		while(aux != null) {//Enquanto n�o chega no final, percorre
			if(aux.getDado() == dado) {
				nodoRemovido = aux;
				break;
			}
		aux = aux.getProx();//Manda aux para a pr�xima posi��o
		}
		if(nodoRemovido == null) return;//N�o est� na lista o valor que eu quero remover
		
		if(nodoRemovido == inicio) removeInicio(); //Remover inicio se estiver no inicio
		else if(nodoRemovido == fim) removeFinal();//Remover final se estiver no final
		else {
			nodoRemovido.getAnt().setProx(nodoRemovido.getProx());
			//Modificar setProx
			//Tem o nodo removido,e aponta para o proximo dele
			
			nodoRemovido.getProx().setAnt(nodoRemovido.getAnt());
			//Tem o nodoRemovido e aponta para tr�s dele 
			
		//CADA ANTES DO PONTO � A POSI��O ONDE EU ESTOU
		}
	}
	
	public  String mostraLista() {
		 String lista = "";
		 Nodo aux =  inicio;
		 while (aux != null) {
			 lista += aux.getDado() +"\n";
			 aux = aux.getProx();
		 }
		 return lista;
	 }
	
	public String maiorMenor() {
		 Nodo aux =  inicio;
		 int maior = aux.getDado();
		 int menor = aux.getDado();
		 
		 while (aux != null) {
			 if(aux.getDado() > maior) {
				 maior = aux.getDado();
			 }
			 if(aux.getDado() < menor) {
				 menor = aux.getDado();
			 }
			 aux = aux.getProx();
		 }
		 return "Maior = " + maior + "\nMenor = " + menor;
	}
	
	 public String media () {
		 Nodo aux = inicio; 
		 
		 int cont = 0;
		 double s = 0;
		 
		 while(aux != null) {  
			 cont++; 
			 s += aux.getDado();                         
			 aux = aux.getProx();           
		}
		 return "M�dia = " + (s/cont); 
	 }
	
}
