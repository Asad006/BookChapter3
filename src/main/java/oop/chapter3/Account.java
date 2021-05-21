package oop.chapter3;

public class Account {
    private String name; // class instance variable; maintains data for each object.

    // set name
    //// (string name, type param, ...) are local variables as they are located
    // in the parameter list of the method.can be used only in the method.
    public void setName(String name){
        this.name= name;
    }
    // get name
    public String getName(){
        return name;
    }
}
