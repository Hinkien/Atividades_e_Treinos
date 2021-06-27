package exercicioPolimorfismo;

public class Atendente extends Funcionario{
	
	public double calculaImposto() {
		return this.getValorImposto() * 0.01;
	}
	

}
