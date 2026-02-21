//accessmodifiers are keywords in Java that determine the visibility and accessibility of classes, methods, and variables.

//There are three main access modifiers in Java: public, protected, and private.

class Account {
    public  String name;        //public: accessible from anywhere
    protected String email;     //protected: accessible within the same package and subclasses
    private String password;    //private: accessible only within the same class

    //getter for password: since password is private, we need a getter method to access it from outside the class

    public String getPassword() {
        return this.password;
    }

    //setter for password: since password is private, we need a setter method to modify it from outside the class
    
    public void setPassword(String password) {
        this.password = password;
    }

}

public class accessmodifiers {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "John Doe";                                //accessible
        account1.email = "john.doe@example.com";                   //accessible within same package
        account1.setPassword("xyz1");
        System.out.println(account1.getPassword());                //accessible through getter method
    }
}