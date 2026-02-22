/*
abstraction is about defining a common behavior contract while leaving implementation details to the subclasses.
Abstraction focuses on what an object does rather than how it does it.
*/

abstract class Animal {
    String type = "Animal";

    void eat() {
        System.out.println("Animal eating");
    }

    abstract void makeSound();             //no implementation, just a declaration of the method, to be implemented by subclasses
}

class Dog extends Animal {
    String type = "Dog";

    @Override                               //implementation of the abstract method makeSound in the Dog class
    void makeSound() {
        System.out.println("Bark");
    }

    @Override
    void eat() {
        System.out.println("Dog eating");
    }
}

public class abstraction {
    public static void main(String[] args) {

        Animal a = new Dog();               //animal is the reference

        a.eat();                            // Runtime → Dog eating
        a.makeSound();                      // Runtime → Bark
        System.out.println(a.type);         // Compile time → Animal
    }
}

/*
Animal is a reference and makeSound() is a method call resolved via dynamic binding
we cannot create an object like; Animal a1 = new Animal(); it is just a reference
*/



/*
also Why is this valid?
Animal a = new Dog();

But this is not?
Dog d = new Animal();

a dog is an animal but an animal is not necessarily a dog 

Reference type   → Animal
Actual object    → Dog 
*/



/*
Important Rule:
Overridden methods  → decided at runtime
Variables           → decided at compile time

Hence a.eat(); will call the eat method of the Dog class because it is decided at runtime and
a.type will print "Animal" because it is decided at compile time.
*/

/* 
Incase of,
static String type = "Animal"; compile time

Static variables belong to the class, not to objects, so they are accessed based on the reference type, not the actual object type.


Incase of,
Static methods → compile-time binding (method hiding, not overriding)
*/