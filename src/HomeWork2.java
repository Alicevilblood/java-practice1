public class HomeWork2 {
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(reverse("book"));
        System.out.println(reverse(""));
        System.out.println(reverse("школа"));
    }
}
