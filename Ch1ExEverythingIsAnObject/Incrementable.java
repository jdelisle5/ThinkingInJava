/*
*Exercise 7: 
*Turn the Incrementable Code fragement into a working program
*/

public class Incrementable{
	static void increment(){StaticTest.i++;}
	public static void main(String[] args){
		increment();
		System.out.println(StaticTest.i);
	}//End of main
	


}//Ends Class

	class StaticTest{
		static int i = 47;
	}//Ends StaticTest Class