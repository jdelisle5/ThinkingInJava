/*
*Exercise 8: Write a program that demonstrates that
*no matter how many objects you create of a particular class, there
*is only one instance of a particular static field in that create
*
*/

class StaticDemonstration{
	private static int integer = 0;
	
	public int getInteger(){
		return integer;
	}
	
	public void increment(){
		integer++;
	}
	
	public void decrement(){
	integer--;
	}
}//StaticDemonstration End Class

public class Exec{
	public static void main(String[] args){
		StaticDemonstration sd0 = new StaticDemonstration();
		StaticDemonstration sd1 = new StaticDemonstration();
		StaticDemonstration sd2 = new StaticDemonstration();
		
		System.out.println(sd0.getInteger() + " is sdo.integer ");
		sd0.increment();
		System.out.println(sd1.getInteger() + " is sd1.integer ");
		sd0.increment();
		System.out.println(sd2.getInteger() + " is sd2.integer ");
		sd2.decrement();
		System.out.println(sd1.getInteger() + " is sd1.integer ");
		System.out.println(sd1.getInteger() + " is sd1.integer ");
		System.out.println(sd1.getInteger() + " is sd1.integer ");
		
		
	}
}//Class End