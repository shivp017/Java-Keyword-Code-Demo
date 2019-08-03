package com.stackroute.oops;

public class Constructor {

    int id;
    String name ;
//parametrised constructor
    public Constructor(int id, String name) {
        this.id =id;
        this.name = name;
    }
    void displayNameId(){System.out.println(id+" "+name);}


    public static void main(String args[]){
        //creating objects and passing values
        Constructor s1 = new Constructor(111,"Karan");
        Constructor s2 = new Constructor(222,"Aryan");
        //calling method to display the values of object
        s1.displayNameId();
        s2.displayNameId();
    }
}