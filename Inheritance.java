// Parent class (Base class / Superclass)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (Derived class / Subclass)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Inherited method from Animal
        d.bark();  // Dog's own method
    }
}
