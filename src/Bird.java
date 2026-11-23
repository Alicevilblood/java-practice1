public class Bird extends Animal implements Flyable{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " летает!");
    }

    @Override
    void makeSound() {
        System.out.println(name + " чирикает!");
    }
}
