package estruturaDeDados;
import java.util.Scanner;

public class UsandoTad {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe primeiro número");
		int n1 = input.nextInt();
		
		System.out.println("Informe segundo número");
		int n2 = input.nextInt();
		
		SomaMultiplica exer1 = new SomaMultiplica(n1, n2);
		
		System.out.println("Soma = " + exer1.soma());
		
		exer1.setNums(10, 5); //Setando novos valores
		
		System.out.println("Soma = " + exer1.soma());
	}

}
