package assistedproblems.animalhierarchy;

// Dog class inheriting from Animal
class Dog extends Animal {
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    void makeSound() {
        System.out.println("Making the sound in the Dog " + name + " " + age);
    }
}
