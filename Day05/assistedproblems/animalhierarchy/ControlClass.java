package assistedproblems.animalhierarchy;

// Main class to demonstrate polymorphism
public class ControlClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        animal = new Dog("Entertainment", 8);
        animal.makeSound();

        animal = new Cat("Doremon", 5);
        animal.makeSound();

        animal = new Bird("Sparrow", 3);
        animal.makeSound();
    }
}
