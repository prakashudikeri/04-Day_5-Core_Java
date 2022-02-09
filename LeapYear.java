package com.bridgelabz;
import java.util.Random;

public class LeapYear {
	public static void main(String[] args){
	    Random r = new Random();
	    int year = r.nextInt(1000,9999);
	    	System.out.println("The Year Number Generated : "+year);

	    if(year % 4 == 0) {
	        System.out.println(year + " is a Leap Year");
	    } 
	    else {
	        System.out.println(year + " is Not a Leap Year");
	    }
	}
}