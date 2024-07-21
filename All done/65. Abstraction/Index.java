// Abstract class Animal
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();
    
    // Regular method
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Concrete subclass of Animal
class Dog extends Animal {
    // Providing the implementation for the abstract method
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

// Another concrete subclass of Animal
class Cat extends Animal {
    // Providing the implementation for the abstract method
    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class Index {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Create a Dog object
        myDog.makeSound();  // Outputs: Woof Woof
        myDog.sleep();  // Outputs: This animal is sleeping.
        
        Animal myCat = new Cat();  // Create a Cat object
        myCat.makeSound();  // Outputs: Meow Meow
        myCat.sleep();  // Outputs: This animal is sleeping.
    }
}
