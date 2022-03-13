package listasLineares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Nodo nodo1 = new Nodo(5);
		Nodo nodo2 = new Nodo(6);
		Nodo nodo3 = new Nodo(8);
		
		//Ligação do nodo1 com o nodo2
		nodo1.setProx(nodo2);
		nodo2.setProx(nodo3);
		
		//Pegar valor do nodo2 a partir do nodo1
		int valorNodo2 = nodo1.getProx().getDado();
		System.out.println(valorNodo2);
		
		//Pegar valor do nodo3 a partir do nodo2
		int valorNodo3 = nodo2.getProx().getDado();
		System.out.println(valorNodo3);
		
		
		
		
		
	}
	

}
