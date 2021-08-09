package exDiagrama;

public class Renavam {
    public Renavam (String numero) {
        this.numero = numero;
    }

    private String numero;
    public String getNumero() {
        return numero;
    }

    @Override
    public String toString(){
        return numero;
    }

}
