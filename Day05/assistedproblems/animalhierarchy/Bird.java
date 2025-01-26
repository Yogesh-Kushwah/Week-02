package assistedproblems.animalhierarchy;

// Bird class inheriting from Animal
public class Bird extends Animal {
    Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    void makeSound() {
        System.out.println("Making the sound, Whispering " + name + " " + age);
    }
}
