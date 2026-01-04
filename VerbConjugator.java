import java.util.Scanner;

public class VerbConjugator {

    public static void conjugate(String verb) {
        if (!verb.endsWith("er")) {
            System.out.println("Ce n'est pas un verbe du premier groupe.");
            return;
        }

        String stem = verb.substring(0, verb.length() - 2);

        System.out.println("je " + stem + "e");
        System.out.println("tu " + stem + "es");
        System.out.println("il/elle " + stem + "e");
        System.out.println("nous " + stem + "ons");
        System.out.println("vous " + stem + "ez");
        System.out.println("ils/elles " + stem + "ent");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un verbe du premier groupe: ");
        String verb = sc.nextLine().toLowerCase();

        conjugate(verb);
        sc.close();
    }
}
