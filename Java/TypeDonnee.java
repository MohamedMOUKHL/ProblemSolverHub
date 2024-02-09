import java.util.Scanner;

public class TypeDonnee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer
        System.out.print("Enter an integer: ");
        int entier = scanner.nextInt();

        // Read a double
        System.out.print("Enter a floating-point number: ");
        double flotant = scanner.nextDouble();

        // Read multiple strings into an array
        System.out.print("Enter a phrase (multiple words): ");
        String[] phrases = new String[3]; // You can adjust the array size as needed
        for (int i = 0; i < phrases.length; i++) {
            phrases[i] = scanner.next();
        }

        // Display the values
        System.out.println("Integer: " + entier);
        System.out.println("Floating-point number: " + flotant);
        System.out.println("Phrases: " + String.join(", ", phrases));

        // Close the scanner
        scanner.close();
    }
}
