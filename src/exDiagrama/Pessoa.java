package exDiagrama;

public class Pessoa {
    public Pessoa (String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;

    }

    private String nome;
    public String getNome(){
        return nome;
    }

    private String cpf;
    public String getCpf(){
        return cpf;
    }

    private String rg;
    public String getRg(){
        return rg;
    }

    @Override
    public String toString(){
        return "nome: " + nome + ", CPF: " + cpf + ", RG:" + rg;
    }
}
