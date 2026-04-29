package br.com.fiapride.model;

public class Passaro extends  Animal{
    private final String especie;
    private final String coloracao;

    public Passaro(String nome, int numeroPatas, boolean voa, Alimentacao alimentacao, String especie, String coloracao) {
        super(nome, numeroPatas, voa, alimentacao);
        this.especie = especie;
        this.coloracao = coloracao;
    }

    public String getEspecie() {
        return this.especie;
    }

    public String getColoracao() {
        return this.coloracao;
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu piu (assobio)!");
    }
}
