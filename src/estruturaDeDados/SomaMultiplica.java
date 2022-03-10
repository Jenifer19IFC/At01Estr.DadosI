package estruturaDeDados;

public class SomaMultiplica {
	
	private int a = 0, b = 0; //Acess�vel apenas dentro da classe
	
	//Construtor
	public SomaMultiplica(int n1, int n2) {
		this.a = n1;
		this.b = n2;
	}
	
	public int soma() {
		return a + b;
	}

	public int multiplica () {
		return a * b;
	}
	
	//Setando n�meros
	public void setNums (int n1, int n2) {
		this.a = n1;
		this.b = n2;
	}
	
	//Retornando vari�veis A e B
	public int getA() {
		return this.a;
	}
	public int getB() {
		return this.b;
	}
}
