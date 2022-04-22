package atividades;

import listasLineares.Nodo;

public class ListaCircular {
	
	private NodoCircular inicio;
	private NodoCircular fim;
	
	/*public ListaCircular(int code, double preco, int quant, double desconto) {
		inicio = new NodoCircular(code, preco, quant, desconto); 
		inicio.setProx(inicio); //Aponta para ele mesmo
		fim = inicio; //Aponta para inicio
	}

	public void inserirInicio(int code, double preco, int quant, double desconto) {
		NodoCircular novoNodo = new NodoCircular(code, preco, quant, desconto);
		
		if(inicio == null) {
			inicio = novoNodo;
			inicio.setProx(inicio);
			fim = inicio;
		}else {
			novoNodo.setProx(inicio);
			inicio = novoNodo;
			fim.setProx(inicio);
		}
	}*/
	
	public String mostraLista() {
		String lista = "";
		if(inicio == null) return lista;
		
		NodoCircular aux = inicio;
		
		//Primeiro faz e depois verifica
		do {
			lista+= "Código = " + aux.getCode() + " | ";
			lista+= "Preço = " + aux.getPreco() + " | ";
			lista+= "Quantidade estocada = " + aux.getQuant() + " \n" ;
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
		NodoCircular aux = inicio;
		
		do {
			if(aux.getProx().getDado() == dado) { //Encontrando dado
				aux.setProx(aux.getProx().getProx()); //Ligação -- todos para frente
				return;
			}
			aux = aux.getProx(); //Manda aux para frente
		}while(aux != inicio);
	}

	
	public void aplicarTaxaDesconto(double taxa) {
		NodoCircular aux = inicio;
		double novoValor;
		
		do {
			double valor = aux.getPreco();
			novoValor = (double)(valor-(valor * (taxa/100)));
			aux.setDesconto(novoValor);
			System.out.println("Valor com desconto: R$ " + aux.getDesconto());
			aux = aux.getProx();
		
		}while(aux != inicio); 
	}
	
	public String mostrarRelatorio() {
		String lista = "";
		String listaEstoque100 = "";
		
		NodoCircular aux = inicio;
		
		System.out.println("\n RELATÓRIO: \n");

		do {
			lista+= " Código = " + aux.getCode() + " | ";
			lista+= " Preço = " + aux.getPreco() + " | ";
			lista+= " Preço com desconto = " + aux.getDesconto() + "\n";
		
			aux = aux.getProx();
		
		}while(aux != inicio); 
		
		do {
			if(aux.getQuant() > 100) {
				listaEstoque100+= " Código = " + aux.getCode() + " | ";
				listaEstoque100+= " Quantidade no estoque = " + aux.getQuant() + "\n";
			}
			aux = aux.getProx();
		
		}while(aux != inicio); 
		
		return lista + "\n QUANTIDADE DE ESTOQUE DOS PRODUTOS COM ESTOQUE"
				+ " MAIOR QUE 100\n\n" + listaEstoque100;
	}
	
	public void insereInicio(int dado) {
		NodoCircular novoNodo = new NodoCircular(dado);
		
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
	
}
