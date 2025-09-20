// Polymorphism Example in Java
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    // Method overriding (Runtime polymorphism)
    void sound() {
        System.out.println("Dog barks 🐶");
    }
}

class Cat extends Animal {
    // Method overriding
    void sound() {
        System.out.println("Cat meows 🐱");
    }
}

public class PolymorphismExample {
    // Method overloading (Compile-time polymorphism)
    void show(int a) {
        System.out.println("Number: " + a);
    }

    void show(String b) {
        System.out.println("Text: " + b);
    }

    public static void main(String[] args) {
        // Runtime polymorphism
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();  // Dog barks
        a2.sound();  // Cat meows

        // Compile-time polymorphism
        PolymorphismExample obj = new PolymorphismExample();
        obj.show(100);      // Calls show(int)
        obj.show("Hello");  // Calls show(String)
    }
}
