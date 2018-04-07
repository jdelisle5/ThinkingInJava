//: operators/StringOperators.java
import static net.mindview.util.Print.*;

public class StringOperators {
	public static void main(String[] args){
		int x = 0, y =1, z = 2;
		String s = "x, y, z ";
		print(s + x + y + z); //Outputs 012 because it is the String Value. Confuse me.
		print(x + " " + s); //Converts x to String
		s += "(summed) = "; //Concatenate Summed
		print(s + (x + y + z)); //Add First
		print("" + x);
	}
}