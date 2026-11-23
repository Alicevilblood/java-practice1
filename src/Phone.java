public class Phone {
    private String brand;
    private int price;

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void applyDiscount(int percent) {
        if (percent >= 0 && percent <= 100) {
            price = price - price * percent / 100;
        } else {
            System.out.println("Неверная скидка!");
        }
    }

    void printInfo() {
        System.out.println("Телефон: " + brand + ", цена - " + price);
    }
}
