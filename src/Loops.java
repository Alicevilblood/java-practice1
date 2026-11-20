public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        int count = 5;
        while (count > 0) {
            System.out.println("Осталось: " + count);
            count--;
        }
        System.out.println("Поехали!");

        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                continue;
            }
            if (i == 9) {
                break;
            }
            System.out.println(i);
        }
    }
}
