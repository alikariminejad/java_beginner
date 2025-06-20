import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        // you need an Audio with .wav format
        File file = new File("Simple Ambient.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";


        while (!response.equals("Q")) {
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch(response){
                case ("P"): clip.start();break;
                case ("S"): clip.stop();break;
                case("R"): clip.setMicrosecondPosition(0);break;
                case("Q"): clip.stop();break;
                default:
                    System.out.println("Not a valid response");
            }
            System.out.println("Byeeee!");
        }
    }
}