public class ArraysPractice {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 64, 99, 45, 70};
        System.out.println("Первая оценка: " + scores[0]);
        System.out.println("Последняя оценка: " + scores[scores.length - 1]);
        System.out.println("Всего оценок: " + scores.length);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Студент " + (i + 1) + ": " + scores[i]);
        }
        for (int score : scores) {
            System.out.println(score);
        }
        int sum = 0;
        for (int score : scores) {
            sum = sum + score;
        }
        System.out.println("Сумма: " + sum);
        double average = (double) sum / scores.length;
        System.out.printf("Среднее: %.2f%n", average);

        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        System.out.println("Максимальная оценка: " + max);
    }
}
