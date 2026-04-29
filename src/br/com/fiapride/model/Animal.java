package br.com.fiapride.model;

public class Animal {
    private String nome;
    private int numeroPatas;
    private boolean voa;
    private Alimentacao alimentacao;

    public Animal(String nome, int numeroPatas, boolean voa, Alimentacao alimentacao) {
        this.setNome(nome);
        this.setNumeroPatas(numeroPatas);
        this.setVoa(voa);
        this.alimentacao = alimentacao;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if(nome.isEmpty()){
            System.out.println("Nome não pode ser vazio, informe um nome válido.");
            return;
        }
        this.nome = nome;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public String getAlimentacao() {
        return String.format("%.2f",this.alimentacao.getPorcaoKg()) + "kg de " + this.alimentacao.getNome();
    }

    private void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public boolean getVoa() {
        return voa;
    }

    private void setVoa(boolean voa) {
        this.voa = voa;
    }

    public void voar() {
        if(this.voa){
            System.out.println("Voando!!!");
        } else {
            System.out.println("Esse animal não consegue voar");
        }
    }

    public void alimentar(double kg) {
        if(this.alimentacao.getPorcaoKg() - kg < 0){
            System.out.println("Não é possível alimentar-se mais do que está disponível");
            return;
        }
        this.alimentacao.setPorcaoKg(this.alimentacao.getPorcaoKg() - kg);
    }

    public void adicionarComida(double kg) {
        this.alimentacao.setPorcaoKg(this.alimentacao.getPorcaoKg() + kg);
    }

    public void renomear(String nome){
        this.setNome(nome);
    }

    public void emitirSom() {
        System.out.println("Esse animal não emite som conhecido");
    }
}
