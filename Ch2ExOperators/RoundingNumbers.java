//: operators/RoundNumbers.java
// Rounding floats and doubles.
import static net.mindview.util.Print.*;

public class RoundingNumbers {
	public static void main(String[] args){
		double above = 0.7, below = 0.4;
		float fabove = 0.7f, fbelow = 0.4f;
		print("Math.round(above): " + Math.round(above));
		print("Math.round(below): " + Math.round(below));
		print("Math.round(above): " + Math.round(fabove));
		print("Math.round(below): " + Math.round(fbelow));
	}
}
//If any mathematical or bitwise operations on  char, byte, or short primitive types get promoted to int
// you will need to 