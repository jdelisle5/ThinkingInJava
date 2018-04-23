//Exercise 8: Creates a switch statement that prints a message for each
// case, and put the switch statement inside a for loop that tries each
// case. Put a break after each case and test it,
// then remove the breaks and see what happens.
import java.util.*;
import static net.mindview.util.Print.*;

public class SwitchFor{
	public static void main(String[] args){
		for(int i = 1; i <= 10; i++){
			switch(i){
				case 1 :
					print("i = " + i );
					break;
				case 2 :
					print("i = " + i );
					break;
				case 3 : 
					print("i = " + i );
					break;
				case 4 :
				case 5 :
				case 6 :
					print("4 >= i <=6");
					break;
				case 7 :  //cannot do i > 6 because it is comparing it to an int.
				case 8 :
				case 9 :
				case 10:
					print ("i > 6");
					break;
			}
		}
	}
}