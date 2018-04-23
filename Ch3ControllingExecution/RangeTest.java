//Exercise 6: Modify the two test() methods in the previous two
//programs so they take two extra arguments, begin and end, and so that testval is tested to see
//if it is within the range between (and including) begin and end.

import static net.mindview.util.Print.*;
//Can a method have the same number of paramerters with different names?
public class RangeTest{
	public static void main(String[] args){
		print(test2(5, 4, 10));
		print(test2(5, 1, 3));
		print(test2(5, 5, 10));
		print(test2(5, 6, 10));
		print(test2(10, 6, 10));
	}
	
	static int test2(int testval, int Begin, int end){
		if(testval >= Begin && testval <= end){
			return +1;
		}
	    else 
			return 0;
	}
}