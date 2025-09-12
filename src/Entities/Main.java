package Entities;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] Lettoremultimediale = new ElementoMultimediale[5];


        System.out.println("Ciao, cerca dei file inserendo durata e titolo");
        for (int i = 0; i <= Lettoremultimediale.length; i++) {

            System.out.println("vuoi aprire un Img, un video o una RegistrazioneAudio");
            String ElementoMultimediale = scanner.nextInt();

            System.out.println("inserire durata");
            int durata = scanner.nextInt();

            System.out.println("inserire titolo");
            String titolo = scanner.nextLine();


        }


        RegistrazioneAudio Song1 = new RegistrazioneAudio(4, "We will rock you");
        RegistrazioneAudio Song2 = new RegistrazioneAudio(4, "Preparation ");
        Img gattojpg = new Img("gattojpg");
        Video BionicleLore = new Video(10, "bioniclePirakastory");
        Video movie = new Video(90, "Halloween");

        // ho creato oggetti manualmente per vedere se funzionano le classi.

        movie.Play();


    }

}

