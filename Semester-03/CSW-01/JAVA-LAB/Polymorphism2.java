// Base class Animal
class Animal
{
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
    }
    class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
    }


// Subclass Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
// Main program to demonstrate method overriding
public class Polymorphism2 {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call the makeSound method for each
        myDog.makeSound(); // Should print "Dog barks"
        myCat.makeSound(); // Should print "Cat meows"
    }
}
