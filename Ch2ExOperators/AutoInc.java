//:operators/AutoInc.java
//Demonstrates the ++ and the -- operators.
import static net.mindview.util.Print.*;

public class AutoInc{
	public static void main(String[] args){
		int i = 1;
		print("i 	: " + i);
		print("++i 	: " + ++i); //Pre-Increment
		print("i++ 	: " + i++); //Post-Increment
		print("i 	: " + i);
		print("--i 	: " + --i); //Pre-Decrement
		print("i-- 	: " + i--);//Post-Decrement
		print("i 	: " + i);
	}
}

