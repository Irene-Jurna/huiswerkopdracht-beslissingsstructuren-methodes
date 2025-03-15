import java.util.ArrayList;
import java.util.Objects;

public class loops {
    public static void main(String[] args) {
        // Opdracht 1: Je moet de som van alle even getallen berekenen van 1 tot 100.
        getSum();

        // Opdracht 2: Je wilt een reeks van getallen afdrukken, beginnend bij 1 en elke keer vermenigvuldigd met 2, totdat het resultaat groter is dan 1000.
        printNumbers();

        // Opdracht 3: Je moet een lijst van getallen doorlopen en controleren of het getal 45 aanwezig is.
        int[] numberList = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
        isNumberPresent(numberList);

        // Opdracht 4: Je wilt een array van integers doorlopen en de som van de elementen berekenen.
        int[] array = {12, 5, 7, 2, 18, 3, 9, 12};
        calculateSum(array);

        // Opdracht 5: Je hebt een lijst van strings en je wilt elk element afdrukken totdat je een lege string tegenkomt.
        String[] wordList = {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"};
        printWordsUntilEmptyString(wordList);
    }
    public static void getSum() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                sum += i;
            } if (i == 100) {
                System.out.println("De som van alle even getallen tussen de 1 en 100 is: " + sum);
            }
        }
    }

    public static void printNumbers() {
        int numberToPrint = 1;
        while (numberToPrint <= 1000) {
            System.out.println(numberToPrint);
            numberToPrint *=2;
        }
    }

    public static void isNumberPresent(int[] numberList) {
        int i = 0;
        String numberIsPresent = "niet";
        while (i < numberList.length) {
            if (numberList[i] == 45) {
                numberIsPresent = "wel";
            }
            i++;
        }
        System.out.println(45 + " staat " + numberIsPresent + " in de lijst.");
    }

    public static void calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("De som van deze array is: " + sum);
    }

    public static void printWordsUntilEmptyString (String[] arr) {
        ArrayList<String> sentence = new ArrayList<>();
        int i = 0;
        while (!Objects.equals(arr[i], "")) {
            sentence.add(arr[i]);
            i++;
        }
        System.out.println(String.join(" ", sentence));
    }
}
