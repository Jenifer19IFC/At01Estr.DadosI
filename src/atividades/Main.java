package atividades;
import java.util.Scanner;

import atividades.ListaDuplamenteEncadeada;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ListaEncadeada le = new ListaEncadeada();
		
		System.out.println("Insira o primeiro n° da lista:");
		int x = input.nextInt();
		
		le.inserirInicio(10);
		le.inserirInicio(7);
		le.inserirInicio(17);
		le.inserirInicio(2);
		le.inserirInicio(7);
		le.inserirInicio(2);
		le.inserirInicio(15);
		le.inserirInicio(x);
		
		System.out.println(le.mostraLista());
		
		System.out.println("N° total de nodos = " + le.contNodos());
		
		System.out.println(le.valorParametro(x));
		
		/*ListaDuplamenteEncadeada ld = new ListaDuplamenteEncadeada();
		
		ld.inserirInicio(1);
		ld.inserirInicio(2);
		ld.inserirInicio(3);
		ld.inserirInicio(4);

		
		System.out.println(ld.mostraLista());
		
		System.out.println(ld.maiorMenor());
		System.out.println(ld.media());*/
		
		
		
	}

}
