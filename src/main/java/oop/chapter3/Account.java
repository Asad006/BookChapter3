package oop.chapter3;

public class Account {
    private String name; // class instance variable; maintains data for each object.
    private double balance;

    // Constructor is used to initialize the instance variables
    // when the object is created
    // The default constructor is when a constructor is not defined which has
    // no parameters. if a constructor is created the default one is not called.
    //
    public Account(String name, double balance) {

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance += depositAmount;
        }
    }
    // get the balance
    public Double getBalance(){
        return balance;
    }

    // set name
    //// (string name, type param, ...) are local variables as they are located
    // in the parameter list of the method.can be used only in the method.
    public void setName(String name) {
        this.name = name;
    }

    // get name
    public String getName() {
        return name;
    }
}
