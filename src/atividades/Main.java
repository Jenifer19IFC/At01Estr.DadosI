package atividades;
import java.util.Scanner;

import atividades.ListaDuplamenteE;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ListaEncadeadaS le = new ListaEncadeadaS();
		
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
		
		ListaDuplamenteE ld = new ListaDuplamenteE();
		
		ld.inserirInicio(1);
		ld.inserirInicio(2);
		ld.inserirInicio(3);
		ld.inserirInicio(4);

		
		System.out.println(ld.mostraLista());
		
		System.out.println(ld.maiorMenor());
		System.out.println(ld.media());
	
		
		ListaEncadeadaS le1 = new ListaEncadeadaS();
		le1.inserirInicio(4);
		le1.inserirInicio(4);
		le1.inserirInicio(8);
		le1.inserirInicio(1);
		le1.inserirInicio(10);
		
		
		ListaEncadeadaS le2 = new ListaEncadeadaS();
		
		le2.inserirInicio(1);
		le2.inserirInicio(9);
		le2.inserirInicio(7);
		le2.inserirInicio(1);
		le2.inserirInicio(4);
		
		System.out.println(le1.mostraLista());
		System.out.println(le2.mostraLista());
		System.out.println(le.intersecao(le1, le2));
		System.out.println(le.uniao(le1, le2));
		System.out.println(le.diferenca(le1, le2));
		
		//DIFERENÇA = {1, 5, 6, 4}
		
		ListaEncadeadaS le3 = new ListaEncadeadaS();
	
		le.inserirInicio(2);
		le.inserirInicio(6);
		le.inserirInicio(7);
		le.inserirInicio(1);
	
		le3.mostrarListaInvertida();
		
		/*ListaDuplamenteE le1 = new ListaDuplamenteE();
		le1.inserirInicio(4);
		le1.inserirInicio(4);
		le1.inserirInicio(4);
		
		ListaDuplamenteE le2 = new ListaDuplamenteE();
		le2.inserirInicio(4);
		le2.inserirInicio(1);
		le2.inserirInicio(4);
		
		ListaDuplamenteE le3 = new ListaDuplamenteE();
		System.out.print(le3.listasIdenticas(le1,le2));

		
		ListaEncadeadaS F = new ListaEncadeadaS();
		F.inserirInicio(1);
		F.inserirInicio(4);
		F.inserirInicio(0);
		F.inserirInicio(6);
		
		System.out.println(F.mostraLista());
		System.out.println(F.listasPI(F));
	
		ListaEncadeadaS le1 = new ListaEncadeadaS();
		le1.inserirInicio(5);
		le1.inserirInicio(10);
		le1.inserirInicio(11);
		
		ListaEncadeadaS le2 = new ListaEncadeadaS();
		le2.inserirInicio(2);
		le2.inserirInicio(4);
		le2.inserirInicio(6);
		
		ListaEncadeadaS le3 = new ListaEncadeadaS();
		System.out.println(le3.mostrarListaOrdenada(le1, le2));*/
		
		
	}

}
