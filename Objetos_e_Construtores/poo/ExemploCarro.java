package poo;

public class ExemploCarro {
	public static void main(String[] args) {
		
	Carro carro = new Carro("Volkswagen", "Up", "Run", 2016);
		
	System.out.println("A marca do carro é: " + carro.getMarca());
	System.out.println("O modelo do caaro é: " + carro.getModelo());
	System.out.println("A variante do carro é: " + carro.getVariante());
	System.out.println("O ano do carro é: " + carro.getAno());

	}
}
