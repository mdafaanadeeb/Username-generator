import java.util.*;

public class UsernameGenerator {

    private static final String[] ADJECTIVES = {
        "Cool", "Fast", "Silent", "Brave", "Smart", "Crazy", "Dark", "Happy", "Funky", "Wild"
    };

    private static final String[] NOUNS = {
        "Coder", "Ninja", "Wizard", "Tiger", "Knight", "Samurai", "Hawk", "Panther", "Wolf", "Lion"
    };

    private static final String SYMBOLS = "_-";

    public static String generateUsername(Random random) {
        String adjective = ADJECTIVES[random.nextInt(ADJECTIVES.length)];
        String noun = NOUNS[random.nextInt(NOUNS.length)];
        int number = 100 + random.nextInt(900); // Random 3-digit number
        char symbol = SYMBOLS.charAt(random.nextInt(SYMBOLS.length()));

        return adjective + noun + symbol + number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("How many usernames would you like to generate? ");
        int count = scanner.nextInt();

        System.out.println("\nGenerated Usernames:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + generateUsername(random));
        }

        scanner.close();
    }
}
