package com.bridgelabz;
import java.util.Locale;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);	
        	System.out.println("Enter Any Character :");
        ch = sc.next().toLowerCase().charAt(0);   
        
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch ==  'o' || ch == 'u') {
            System.out.println(ch + " is Vowel");
        } 
        else {
            System.out.println(ch + " is Consonant");
        }
    }
}