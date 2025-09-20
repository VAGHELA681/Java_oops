// Parent class
class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Inherited from Animal
        d.bark();

        Cat c = new Cat();
        c.eat();   // Inherited from Animal
        c.meow();
    }
}
