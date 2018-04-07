//Exercise 10: Write a program with two constant values, one with alternating 
//				binary ones and zeroes, with a zero in the least-significant digit,
//				and the second, also alternating, with a one in the least-significant 
//				digit. (hint: It's easiest to use hexadecimal constants for this). Take
//				these two values, and combine them in all possible ways using the bitwise
//				operators, and display the results using Integer.toBinaryStrin();
import static net.mindview.util.Print.*;
//BitWis Operators check whether the digit is even or odd.
//Thing to remeber with bit is you are checking to see if they 
//are on. Not if they are both the same.
//If you compared 1010 and 1010 then the & operators compares
//bit by bit to return 1010. From Left to right it says, the first bits are on,
//the second bit is off, the third bits are on, and the fourth bit is off.
//If you had 1 and 0, the & operators says they both aren't on so 0.
public class BitOps{
	public static void main(String[] args){
	int bit1 = 0x000A;
	int bit2 = 0x000B;
	print("bit1 decimal :  " + bit1);
	print("bit2 decimal :  " + bit2);
	
	print("bit1 binary :         " + Integer.toBinaryString(bit1));
	print("bit2 binary :         " + Integer.toBinaryString(bit2));
	
	int combineBit;
	combineBit = bit1 & bit2;
	print("-------------------------------");
	print("combine bit1 & bit2 : " + Integer.toBinaryString(combineBit));
	
	print();
	print("bit1 binary :         " + Integer.toBinaryString(bit1));
	print("bit2 binary :         " + Integer.toBinaryString(bit2));
	
	combineBit = bit1 | bit2;
	print("-------------------------------");
	print("combine bit1 | bit2 : " + Integer.toBinaryString(combineBit));
	
	
	combineBit = bit1 ^ bit2;
	print("-------------------------------");
	print("combine bit1 ^ bit2 : " + Integer.toBinaryString(combineBit));
	
	
	combineBit = ~bit1;
	print("-------------------------------");
	print("combine ~bit1        : " + Integer.toBinaryString(bit1));
	
	
	combineBit = ~bit2;
	print("-------------------------------");
	print("combine ~bit2        : " + Integer.toBinaryString(bit2));
	}
	
}//CombineBit OutPut
// & 0