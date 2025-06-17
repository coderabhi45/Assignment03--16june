package package03;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.sound();  // Output: Dog barks
        a2.sound();  // Output: Cat meows
        a3.sound();  // Output: Cow moos
    }
}


