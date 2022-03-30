package listasLineares;

public class TesteFila {

	public static void main(String[] args) {
		
		Fila fila = new Fila(3);
		
		fila.inserir(1);
		fila.inserir(2);
		fila.inserir(3);
		
		System.out.println("Início =  " + fila.getInicio());
	
		fila.remover();
		fila.inserir(5);
		
		System.out.println("Início =  " + fila.getInicio());
		fila.remover();

	}

}
