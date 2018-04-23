//Excerise 9: A fibonacci sequence is the sequence of numbers 1, 1, 2, 5, 8, 13, 21, 34 and so on,
//where each number  (from the third on) is the sum of the previous two. Create a method
//that takes an integer as an argument and displays that many Fibonacci numbers starting
//from the beginning, e.g. If you run Java Fibonacci 5 the output will be 1, 1, 2, 3, 5.
import java.util.Arrays;

public class Fib{
	public static void main(String[] args){
		System.out.println(args[0].toString());
		int fibToNum = Integer.parseInt(args[0]);
		System.out.println(fibToNum);
		//System.out.print(fibToNum);
		System.out.println(Arrays.toString(findFib(fibToNum)));
	}
	
	static int[] findFib(int fibNum){
		int[] fibSequence = new int[fibNum];
		System.out.println(fibSequence.length);
		int currentFibNum = 1;
		int index = currentFibNum - 1;
		while(currentFibNum <= fibNum) {
			if(currentFibNum == 1){
				fibSequence[index] = currentFibNum;
			}
			else if(currentFibNum == 2) {
				fibSequence[index] = index;
			}
			else if(currentFibNum <= fibNum){
				fibSequence[index] = fibSequence[index - 1] + fibSequence[index - 2];
			}
			currentFibNum++;
			index++;
		}
		return fibSequence;
	}
	
}