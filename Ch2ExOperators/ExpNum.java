//Exercise 9: Display the largest and smallest numbers for both float and double
//exponential notations
//What the largest float and double?
//float = IEEE754. IEEE 754 is some kind of standards for classes probably across languages.
//double = IEEE754
//import java.util.*;

public class ExpNum{
	//Things to remeber. If you make a non-static variable then
	//you need to create an object before you can call it/
	//even if the Variable is in the same class and the 
	//main method.
	
	//Second, determine is something a method or a variable.
	//You struggled with Double.MAx_VALUE() becuase it is 
	//not a method, but a variable. So it doesn't need the
	//"()". Anything ALL CAPS with underscores is a variable.
	public static void main(String[] args){
	System.out.println("Double MAX_VALUE = " + Double.MAX_VALUE);
	System.out.println("Double MIN_VALUE = " + Double.MIN_VALUE);
	System.out.println("Float MAX_VALUE = "  + Float.MAX_VALUE);
	System.out.println("Float MIN_VALUE = "  + Float.MIN_VALUE);
	}
}