package com.stackroute.oops;

abstract class Abstraction {

    abstract void draw();

    }
    // implementation is provided by others i.e. unknown by end user
    class Rectangle extends Abstraction{
        void draw(){System.out.println("drawing rectangle");}
    }
    class Circle extends Abstraction{
        void draw(){System.out.println("drawing circle");}
    }
    // method is called by programmer or user
    class TestAbstraction1{
        public static void main(String args[]){
            Abstraction c=new Circle();// object is provided through method, e.g., getShape() method
            c.draw();
            Abstraction  r=new Rectangle();
            r.draw();
        }
    }

