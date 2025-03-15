public class Main {
    public static void main(String[] args) {
        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        hello();
        positiveOrNegative(number);
        postiveOrZeroOrNegativ(number);
        bartender(name);
        sum(input1, input2);
    }

    public static void hello() {
        System.out.println("Hello, world!");
    }
    public static void positiveOrNegative(int number) {
        if (number % 2 == 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }
    public static void postiveOrZeroOrNegativ(int number) {
        if (number == 0) {
            System.out.println("This number is zero!");
        } else if (number % 2 == 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }
    public static void bartender(String name) {
        switch (name) {
            case "Job":
                System.out.println("Waterkefir");
                break;
            case "Irene":
                System.out.println("Rode thee");
                break;
            case "Henk":
                System.out.println("Warme appelsap");
                break;
            default:
                System.out.println("Wat wil je drinken?");
        }
    }
    public static void sum(int input1, int input2){
        System.out.println((input1 + input2));
    }
}