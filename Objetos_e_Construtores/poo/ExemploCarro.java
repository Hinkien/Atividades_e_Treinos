package poo;

public class ExemploCarro {
	public static void main(String[] args) {
		
	Carro carro = new Carro("Volkswagen", "Up", "Run", 2016);
		
	System.out.println("A marca do carro �: " + carro.getMarca());
	System.out.println("O modelo do caaro �: " + carro.getModelo());
	System.out.println("A variante do carro �: " + carro.getVariante());
	System.out.println("O ano do carro �: " + carro.getAno());

	}
}
