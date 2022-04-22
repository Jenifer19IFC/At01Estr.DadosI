package at10;

public class ListaDuplamenteEncadeada {
	private NodoDup inicio = null;
	private NodoDup fim = null;
	
	public void inserirInicio (int dado) {
		NodoDup novoInicio = new NodoDup (dado);
		if (inicio != null) {
			inicio.setAnt(novoInicio);  // Aponta para trás
			novoInicio.setProx(inicio); // O novo início aponta p/ frente
		}
		inicio = novoInicio;    // O que era novo início se torna início
		if (fim == null) {
			fim = novoInicio;
		}
	}
	
	public void inserirFinal(int dado) {
		NodoDup novoFim = new NodoDup(dado);
		if (fim != null) {
			fim.setProx(novoFim);
			novoFim.setAnt(fim);
		}
		fim = novoFim;
		if (inicio == null) {
			inicio = novoFim;
		}
	}
	
	public void removeInicio () {
		NodoDup nodoRemovido = inicio;
		if (inicio == null) return;
		inicio = inicio.getProx();   // Vai p/ frente
		if  (inicio != null) {     // Se houver só um elemento
			inicio.setAnt(null);
		}
		if (nodoRemovido == fim) {  // Mais de um elemento
			removeFinal();
		}
	}
	 public void removeFinal() {
		 NodoDup nodoRemovido = fim;
		 if (fim == null) return;
		 fim = fim.getAnt();
		 if (fim != null) {
			 fim.setProx(null);
		 }
		 if (nodoRemovido == inicio) {  // Se houver apenar um elemento
			 removeInicio();
		 }
	 }
	 
	 public void removeComValor (int dado) {
		 NodoDup nodoRemovido = null;
		 NodoDup aux = inicio; // Aux percorre a lista : início NÃO PODE
		 while (aux != null) {   // Não chegar no fim:
			 if (aux.getDado() == dado) {  
				 nodoRemovido = aux;
				 break;         // Encontro, encerra a busca
			 }
			 aux = aux.getProx(); // Aux p/ próxima
		 }
		 if (nodoRemovido == null) return;   // Não achou o valor procurado
		 
		 if (nodoRemovido == inicio) removeInicio(); // Encontrou no início
		 else if (nodoRemovido == fim) removeFinal(); // Encontrou no fim
		 else {                                   // Se não estiver no início e nem no fim:
			 nodoRemovido.getAnt().setProx(nodoRemovido.getProx()); // Lê um a um. Receber nodoRemovido.getProx
			 nodoRemovido.getProx().setAnt(nodoRemovido.getAnt());  
		 }
	 }
	 
	 public  String mostraLista() {
		 String lista = "";
		 NodoDup aux =  inicio;
		 while (aux != null) {
			 lista += aux.getDado() +"\n";
			 aux = aux.getProx();
		 }
		 return lista;
	 }
}