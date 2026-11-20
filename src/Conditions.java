import java.util.Locale;

public class Conditions {
    public static void main(String[] args) {
        int score = 0;
        if (score >= 90) {
            System.out.println("Отлично");
        } else if (score >= 70) {
            System.out.println("Хорошо");
        } else if (score >= 50) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Не сдал");
        }
        String login = "admin";
        String password = "12345";
        if (login.equals("admin") && password.equals("12345")) {
            System.out.println("Вход выполнен");
        } else {
            System.out.println("Неверный логин или пароль");
        }
        String browser = "Chrome";
        switch (browser.toLowerCase()) {
            case "chrome" -> System.out.println("chrome");
            case "firefox" -> System.out.println("firefox");
            case "safari" -> System.out.println("safari");
            default -> System.out.println("Браузер не поддерживается");
        }

    }
}
