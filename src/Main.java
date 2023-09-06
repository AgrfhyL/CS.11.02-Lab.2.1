public class Main {

    public static void main(String[] args) {
        int sumOfTwo = add(1,3);
        System.out.println(sumOfTwo);
    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }
    // 5. triple
    public static String triple(String input) {
        System.out.println(input + input + input);
        return input + input + input;
    }
    // 6. half
    public static double half(int num) {
        return (double) num / 2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double posNum) {
        return (int) (posNum + 0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double negNum) {
        return (int) (negNum - 0.5);
    }
}
