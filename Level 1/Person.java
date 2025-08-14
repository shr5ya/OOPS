class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create an original person object
        Person originalPerson = new Person("Alice", 30);
        System.out.print("Original Person: ");
        originalPerson.displayDetails();

        System.out.println();

        // Create a new person using the copy constructor
        Person clonedPerson = new Person(originalPerson);
        System.out.print("Cloned Person: ");
        clonedPerson.displayDetails();

        // Modify the original and show that the clone is independent
        originalPerson.age = 31;
        System.out.println("\nAfter changing originalPerson's age:");
        System.out.print("Original Person: ");
        originalPerson.displayDetails();
        System.out.print("Cloned Person: ");
        clonedPerson.displayDetails();
    }
}
