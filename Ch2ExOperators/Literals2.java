//Exercise 8: Show that hex and octal notations work with long values
//				us the Long.toBinaryString() to display results.
import static net.mindview.util.Print.*;
public class Literals2{
	public static void main(String[] args){
		long l1 = 0x3F;
		print("1l: " + Long.toBinaryString(l1));
		long l2 = 0x4ff;
		print("12: " + Long.toBinaryString(l2));
		long l3 = 0345;
		print("l3: " + Long.toBinaryString(l3));
	}
}