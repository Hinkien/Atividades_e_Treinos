package exDiagrama;
//
public class Principal {
    public static void main(String[] args) {
        Renavam renavam = new Renavam("000000000");
        Carro carro = new Carro("Up","2016", "Preto");
        Pessoa pessoa = new Pessoa("Henrique", "000000000-00", "00000000-8");

        System.out.println("Numero do Renavam = " + renavam);
        System.out.println("Informações do motorista = " + pessoa );
        System.out.println("Informações do carro = " + carro);

    }

}