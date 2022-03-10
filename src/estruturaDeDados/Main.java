package estruturaDeDados;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int aux;
		
		//1 �Verificar se um n�mero � um CPF v�lido.
		
		ValidarCpf cpf = new ValidarCpf();
		
		System.out.println("Digite o CPF:");
		cpf.n1 = input.nextInt();
		cpf.n2 = input.nextInt();
		cpf.n3 = input.nextInt();
		cpf.n4 = input.nextInt();
		cpf.n5 = input.nextInt();
		cpf.n6 = input.nextInt();
		cpf.n7 = input.nextInt();
		cpf.n8 = input.nextInt();
		cpf.n9 = input.nextInt();
		cpf.n10 = input.nextInt();
		cpf.n11 = input.nextInt();
		
		//System.out.println(cpf.digitoVerf1());
		//System.out.println(cpf.digitoVerf2());
		System.out.println(cpf.validarCpf());
		
		if(cpf.validarCpf()) {
			System.out.println("CPF " + cpf.n1 + cpf.n2 + cpf.n3 + "." + cpf.n4 + cpf.n5 + cpf.n6 + "." +
					cpf.n7+ cpf.n8 + cpf.n9 + "-" + cpf.n10 + cpf.n11 + " � v�lido!");
		}else {
			System.out.println("CPF " + cpf.n1 + cpf.n2 + cpf.n3 + "." + cpf.n4 + cpf.n5 + cpf.n6 + "." +
					cpf.n7+ cpf.n8 + cpf.n9 + "-" + cpf.n10 + cpf.n11 + " � inv�lido!");
		}
		
		//2- Verificar se um n�mero � primo:
		
		NumPrimo np = new NumPrimo();
		
		System.out.println("Digite um n�mero");
		aux = input.nextInt();
		
		System.out.println(np.validarNumPrimo(aux));
		
	}

}
