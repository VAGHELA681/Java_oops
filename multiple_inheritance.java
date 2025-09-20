// multiple inheritance
// First interface
interface Animal {
    void eat();
}

// Second interface
interface Bird {
    void fly();
}

// Class implementing both interfaces
class Bat implements Animal, Bird {
    public void eat() {
        System.out.println("Bat eats insects.");
    }

    public void fly() {
        System.out.println("Bat can fly at night.");
    }
}

// Main class
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Bat b = new Bat();
        b.eat();
        b.fly();
    }
}
