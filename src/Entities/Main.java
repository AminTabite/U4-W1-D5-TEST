package Entities;

import java.util.Scanner;

public class Main {
    {
        System.out.println("Ciao, scegli un numero da 1 a 5 per riprodurre un elemento multimediale");

        int n = scanner.nextInt();

    }

    ;

    public static void main(String[] args) {

        RegistrazioneAudio Song1 = new RegistrazioneAudio(4, "We will rock you");
        RegistrazioneAudio Song2 = new RegistrazioneAudio(4, "Preparation ");
        Img gattojpg = new Img("gattojpg");
        Video BionicleLore = new Video(10, "bioniclePirakastory");
        Video movie = new Video(90, "Halloween");

        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] Lettoremultimediale = new ElementoMultimediale[5];
        Lettoremultimediale[0] = Song1;
        Lettoremultimediale[1] = Song1;
        Lettoremultimediale[2] = gattojpg;
        Lettoremultimediale[3] = BionicleLore;
        Lettoremultimediale[4] = movie;

    }

}

