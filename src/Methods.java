public class Methods {
    public static void main(String[] args) {
        printGreeting("Алиса");
        printGreeting("Алиса", 25);
        int result = multiply(5, 10);
        System.out.println(result);
        System.out.println(isEven(4));
        System.out.println(isEven(7));
        int[] scores = {85, 92, 78, 64, 99};
        int[] prices = {1200, 450, 3000, 999};
        System.out.println("Макс. оценка: " + findMax(scores));
        System.out.println("Макс. цена: " + findMax(prices));
    }

    public static void printGreeting(String name) {
        System.out.println("Привет, " + name + "! Учим Java");
    }

    public static void printGreeting(String name, int age) {
        System.out.println("Привет, " + name + ". Тебе " + age + " лет!");
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}
