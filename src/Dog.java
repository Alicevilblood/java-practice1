public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " говорит: Гав!");
    }

    @Override
    void makeSound() {
        System.out.println(name + ": Гав!");
    }
}
