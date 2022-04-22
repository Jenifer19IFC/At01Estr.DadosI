package atividades;

import java.util.Random;

public class ListaDuplamenteE {

	private NodoDE inicio = null;
	private NodoDE fim = null;
	
	public void inserirInicio(int dado) {
		NodoDE novoInicio = new NodoDE(dado);
		
		if(inicio != null) {
			inicio.setAnt(novoInicio);//Aponta para trás
			novoInicio.setProx(inicio);//Aponta para frente
		}
		inicio = novoInicio;
		if(fim == null) {
			fim = novoInicio;
		}
				
	}	

	public void inserirFinal(int dado) {
		NodoDE novoFim = new NodoDE(dado);
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
		NodoDE nodoRemovido = inicio;
		if (inicio == null) return;
		inicio = inicio.getProx();//Mandando inicio para frente
		if  (inicio != null) { //Mais elementoss
			inicio.setAnt(null); //Desafzendo ligação
		}
		if (nodoRemovido == fim) { //Apenas um elemento
			removeFinal();
		}
	}
	
	public void removeFinal() {
		NodoDE nodoRemovido = fim;
		if(fim == null)  return;
		fim = fim.getAnt(); //Mandado fim para trás -- removendo último elemento
		if(fim != null) { //Mais elementos
			fim.setProx(null);
		}
		//Quando tiver um elemento só
		if(nodoRemovido == inicio) {
			removeInicio();
		}		
	}
	
	public void removeComValor(int dado) {
		NodoDE nodoRemovido = null;
		NodoDE aux = inicio;//Aux percorre a lista
		
		while(aux != null) {//Enquanto não chega no final, percorre
			if(aux.getDado() == dado) {
				nodoRemovido = aux;
				break;
			}
		aux = aux.getProx();//Manda aux para a próxima posição
		}
		if(nodoRemovido == null) return;//Não está na lista o valor que eu quero remover
		
		if(nodoRemovido == inicio) removeInicio(); //Remover inicio se estiver no inicio
		else if(nodoRemovido == fim) removeFinal();//Remover final se estiver no final
		else {
			nodoRemovido.getAnt().setProx(nodoRemovido.getProx());
			//Modificar setProx
			//Tem o nodo removido,e aponta para o proximo dele
			
			nodoRemovido.getProx().setAnt(nodoRemovido.getAnt());
			//Tem o nodoRemovido e aponta para trás dele 
			
		//CADA ANTES DO PONTO É A POSIÇÃO ONDE EU ESTOU
		}
	}
	
	public  String mostraLista() {
		 String lista = "";
		 NodoDE aux =  inicio;
		 while (aux != null) {
			 lista += aux.getDado() +"\n";
			 aux = aux.getProx();
		 }
		 return lista;
	 }
	
	public String maiorMenor() {
		 NodoDE aux =  inicio;
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
		 NodoDE aux = inicio; 
		 
		 int cont = 0;
		 double s = 0;
		 
		 while(aux != null) {  
			 cont++; 
			 s += aux.getDado();                         
			 aux = aux.getProx();           
		}
		 return "Média = " + (s/cont); 
	 }
	
	 public NodoDE getFim() {
		 return fim;
	 }
	 public NodoDE getInicio() {
		 return inicio;
	 }
	 
	 public int contNodos() {
			String lista = "";
			NodoDE aux = inicio; 
			int c = 0;
			
			while(aux != null) {
				lista+= aux.getDado()+"\n";
				aux = aux.getProx(); 
				c++;
			}
			return c;
		}
	 
	 
	 public boolean listasIdenticas (ListaDuplamenteE le1, ListaDuplamenteE le2) {
		 NodoDE aux1 = le1.getInicio();
		 NodoDE aux2 = le2.getInicio();
		 ListaDuplamenteE l3 = new ListaDuplamenteE();
		 
		 int cont = 0;
		 int tam = le1.contNodos();
		 
		 while (aux1 != null) {
			 while (aux2 != null) {
				 if (aux1.getDado() == aux2.getDado()) {
					 l3.inserirInicio(aux1.getDado());
					 cont++;
					 aux1 = aux1.getProx();
					 aux2 = aux2.getProx();
				 }
				 else return false;
			}
		}
		if (cont == tam) 
			return true;
		else 
			return false;
	 }
		 
	
		public String random(ListaCircular L1) {
			Random ram = new Random();
			int vet[] = new int[100];
			
			//100 números aleatórios 
			for (int i = 0; i < 100; i++) {
				vet[i] = ram.nextInt(100);
			}
				
			//Inserir na lista circular
			for(int j = 0; j < 100; j++){
				L1.insereInicio(vet[j]);
			}
			
			//Ordenar (cresecente)
			int aux = 0;
					
			for(int x = 0; x < 100; x++){
				for(int w = 0; w < 100 - 1; w++){
					if(vet[w] < vet[w + 1]){
						aux = vet[w];
						vet[w] = vet[w+1];
						vet[w+1] = aux;
					}
				}
			}
			
		
			ListaDuplamenteE L2 = new ListaDuplamenteE();
			
			double s = 0;
			
			// media e a mediana
			for(int i = 0; i < 100; i++){
				L2.inserirInicio(vet[i]);
				s += vet[i];
			}
			
			double m = s/100;
			double mediana = (vet[50] + vet[51])/2;
			
			System.out.println("Média: " + m);
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
		            if (vet[p] == vet[k]) {
		                ++aparece;
		            }
		        }
		        
		        // armazena  e conta as modas + guarda a frequencia das modas
		        if (aparece > comp) {
		            moda = vet[p];
		            Modas[qtdmodas]= moda;
		            comp = aparece;
		           
		            ap[qtdmodas] = aparece;
		    
		        }else if(aparece == comp){
		            qtdmodas++;
		            Modas[qtdmodas]=vet[p];
		            
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
	 
	 
}
