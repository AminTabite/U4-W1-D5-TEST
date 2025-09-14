package Entities;

public class Video extends ElementoMultimediale {
    //attributi
    private int luminosita;
    private int volume;
    private int durata;

    // costruttori
    public Video(String titolo, int durata) {
        super(titolo);
        this.volume = 5;
        this.luminosita = 3;
        this.durata = durata;
        this.titolo = titolo;
    }

    //metodi
    public int volumeUp() {
        this.volume = volume++;
        if (volume == 10) {
            System.out.println("Volume massimo raggiunto" + " " + volume);
        }
        return volume;
    }


    public int volumeDown() {
        this.volume = volume--;
        if (volume == 0) {
            System.out.println("il volume e' muto" + " " + volume);
        }
        return volume;
    }

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


    @Override
    public void Play() {
        int result = 0;
        int lum = 0;

        for (lum = 0; lum <= this.luminosita; lum++) {
            System.out.println("Il la luminosita' e' al " + this.luminosita + "*");
        }

        for (result = 0; result <= this.volume; result++) {

            System.out.println("Il volume e' al " + this.volume + "!");


        }

        System.out.println(" il video in riproduzione e'" + " " + this.titolo + " " + "dalla durata di " + durata);

    }
}
