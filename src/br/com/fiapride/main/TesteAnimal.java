package br.com.fiapride.main;

import br.com.fiapride.model.Alimentacao;
import br.com.fiapride.model.Animal;
import br.com.fiapride.model.Formiga;
import br.com.fiapride.model.Passaro;

public class TesteAnimal {
    public static void main(String[] args) {
        Alimentacao alimentacaoF = new Alimentacao("Restos de animais e comida", 0.100);
        Alimentacao alimentacaoP = new Alimentacao("Alpiste", 0.250);

        Formiga formiga = new Formiga("Fifi", 6, false, alimentacaoF, true);
        Passaro passaro = new Passaro("Loro", 2, true, alimentacaoP, "Cacatua", "Branca");

        System.out.println("\n--- Sistema FiapRide (Animal) ---");
        System.out.println("Formiga: " + formiga.getNome() + " | Patas: " + formiga.getNumeroPatas() + " | Voa: " + (formiga.getVoa() ? "Sim" : "Não") + " | Alimentação: " + formiga.getAlimentacao() + " | É rainha: " + (formiga.isRainha() ? "Sim" : "Não"));
        System.out.println("Passaro: " + passaro.getNome() + " | Patas: " + passaro.getNumeroPatas() + " | Voa: " + (passaro.getVoa() ? "Sim" : "Não") + " | Alimentação: " + passaro.getAlimentacao() + " | Espécie: " + passaro.getEspecie() + " | Coloração: " + passaro.getColoracao());

        formiga.renomear("Mena");

        System.out.println("\nFormiga: " + formiga.getNome() + " | Patas: " + formiga.getNumeroPatas() + " | Voa: " + (formiga.getVoa() ? "Sim" : "Não"));

        System.out.println("\nFormiga tenta voar");
        formiga.voar();
        System.out.println("\nPássaro tenta voar");
        passaro.voar();

        //Testando regra do setNome.
        //OBS: Como setNome é privado, vamos usar o metodo renomear() que internamente chama setNome().
        System.out.println("\n\nRenomeando animal sem valor (aspas vazias):");
        System.out.println("Nome antes de renomear: " + passaro.getNome());
        passaro.renomear("");
        System.out.println("Nome após renomear: " + passaro.getNome());
        System.out.println("\nRenomeando animal com valor:");
        System.out.println("Nome antes de renomear: " + passaro.getNome());
        passaro.renomear("Pitico");
        System.out.println("Nome após renomear: " + passaro.getNome());

        //Animal1 se alimenta
        formiga.alimentar(0.1);
        System.out.println("\n\nApós Formiga comer sobrou: " +formiga.getAlimentacao());

        //Formiga emite som
        System.out.println("\n\n--------------");
        System.out.println("Som da formiga:");
        formiga.emitirSom();

        //Passaro emite som
        System.out.println("\nSom do pássaro:");
        passaro.emitirSom();

    }
}
