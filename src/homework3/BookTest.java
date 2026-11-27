package homework3;

public class BookTest {
    public static void main(String[] args) {
        Book master = new Book("Мастер и Маргарита", 677);

        master.addPages(36);
        master.printInfo();

        try {
            master.addPages(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
