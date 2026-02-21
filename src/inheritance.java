//inheritance: to inherit properties and behaviors from a parent class to a child class
//parent class: superclass, child class: subclass
//inheritance promotes code reusability and establishes a natural hierarchical relationship between classes

//three types of inheritance: single, multilevel, hierarchical


class Animal {
    String name;

    public void typeofAnimal(){
        System.out.println("I am an animal");
    }
}

//single inheritance: a class inherits from one parent class
class Dog extends Animal {
    public void details(int weight, int age){
        System.out.println(weight + "kg "+ age + " years old");
    }
}

//multilevel inheritance: a class inherits from a class which is already a child of another class
class GermanShepherd extends Dog {
    public void breed(){
        System.out.println("I am a German Shepherd");
    }
}

//hierarchical inheritance: multiple classes inherit from a single parent class
class Cat extends Animal {
    public void details(int weight, int age){
        System.out.println(weight + "kg "+ age + " years old");
    }
}


//main function to test the inheritance
public class inheritance {
    public static void main(String[] args){

        //creating an object of the GermanShepherd class
        GermanShepherd gs = new GermanShepherd();
        gs.name = "Bud";
        gs.typeofAnimal();
        gs.details(30, 5);
        gs.breed();

        //creating an object of the Cat class
        Cat c1 = new Cat();
        c1.name = "Whiskers";
        c1.typeofAnimal();
        c1.details(5, 3);
        
    }
}