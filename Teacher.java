package Package05;

class Teacher extends Person {
    String subject;

    // Constructor for Teacher
    Teacher(String name, int age, String subject) {
        super(name, age); // calling Person constructor
        this.subject = subject;
    }

    // Overriding method to display Teacher details
    @Override
    void displayDetails() {
        super.displayDetails(); // display name and age
        System.out.println("Subject: " + subject);
    }
}
