//Exercise 11: Start with a number that has a binary on in the most significant
//position (hint: Use a hexadecimal constant). Using the signed right-shift operator,
//right shift it all the way through all of its binary positions, each time displaying
// the result using Integer.toBinaryString().
import java.util.*;
import static net.mindview.util.Print.*;
//It doesn't lead any zeros.
public class RightLeftShift{
	public static void main(String args[]){
		int i = 0x009;
		print(Integer.toBinaryString(i));
		i = i >> 1;
		print(Integer.toBinaryString(i));
		i >>= 1;
		print(Integer.toBinaryString(i));
		i >>= 1;
		print(Integer.toBinaryString(i));
		i >>= 1;
		print(Integer.toBinaryString(i));
	//Ex 12. LeftShift through all the bits.
		print();
		int j = 0x00F;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		j <<= 1;
		print(Integer.toBinaryString(j));
		
	
		
	}
}