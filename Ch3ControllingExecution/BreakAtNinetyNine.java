//Exercise 7: Modify exercise 1 so that the program exits by using
//the break keyword at value 99. Try using return instead.

public class BreakAtNinetyNine{
	public static void main(String[] args){
		int i = 1;
		while(i < 100){
			System.out.print(i + " ");
			if(i == 99) break;
			i++;
		}
	}
}//Break exits the loop, return exits the method.