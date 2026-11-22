public class OopPractice {
    public static void main(String[] args) {
        Cat yota = new Cat("Йота", 6);
        Cat busa = new Cat("Буся", 4);

        yota.meow();
        busa.meow();
        System.out.println(yota.name + " - возраст: " + yota.age);
        System.out.println(busa.name + " - возраст: " + busa.age);

        Student alice = new Student("Алиса", 5);
        Student gosha = new Student("Гоша", 3);

        alice.printInfo();
        gosha.printInfo();
    }
}
