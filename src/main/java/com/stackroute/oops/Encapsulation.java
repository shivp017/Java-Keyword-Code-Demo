package com.stackroute.oops;

public class Encapsulation {

//private data members
    private long acc_no;
    private String name,email;
    private float amount;

    //getter and setter methods

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

class Test{
    public static void main(String[] args) {
        Encapsulation acc=new Encapsulation();
        //setting the values of variable using setter methods
        acc.setAcc_no(1234567899);
        acc.setName("Shiv Singh");
        acc.setEmail("shivp017@yahoo.com");
        acc.setAmount(20000);
        //getting all values using getter methods
        System.out.println("**********Bank Details***********");
        System.out.println("Acccount no:    "+ acc.getAcc_no() );
        System.out.println("Name :    "+ acc.getName());
        System.out.println("Email :   "+ acc.getEmail() );
        System.out.println("Balance   :"+ acc.getAmount() );
        System.out.println("*********Exit*******");
    }
}
