public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void haveBirthday() {
        age++;
        System.out.println(name + " исполнилось " + age + "!");
    }

    void meow() {
        System.out.println(name + " говорит: Мяу!");
    }

    void printInfo() {
        System.out.println(name + " - возраст " + age);
    }
}

