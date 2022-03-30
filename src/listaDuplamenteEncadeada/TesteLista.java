package listaDuplamenteEncadeada;

public class TesteLista {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		
		lista.inserirInicio(1);
		lista.inserirInicio(2);
		lista.inserirInicio(3);
		
		System.out.println(lista.mostraLista());
		lista.removeFinal();
		
		System.out.println(lista.mostraLista());
		lista.removeComValor(2);
		
		System.out.println(lista.mostraLista());
	}
	

}