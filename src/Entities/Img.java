package Entities;

public class Img extends ElementoMultimediale {


    // attributi
    private int luminosita;

    // costruttori
    public Img(String titolo) {
        super();
        this.luminosita = 3;
        this.titolo = titolo;

    }

    // metodi


    public int aumentaLuminosita() {

        this.luminosita = luminosita++;
        if (luminosita == 10) {
            System.out.println("la luminosita' e' al massimo" + " " + luminosita);

        }
        return luminosita;
    }

    public int diminuireLuminosita() {

        this.luminosita = luminosita--;
        if (luminosita == 0) {
            System.out.println("la luminosita' e' al minimo" + " " + luminosita);

        }
        return luminosita;
    }


    public void Show() {

        int lum = 0;
        String titolo = this.titolo;

        for (lum = 0; lum <= this.luminosita; lum++) {
            System.out.println("Il la luminosita' e' al " + this.luminosita + "*");

        }
        System.out.println("il titolo dell' img e' " + titolo);
    }


    @Override
    public void Play() {
    }


}
