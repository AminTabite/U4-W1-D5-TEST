package Entities;


import Interfaces.Play;


public abstract class ElementoMultimediale implements Play {
    // attributi
    protected String titolo;


    //costruttori
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }


    //metodi

    public void play() {

    }


    public void show() {
    }


}
