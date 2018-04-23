//: control/BreakAndContinue.java
// Demonstrates break and continue keywords.
// Break "Quits the loop without executing"
// continue stops the execution of the current iteration
import static net.mindview.util.Range.*;
import static net.mindview.util.Print.*;

public class BreakAndContinue {
	public static void main(String[] args){
		for(int i = 0; i < 100; i++){
			if(i == 74) break;
			if(i % 9 != 0) continue;
			System.out.print(i + " ");
		}
		System.out.println();
		
		//Using foreach:
		for(int i : range(100)){
			if(i == 74) break;
			if( i % 9 != 0) continue;
			System.out.print(i + " ");
		}
		
		System.out.println();
		int i = 0;
		//An "Infinite loop":
		while(true){
			i++;
			int j = i * 27;
			if(j == 1269) break; //Out of loop
			if(i % 10 != 0) continue; //Top of loop
			System.out.print(i + " ");
		}
	}
}
