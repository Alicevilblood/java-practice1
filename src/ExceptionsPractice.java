public class ExceptionsPractice {
    public static void main(String[] args) {
        System.out.println("Начало");

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: делить на ноль нельзя!");
        }
        System.out.println("Конец");

        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого индекса нет!");
        } finally {
            System.out.println("Проверка закончена.");
        }

        try (MyResource res = new MyResource()) {
            System.out.println("Работаем с ресурсом");
        }
    }
}
