package At9;

public class ListaEncadeada {
	
	private Nodo inicio;
	
	public void ListaEncadeada (String nome, double salario) {
		inicio = new Nodo (nome, salario);
	}
	
	public Nodo getinicio() {
		return inicio;
	}
	
	public void inseririnicio(String nome, double salario) {
		Nodo novoNodo = new Nodo (nome, salario);
        novoNodo.setProx (inicio);
        inicio = novoNodo;
	}
	
	public String mostraLista() {
		String lista = "";
		
		if(inicio == null) return lista;
		Nodo aux =  inicio;
		while (aux != null) {
			lista+= "Nome => " + aux.getNome() + " | ";
			lista+= "Salário = " + aux.getSalario() + "\n";	
			aux = aux.getProx();		
		}
		return lista;
	}

	public String addLista(ListaEncadeada le1) {
		Nodo aux = inicio;
		ListaEncadeada listOrd = new ListaEncadeada();
		double menor = aux.getSalario();
		
		while(aux != null) {
			if(aux.getSalario() > menor) {
				listOrd.inseririnicio(aux.getNome(),aux.getSalario());
			}
			else {
				listOrd.inseririnicio(aux.getNome(),aux.getSalario());
			}
		}
		aux = aux.getProx();
		
		return "Lista: " + listOrd.mostraLista() ;
	}
	
	
	//////////////////////////
	/*public String mostraOrdenada(ListaEncadeada lista) {
		ListaEncadeada listaOrdenada = new ListaEncadeada();
	
		int tamanho = lista.contNodos();
		double outro;
		
		Nodo aux =  inicio;
		while (aux != null) {
			if (aux.getSalario() > aux.getProx().getSalario()) {
				outro = aux.getSalario();
				lista.inserirFinal(aux.getNome(), aux.getSalario());
			}
			aux = aux.getProx();
			
		}
	
		while (aux != null) {
			listaOrdenada.inserirFinal(aux.getNome(), aux.getSalario());
		}
		return "Lista ordenada: \n" + listaOrdenada.mostraLista();
	
}*/
	////////////////////
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
	
	// 2 - 	Inserir um bloco no final da lista 
	
	public void inserirFinal(String nome, double salario) {
		Nodo novoNodo = new Nodo(nome, salario);
		Nodo aux = inicio;
		
		while(aux != null){
			aux = aux.getProx(); //Aux verifica se tem null ou não
		}
		aux.setProx(novoNodo);// Quando o Prox for NULL ---> Adiciona elemento no final
	}
}