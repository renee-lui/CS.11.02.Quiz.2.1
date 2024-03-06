public class Main {
    public static void main(String[] args) {
        int resultOne = add(5, 10);
        System.out.println(resultOne);

        String resultTwo = greeting("Alice");
        System.out.println(resultTwo);

        int resultThree = add(2, 4, 6, 8);
        System.out.println(resultThree);

        printCapitalised("hello world");
    }

    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }
    public static String greeting(String name) {
        return "Bonjour, " + name + "!";
    }
    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        int sum1 = add(numOne, numTwo);
        int sum2 = add(sum1, numThree);
        int sum3 = add(sum2, numFour);
        return sum3;
    }
    public static void printCapitalised(String toBePrinted) {
        System.out.println(toBePrinted.toUpperCase());
    }
}