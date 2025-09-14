package Entities;


import Interfaces.Play;


public abstract class ElementoMultimediale implements Play {
    // attributi
    protected String titolo;
    protected int durata;


    //costruttori
    public ElementoMultimediale(String titolo, int durata) {
        this.durata = durata;
        this.titolo = titolo;
    }
    //metodi

    public void play() {

    }


    public void show(String titolo) {
    }


}
