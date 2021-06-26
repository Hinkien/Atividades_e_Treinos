package poo;

public class Carro {
	
	public Carro (String marca, String modelo,String variante, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.variante = variante;	
		this.ano = ano;
	}
	
	private String marca;
	public String getMarca() {
		return marca;
	}
	
	private String modelo;
	public String getModelo() {
		return modelo;
	}
	
	private String variante;
	public String getVariante() {
		return variante;
	}
	
	private int ano;
	public int getAno() {
		return ano;
	}
	
}



