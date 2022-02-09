package com.bridgelabz;
import java.util.Scanner;

public class LargestAmong3 {
    public static void main(String[] args) {
    	int a, b, c;
        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the 3 Numbers :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > b) {
        	if(a > c) {
	                System.out.println("The Value of A is Large");
	            } 
        	else {
	                System.out.println("The Value of C is Large");
	            }
	        } 
        	else {
	            if(b > c) {
	                System.out.println("The Value of B is Large");
	            } 
	            else {
	                System.out.println("The Value of C is Large");
	            }
        	}
    }
}