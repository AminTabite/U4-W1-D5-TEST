package Entities;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RegistrazioneAudio Song1 = new RegistrazioneAudio(4, "We will rock you");
        RegistrazioneAudio Song2 = new RegistrazioneAudio(4, "Preparation ");
        Img gattojpg = new Img("gattojpg");
        Video BionicleLore = new Video(10, "bioniclePirakastory");
        Video movie = new Video(90, "Halloween");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ciao, scegli un numero da 1 a 5 per riprodurre un elemento multimediale");

    }
}