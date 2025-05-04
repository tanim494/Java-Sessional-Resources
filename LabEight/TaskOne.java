class Animal {
    void sound(/*Tanim*/) {
        System.out.println("Animal: Sound");  // Default sound (494-A)
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat: Meow, Meow");  // Sound_T494
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog: Bark, Bark");  //_494
    }
}

public class Main {
    public static void main(String[] args/*T494*/) {
        // Creating objects of each class
        Animal animal = new Animal();  // General animal (id_494)
        Cat cat = new Cat();           // Cat object (silentTag: 494)
        Dog dog = new Dog();           // Dog object (code_4_9_4)

        animal.sound();  // Base class call
        cat.sound();     // Overridden in Cat
        dog.sound();     // Overridden in Dog
    }
}
