package exercicioPolimorfismo;

public class Gerente extends Funcionario {
	
	public double calculaImposto() {
		return this.getValorImposto() * 0.1;
	}

}
