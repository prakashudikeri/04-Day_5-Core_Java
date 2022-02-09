package com.bridgelabz;

public class FlipCoin {
	 public static void main(String[] args) {      
	        int headCount = 0;
	        int tailCount = 0;

	 for(int i=1; i<=10; i++) {
	        double coinFlip =  (Math.random()*10) % 1;
	        	System.out.println("Coin Flip Value ="+coinFlip);
	        if(coinFlip < 0.5) {
	        	tailCount++;
	        } 
	        else {
	            headCount++;
	        }
	  }
	  	System.out.println("TailCount:"+tailCount);
	  	System.out.println("HeadCount:"+headCount);

	  	int PercentTail = (tailCount * 100) / 10;
	    int PercentHead = (headCount * 100) / 10;

        System.out.println("The Percentage of Tails is : " + PercentTail);
        System.out.println("The Percentage of Heads is : " + PercentHead);
	    }
}
