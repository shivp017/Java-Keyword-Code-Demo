package com.stackroute.Loops;

import java.util.Scanner;

public class SwitchCaseDemo  {
    public static void main(String[] args) {
        System.out.println("enter character to check vowel or consonant");
        Scanner scanner=new Scanner(System.in);
       char ch= scanner.next().charAt(0);

        switch(ch)
        {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            case 'A':
                System.out.println("Vowel");
                break;
            case 'E':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;
            case 'O':
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}

