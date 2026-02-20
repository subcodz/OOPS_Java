class Car{               //class is a blueprint of an object
    String name;         //properties of a class are called attributes
    int price;


    //constructor is a special method which is used to initialize the object
    Car(String name, int price){        //parameterized constructor
        this.name = name;               //this keyword is used to refer to the current object
        this.price = price;
    }

    public void printDetails(){         //method is a function which is defined inside a class
        System.out.println(this.name);
        System.out.println(this.price);
    }
}

public class oop{                     //main method is the entry point of the program
    
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 100000);
        c1.printDetails();
    }
}