public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " ест.");
    }

    abstract void makeSound();
}
