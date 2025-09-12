package Entities;

public class RegistrazioneAudio extends ElementoMultimediale {
    //attributi

    private int volume;

    // costruttore
    public RegistrazioneAudio(int durata, int volume) {
        super();
        this.volume = 5;


    }

    //metodi

    public int volumeUp() {
        this.volume = volume++;
        if (volume == 10) {
            System.out.println("Volume massimo raggiunto" + " " + volume);
        }
        return volume++;
    }


    public int volumeDown() {
        this.volume = volume--;
        if (volume == 0) {
            System.out.println("il volume e' muto" + " " + volume);
        }
        return volume--;
    }

    ;;

}
