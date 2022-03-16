package listasLineares;

import java.util.Scanner;

public class TesteLista {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ListaEncadeada L1 = new ListaEncadeada(0);

		L1.inserirInicio(8);
		L1.inserirInicio(1);
		L1.inserirInicio(10);
		L1.inserirInicio(2);
		L1.inserirFinal(11);
		
		//Ele mostra primeiro o último que eu inseri para trás
		System.out.println(L1.mostraLista());
		
		//L1.deleteComValor(8);
		//System.out.println(L1.mostraLista());
		
		//System.out.println(L1.contNodos() + " nodos");
		//L1.inserirFinal(7);
		//System.out.println(L1.mostraLista());
		
		//L1.inserirFinal(11);
		//L1.inserirFinal(34);
		//System.out.println(L1.mostraLista());
		
//		System.out.println("Deletar primeiro:\n");
//		L1.deletarPrimeiroNodo();
//		System.out.println(L1.mostraLista());
//		
//		L1.deletarPrimeiroNodo();
//		System.out.println(L1.mostraLista());
//		
//		L1.deletarFinal();
//		System.out.println(L1.mostraLista());
		
//		System.out.println("Contar ");
//		System.out.println(L1.contPosicao(10));
		
		System.out.println(L1.contPosicao(11));
 	}
	
}