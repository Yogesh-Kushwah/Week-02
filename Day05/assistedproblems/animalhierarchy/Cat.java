package assistedproblems.animalhierarchy;

// Cat class inheriting from Animal
class Cat extends Animal {
    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    void makeSound() {
        System.out.println("Making the sound, Meaww.. " + name + " " + age);
    }
}
