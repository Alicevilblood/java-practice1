import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsPractice {
    public static void main(String[] args) {
        ArrayList<String> cats = new ArrayList<>();
        cats.add("Шарлотта");
        cats.add("Буся");
        cats.add("Йота");
        System.out.println(cats);
        System.out.println(cats.get(1));
        System.out.println(cats.size());
        cats.remove("Буся");
        System.out.println(cats);

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(5);
        scores.add(3);
        scores.add(4);
        scores.add(5);
        System.out.println(scores);
        System.out.println(scores.size());
        int sum = 0;
        for (int score : scores) {
            sum = sum + score;
        }
        System.out.println("Cумма: " + sum);

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Йота", 6);
        ages.put("Буся", 4);
        System.out.println(ages);
        System.out.println(ages.containsKey("Буся"));
        ages.put("Йота", 7);
        System.out.println(ages.get("Йота"));

        HashMap<String, Integer> prices = new HashMap<>();
        prices.put("Кофе", 250);
        prices.put("Чай", 145);
        prices.put("Сок", 300);
        System.out.println(prices.get("Чай"));
        prices.put("Кофе", 350);
        System.out.println(prices);
        System.out.println(prices.containsKey("Молоко"));

        HashSet<String> colors = new HashSet<>();
        colors.add("красный");
        colors.add("синий");
        colors.add("красный");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("синий"));

        ArrayList<String> names = new ArrayList<>();
        names.add("Аня");
        names.add("Боря");
        names.add("Аня");
        names.add("Вика");
        names.add("Боря");

        HashSet<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);
    }
}
