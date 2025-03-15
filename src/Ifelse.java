import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        // Opdracht 1
        System.out.println("Typ een getal boven de 0");
        int userInput = getUserInput();
        checkOddOrEven(userInput);

        // Opdracht 2
        convertGrade(9.1);

        // Opdracht 3
        printHighestNumber(107, 7);

        // Opdracht 4
        System.out.println(("Typ een getal (alleen positieve waardes)"));
        int userInput2 = getUserInput();
        Main.postiveOrZeroOrNegativ(userInput2);

        // Opdracht 5
        int age = getUserInput();
        System.out.println("Typ de leeftijd van de persoon van wie je de levensfase wil checken: ");
        returnLifePhase(age);
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void checkOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Het getal is even");
        } else {
            System.out.println("Het getal is oneven");
        }
    }

    public static void convertGrade(double grade) {
        if (grade <= 5.5 && grade >= 0) {
            System.out.println("Omgerekend cijfer: F");
        } else if (grade > 5.5 && grade <= 6) {
            System.out.println("Omgerekend cijfer: D");
        } else if (grade > 6 && grade <= 7) {
            System.out.println("Omgerekend cijfer: C");
        } else if (grade > 7 && grade <= 8) {
            System.out.println("Omgerekend cijfer: B");
        } else if (grade > 8 && grade <=10){
            System.out.println("Omgerekend cijfer: A");
        } else {
            System.out.println("Ongeldige invoer");
        }
    }

    public static void printHighestNumber(int A, int B) {
        if (A > B) {
            System.out.println("Het grootste getal is: " + A);
        } else if (B > A) {
            System.out.println("Het grootste getal is: " + B);
        } else if (A == B) {
            System.out.println("De getallen zijn even groot");
        }
    }

    public static void returnLifePhase(int age) {
        if (age >= 0 && age < 12) {
            System.out.println("Deze persoon is een kind");
        } else if (age >= 12 && age < 18) {
            System.out.println("Deze persoon is een puber");
        } else if (age >= 18 && age < 65) {
            System.out.println("Deze persoon is een volwassene");
        } else if (age >= 65) {
            System.out.println("Deze persoon is een senior");
        } else {
            System.out.println("Verkeerde invoer");
        }
    }
}
