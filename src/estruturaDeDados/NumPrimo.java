package estruturaDeDados;

public class NumPrimo {
	
	//2- Verificar se um número é primo:
	
	boolean simPrimo = false;
	
	public boolean validarNumPrimo (int n) {
		
		int contPrimos = 0;
		
		for(int i = 1; i <= n; i++) {
			if((n > 1) && (n % i == 0)) {
				contPrimos ++;
			}
			if(contPrimos == 2) {
				simPrimo = true;
			}
			else {
				simPrimo = false;
			}
		}
		return simPrimo;
		
	}

}
