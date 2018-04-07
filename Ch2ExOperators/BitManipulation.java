//: operators/BitManipulation.java
// Using the bitwise operators.
import java.util.*;
import static net.mindview.util.Print.*;

public class BitManipulation{
	public static void main(String[] args){
		Random rand = new Random(47);
		int i = rand.nextInt();
		int j = rand.nextInt();
		printBinaryInt("-1", -1);
		printBinaryInt("+1", +1);
		int maxpos = 2147483647;
		printBinaryInt("maxpos", maxpos);
		int maxneg = -2147483648;
		printBinaryInt("maxneg", maxneg);
		printBinaryInt("i" , i);
		printBinaryInt("j" , j);
		printBinaryInt("~i" , ~i);
		printBinaryInt("-i" , -i);
		printBinaryInt("i & j", i & j);
		printBinaryInt("i | j",  i | j);
		printBinaryInt("i ^ j", i ^ j);
		print();
		printBinaryInt("i" , i);
		printBinaryInt(" i << 5", i << 5);
		printBinaryInt(" i >> 5", i >> 5);
		printBinaryInt(" (~i) >> 5", (~i) >> 5);
		printBinaryInt(" i >>> 5", i >>> 5);
		printBinaryInt(" (~i) >>> 5", (~i) >>> 5);
		
		//Long can do all the same site basically.
		
	}
	
	static void printBinaryInt(String s, int i){
		print(s + ", int: " + i + ", binary:\n " + Integer.toBinaryString(i));
	}
	
	static void printBinaryLong(String s, long l){
		print(s + ", long: " + l + ", binary:;\n  " + Long.toBinaryString(l));
	}
}
