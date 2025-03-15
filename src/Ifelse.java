import java.util.Arrays;
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
        System.out.println("Typ de leeftijd van de persoon van wie je de levensfase wil checken: ");
        int age = getUserInput();
        returnLifePhase(age);

        // Opdracht 6
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        checkTextLength(text);

        // Opdracht 7
        int year = 2025;
        isLeapYear(year);

        // Opdracht 8
        int[] array = {23, 52, 76, 30, 15, 101, 99, 0, -5, 30};
        printHighestNumber(array);

        // Opdracht 10
        calculate(2, 3, "+");
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

    public static void checkTextLength(String text) {
        String textAdjective;

        if (text.length() < 10) {
            textAdjective = "kort";
        } else if (text.length() > 20) {
            textAdjective = "lang";
        } else {
            textAdjective = "middellang";
        }
        System.out.println("Met " + text.length() + " tekens is dit een " + textAdjective + "e tekst.");
    }

    public static void isLeapYear(int year) {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                System.out.println(year + " is een schrikkeljaar");
            } else if (year % 4 == 0 && !(year % 100 == 0)) {
                System.out.println(year + " is een schrikkeljaar");
        } else {
                System.out.println(year + " is geen schrikkeljaar");
            }
    }

    public static void printHighestNumber(int[] array) {
        try {
            int highestNumber = Arrays.stream(array).max().getAsInt();
            System.out.println("Het grootste getal uit deze array is: " + highestNumber);
        } catch (Exception e){
            System.out.println("Geen getallen gevonden");
        }
    }

    public static void calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                System.out.println(num1+  " + " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1+  " - " + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println(num1+  " * " + num2 + " = " + (num1 * num2));
                break;
            case "/":
                System.out.println(num1+  " / " + num2 + " = " + (num1 / num2));
        }
    }
}
