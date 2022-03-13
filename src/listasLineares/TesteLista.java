package listasLineares;

import java.util.Scanner;

public class TesteLista {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ListaEncadeada L1 = new ListaEncadeada(5);

		L1.inserirInicio(8);
		L1.inserirInicio(1);
		L1.inserirInicio(10);
		L1.inserirInicio(2);
		
		//Ele mostra primeiro o último que eu inseri para trás
		System.out.println(L1.mostraLista());
		
		//L1.deleteComValor(8);
		//System.out.println(L1.mostraLista());
		
		System.out.println(L1.contNodos() + " nodos");
		L1.inserirFinal(7);
		System.out.println(L1.mostraLista());
		
		L1.inserirFinal(11);
		System.out.println(L1.mostraLista());
	}

}
