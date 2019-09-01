package dataTest;

import java.util.Random;

public class StatsInJava {

	//Method to generate random numbers between a range
	public static int generateRandomIntRange(int min, int max) {
	    Random r = new Random();
	    return r.nextInt((max - min) + 1) + min;
	}
	
	public static void main(String[] args) {
		//To populate 10 random number into an array
		
		int rval = 0;
		int arval[] = new int[10];
		double mean=0;
		
		for(int i=0; i<10; i++) {
			rval = generateRandomIntRange(0,10);
			arval[i] = rval;
		}
		
		for(int i=0; i < arval.length; i++) {
			System.out.println(arval[i]);
			mean = mean + arval[i];
		}
		
		System.out.println("Sum is:"+mean);
		mean = mean/10;
		//System.out.println(rval);
		System.out.println("Mean is :"+ mean);
	}

}
