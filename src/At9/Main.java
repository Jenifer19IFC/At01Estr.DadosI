package At9;

public class Main {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.inseririnicio("Paulo", 2300);
		lista.inseririnicio("Maria", 1300);
		lista.inseririnicio("João", 3380);
		lista.inseririnicio("Pedro", 2650);
		
		System.out.println(lista.addLista(lista));
		

	}

}