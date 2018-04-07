/*
*Exercise 8: Write a program that demonstrates that
*no matter how many objects you create of a particular class, there
*is only one instance of a particular static field in that create
*
*/

public class StaticDemonstration{
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

class Exec{
	public static void main(String[] args){
		StaticDemonstration sd0 = new StaticDemonstration();
		StaticDemonstration sd1 = new StaticDemonstration();
		StaticDemonstration sd2 = new StaticDemonstration();
		
		System.out.println(sd0.getInteger());
		System.out.println(sd1.getInteger());
		System.out.println(sd2.getInteger());
		
	}
}//Class End