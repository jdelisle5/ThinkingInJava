//: control/IfElse.java
import static net.mindview.util.Print.*;

public class IfElse{
	static int results = 0;
	static void test(int testval, int target){
		if(testval > target){
			results = +1;
		else if(testval < target)
			results = -1;
		else results = 0; //Match
		}
	}
}