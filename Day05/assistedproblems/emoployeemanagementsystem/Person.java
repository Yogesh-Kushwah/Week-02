 public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Calls the setter for validation
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age < 0) { // Validation rule: age can't be negative

        }
        this.age = age; // Assign the value if valid
    }

    public static void main(String[] args) {

            Person person = new Person("John", 20); // Invalid age


        // Valid age example
        Person person2 = new Person("Jane", 25);
        System.out.println("Age: " + person.getAge()); // Output: Age: 25
        System.out.println("Age: " + person2.getAge()); // Output: Age: 25
    }
}

