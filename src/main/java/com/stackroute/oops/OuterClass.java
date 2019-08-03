package com.stackroute.oops;

public class OuterClass {

        // Simple nested inner class
        class Inner {
            public void show() {
                System.out.println("Hiii this is nested class method");
            }
        }
    }
    class Main {
        public static void main(String[] args) {
            OuterClass.Inner in = new OuterClass().new Inner();
            in.show();
        }
    }


