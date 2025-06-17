package Package08;

public class Student extends Person{

        //override
        void getDetails() {
            super.personDetails(); // Call the superclass method
            System.out.println("Student details.");
        }

}
