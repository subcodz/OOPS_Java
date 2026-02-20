//Poly: many, morph: forms
//In polymorphism, a parent class reference can refer to a child class object.
// This allows us to write code that can work with objects of different classes in a uniform way. 
//Polymorphism is achieved through method overriding and method overloading.

//overloading: compile time polymorphism, different methods with same name but different parameters
//overriding: runtime polymorphism


//function overloading
class Employee{

    String name;
    int salary;

    public void printDetails(String name){
        System.out.println("Employee name: " + name);
    }

    public void printDetails(int salary){
        System.out.println("Employee salary: " + salary);
    }

    public void printDetails(String name, int salary){
        System.out.println(name + " earns " + salary);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.name = "John";
        e1.salary = 50000;

        e1.printDetails(e1.name, e1.salary);
    }
}