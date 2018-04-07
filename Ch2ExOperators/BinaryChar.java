//Exercise 13 Write a method that displays char values in binary form
//Demonstrate it using several different characters.
import static net.mindview.util.Print.*;
public class BinaryChar {
	public static void main(String args[]){
		char c = 'T';
		print(Integer.toBinaryString(c));
		c = 't';
		print(Integer.toBinaryString(c));
		c = 'C';
		print(Integer.toBinaryString(c));
		c = 'c';
		print(Integer.toBinaryString(c));
	}
}
