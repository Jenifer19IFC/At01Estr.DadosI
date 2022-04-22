package at10;

import java.util.Random;

/*public class ListaCircular {
	
	private Nodo inicio;
	private Nodo fim;
	
	public void ListaCircular(int dado) {
		inicio = new Nodo(dado); 
		inicio.setProx(inicio); 	// Aponta para ele mesmo
		fim = inicio; 		// Aponta para inicio
	}
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado); // Cria um novo nodo
		if (inicio == null) {
			inicio = novoNodo;
			inicio.setProx(inicio); // Se for nulo este (início) recebe
			fim = inicio;
		} else {
			novoNodo.setProx(inicio);
			inicio = novoNodo;
			fim.setProx(inicio); // Fim aponta para o início
		}
	}
	
	public String mostraLista() {
		String lista = "";
		if(inicio == null) return lista;
		
		Nodo aux = inicio;
		
		do {							// Mostra e depois verifica
			lista+=aux.getDado()+"\n";
			aux = aux.getProx();
		}while(aux != inicio);    // Enquanto aux não estiver apontando para o início
		return lista;
	}
	
	public void deleteComValor(int dado) {
		if(inicio == null) return; 		// Lista vazia
		if(inicio.getDado() == dado) { 	// Se estiver no início 
			if(inicio == fim) {            // Se tiver um item na lista
				inicio = null; 		// Nulo se tiver um elemento apenas
				return;
			}
			inicio = inicio.getProx(); 	// Mais de um item na lista
			fim.setProx(inicio);
			return;
		}
		Nodo aux = inicio;
		do {								// No meio
			if(aux.getProx().getDado() == dado) {
				aux.setProx(aux.getProx().getProx()); // Pula o que achou e vai p/ o próximo
				return;
			}
			aux = aux.getProx();
		}while(aux != inicio);
	} 
	
	// armazena 100 números na lista simplesmente encadeada circular
	public String listaRand(ListaCircular L1) {
		Random gerador = new Random();
		int [] vetor = new int[100];
		
		for (int i = 0; i < 100; i++) {
			vetor[i] = gerador.nextInt(100);
			//System.out.println(i + " = " + vetor[i]);
		}
			
		// insere os itens do vetor na lista circular 
		for(int l = 0; l < 100; l++){
			L1.inserirInicio(vetor[l]);
		}
		
		// ordena os itens de L1 do maior para o menor
		int aux = 0;
				
		for(int m = 0; m < 100; m++){
			for(int n = 0; n < 100 - 1; n++){
				if(vetor[n] < vetor[n + 1]){
					aux = vetor[n];
					vetor[n] = vetor[n+1];
					vetor[n+1] = aux;
				}
			}
		}
		
		// insere os dados em uma lista duplamente encadeada (L2) e calcula a media
		ListaDuplamenteEncadeada L2 = new ListaDuplamenteEncadeada();
		
		double soma = 0;
		
		// media e a mediana
		for(int i = 0; i < 100; i++){
			L2.inserirInicio(vetor[i]);
			soma += vetor[i];
		}
		
		double media = soma/100;
		double mediana = (vetor[50] + vetor[51])/2;
		
		System.out.println("Média: " + media);
		System.out.println("Mediana: " + mediana);
		
		// moda
		int aparece = 1, i = 0;
	    int moda = 0;
	    int comp = 0;
	    int qtdmodas = 0;
	    Integer Modas[]= new Integer [100];
	    Integer ap[]= new Integer [100];
	    
	    
	    // incialmente cada numero recebe uma repeticao, depois se repetir recebe mais uma
	    for (int p = 0; p < 100; p++) {
	        aparece = 1;
	        for (int k = p + 1; k < 100; k++) {
	            if (vetor[p] == vetor[k]) {
	                ++aparece;
	            }
	        }
	        
	        // armazena  e conta as modas + guarda a frequencia das modas
	        if (aparece > comp) {
	            moda = vetor[p];
	            Modas[qtdmodas]= moda;
	            comp = aparece;
	           
	            ap[qtdmodas] = aparece;
	    
	        }else if(aparece == comp){
	            qtdmodas++;
	            Modas[qtdmodas]=vetor[p];
	            
	            ap[qtdmodas] = aparece;
	        }
	        
	        ap[p] = aparece; 
	    }
	    
	    // mostra moda
	    System.out.println("Moda (as): ");
	    
	    if(qtdmodas > 0){ 
	        for (int j = 0; j <= qtdmodas; j++) {
	            if(j == qtdmodas) {
	                System.out.println(Modas[j]+ " aparece " + ap[j]+".");
	            }else{
	            	if (ap[j] == ap[qtdmodas]) {                      // mostra somente as modas de mesma frequencia
	            		System.out.print(Modas[j] + " aparece " + ap[j]+" , ");
	            	}
	            }
	        }
	    }
	  
		return "Lista: \n" + L2.mostraLista();
	}
}*/