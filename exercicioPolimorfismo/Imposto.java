package exercicioPolimorfismo;

public class Imposto {
	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente();
		gerente.setValorImposto(5000.0);
		System.out.println("O imposto pago pelo gerente ser� de: R$" + gerente.calculaImposto());
		
		Funcionario supervisor = new Supervisor();
		supervisor.setValorImposto(3000.0);
		System.out.println("O imposto pago pelo supervisor ser� de: R$" + supervisor.calculaImposto());
		
		Funcionario atendente = new Atendente();
		atendente.setValorImposto(1600.0);
		System.out.println("O imposto pago pelo atendente ser� de: R$" + atendente.calculaImposto());
	}

}
