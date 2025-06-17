package Package04;

public class AnimalHierarchyTest {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Accessing methods from Dog
        dog.sound();      // Output: Dog barks
        dog.wagTail();    // Output: Dog wags tail

        // Accessing methods from Mammal
        dog.hasFur();     // Output: Mammals usually have fur
        dog.feedMilk();   // Output: Mammals feed milk to their young ones

        // Accessing methods from Animal
        dog.sleep();      // Output: Animal is sleeping
    }
}


