package exDiagrama;

public class Carro {
    public Carro(String modelo, String ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    private String modelo;
    public String getModelo(){
        return modelo;
    }

    private String ano;
    public String getAno() {
        return ano;
    }

    private String cor;
    public String getCor() {
        return cor;
    }

    @Override
    public String toString(){
        return " Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor;
    }

}
