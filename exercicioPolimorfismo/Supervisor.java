package exercicioPolimorfismo;

public class Supervisor extends Funcionario {
	
	public double calculaImposto() {
		return this.getValorImposto() * 0.05;
	}

}
