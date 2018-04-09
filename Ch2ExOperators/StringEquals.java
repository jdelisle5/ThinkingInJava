//Exercise 14: (3) Write a method that takes two String arguments and uses 
//all the boolean comparisons to compare the two Strings and print the results.
//For the == and !=, also perform the equals() test. In main(), call your method with some
//diferent string objects

public class StringEquals{
	public static void allEquals(String s1, String s2){
		boolean b;
		System.out.println(s1);
		System.out.println(s2);
		b = s1 == s2;
		System.out.println("s1 == s2: " + b);
		b = s1 != s2;
		System.out.println("s1 != s2: "+ b);
		System.out.println(b);
		b = s1.equals(s2);
		System.out.println("s1.equals(s2): " + b);
	}
	
	public static void main(String[] args){
		StringEquals se1 = new StringEquals();
		String s = new String();
		int x = 2;
		s = "Joseph is a man";
		String s0 = new String();
		s0 = "JoAnne";
		String s1 = new String();
		s1 = "Joseph is a man";
		
		StringEquals.allEquals(s, s1);
		System.out.println();
		se1.allEquals(s, s0);


	}
}