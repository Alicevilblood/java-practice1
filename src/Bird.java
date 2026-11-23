public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    void fly() {
        System.out.println(name + " летает!");
    }

    @Override
    void makeSound() {
        System.out.println(name + " чирикает!");
    }
}
