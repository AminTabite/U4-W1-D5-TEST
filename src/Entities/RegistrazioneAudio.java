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
        return volume;
    }


    public int volumeDown() {
        this.volume = volume--;
        if (volume == 0) {
            System.out.println("il volume e' muto" + " " + volume);
        }
        return volume;
    }


    @Override
    public void Play() {
        int result = 0;
        for (result = 0; result <= this.volume; result++) {

            System.out.println("Il volume e' al " + this.volume + "!");

        }
    }
}
