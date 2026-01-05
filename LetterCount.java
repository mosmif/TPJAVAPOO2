import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text (max 100 characters): ");
        String input = sc.nextLine().toUpperCase();

        int[] nb_occurrences = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                nb_occurrences[c - 'A']++;
            }
        }

        System.out.println("The string \"" + input + "\" contains:");
        for (int i = 0; i < 26; i++) {
            if (nb_occurrences[i] > 0) {
                System.out.println(nb_occurrences[i] + " occurrence(s) of the letter '" + (char)(i + 'A') + "'");
            }
        }
    }
}
