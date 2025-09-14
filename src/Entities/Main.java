package Entities;

import java.util.Scanner;

public class Main {

    //  RegistrazioneAudio Song1 = new RegistrazioneAudio(4, "We will rock you");
    // RegistrazioneAudio Song2 = new RegistrazioneAudio(4, "Preparation ");
    //Img gattojpg = new Img("gattojpg");
    //Video BionicleLore = new Video(10, "bioniclePirakastory");
    //Video movie = new Video(90, "Halloween");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] Lettoremultimediale = new ElementoMultimediale[5];

        //   System.out.println("Ciao, cosa vuoi riprodurre? 1= file img  2= file mp3 3= file mp4");


        //  System.out.println("Ciao, cerca dei file inserendo durata e titolo");
        for (int i = 0; i < Lettoremultimediale.length; i++) {

            System.out.println("Ciao, cosa vuoi riprodurre? 1= file img  2= file mp3 3= file mp4 ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1 -> {
                    System.out.println("inserire titolo img");
                    String titolo = scanner.nextLine();

                    scanner.nextLine();

                    Lettoremultimediale[i] = new Img(titolo);

                    break;
                }
                case 2 -> {
                    System.out.println("inserire titolo mp3");
                    String titolo = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("inserire durata brano");
                    int durata = Integer.parseInt(scanner.nextLine());

                    Lettoremultimediale[i] = new RegistrazioneAudio(titolo, durata);
                    break;
                }

                case 3 -> {
                    System.out.println("inserisci titolo mp4");
                    String titolo = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("inserisci durata video");
                    int durata = Integer.parseInt(scanner.nextLine());

                    scanner.nextLine();

                    Lettoremultimediale[i] = new Video(titolo, durata);
                    break;
                }
                default -> {
                    break;
                }


            }

            System.out.println("quale elemento vuoi riprodurre? scegli un numero da 1 a 5, 0 per finire");
            int sceltaelemento = Integer.parseInt(scanner.nextLine());

            if (sceltaelemento == 1) { Lettoremultimediale[0].show();}
            if (sceltaelemento == 2) {Lettoremultimediale[1].

        }
    }
}


