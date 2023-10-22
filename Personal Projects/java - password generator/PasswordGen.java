import java.util.Scanner;
import java.util.Random;

public class PasswordGen {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    int length;
    boolean say;
    boolean read;
    String password = "";

    public void init() {
        System.out.println("How long should your password be? (whole number)");
        length = scan.nextInt();
        // System.out.println("Should your password be easy to say? (true/false)");
        // say = scan.nextBoolean();
        // System.out.println("Should your password be easy to read? (true/false)");
        // read = scan.nextBoolean();
    }

    public String generate() {
        for (int i = 0; i < length; i++) {
            int randomNumber = rand.nextInt(127 - 32) + 32;
            char rgen = (char) randomNumber;
            password += rgen;
        }
        return password;
    }
}