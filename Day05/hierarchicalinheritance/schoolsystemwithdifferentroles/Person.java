package hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void displayRole(){
        System.out.print(" Name "+name
                              +" Age "+age
        );
    }

}
