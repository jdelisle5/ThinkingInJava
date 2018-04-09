//:operators/Overflow.java
//Surprise! Jave lets you overflow.

public class Overflow{
	public static void main(String[] args){
		int big = Integer.MAX_VALUE;
		System.out.println("big " + big);
		int bigger = big * 4;
		System.out.println("bigger = " + bigger);
	}
}
//Side note compount assignments do not require a cast 
//Be ware of narrwoing.