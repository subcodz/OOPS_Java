//Encapsulation is the principle of restricting direct access to an object's state and
//controlling state changes through well-defined behavior.

// In Java, it is achieved primarily using access modifiers.

//its not about visibility or hiding the data but it is limiting or controlling the access to the data.

//No one can arbitrarily assign state; they can only trigger controlled behavior that modifies state under defined rules.

class BankAccount {

    private double balance;                    //accessed only within the BankAccount class, no arbitrary access from outside

    public void deposit(double amount) {       //public method to modify the private variable balance
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {      //public method to modify the private variable balance
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {               //public method to access the private variable balance
        return balance;
    }
}
