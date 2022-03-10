package estruturaDeDados;

public class ValidarCpf {

	public int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11;
	public int soma = 0;
	
	public boolean digitoVerf1() {
		soma = 10 * n1 + 9 * n2 + 8 * n3 + 7 * n4 + 6 * n5 + 5 * n6 + 4 * n7 + 3 * n8 + 2 * n9;
		int digito1 = (soma * 10) % 11;
		
		if(digito1 == 10) {
			n10 = 0;
		}
		
		if(digito1 == n10) {
			return true;
		}
		return false;
	}
	
	public boolean digitoVerf2() {
		soma = 11 * n1 + 10 * n2 + 9 * n3 + 8 * n4 + 7 * n5 + 6 * n6 + 5 * n7 + 4 * n8 + 3 * n9 + 2 * n10; 
		int digito2 = (soma * 10) % 11;
		int dig2 = n11;
		
		if(digito2 == dig2) {
			return true;
		}
		return false;
	}

	public boolean validarCpf() {
		if(digitoVerf1() && digitoVerf2()) {
			return true;
		}
		if(n1 == n2 && n2== n3 && n3 == n4 && n4 == n5 && n5 == n6 && n6 == n7 && n7 == n8 
				&& n8 == n9 && n9 == n10  && n10 == n11) {
			return true;
		}
		return false;
	}
	
	//soma += (Integer.parseInt((userCpf.charAt(i) + " ")) * j);
	
}
