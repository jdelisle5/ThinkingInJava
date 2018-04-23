/*
switch(integral-selector){
	case integral-value1 : statement: break;
	case integral-value2 : statement: break;
	case integral-value3 : statement: break;
	//...
	default: statement
}
*/

//: control/VowelsAndConsonants{
// Demonstrates the switch statement.
//Notices cases can be stacked on top of eachother
//to provide muliple matches for a piecs of code.
import java.util.*;
import static net.mindview.util.Print.*;

public class VowelsAndConsonants{
	public static void main(String[] args){
		Random rand = new Random(47);
		for (int i = 0; i < 100; i++){
			int c = rand.nextInt(26) + 'a';
			printnb((char)c + ". " + c + ": ");
			switch(c){
				case 'e':
				case 'i':
				case 'a':
				case 'o':
				case 'u': print("vowel");
						  break;
				case 'y':
				case 'w': print("sometimes a vowel");
				default: print("consonant");
			}
		}
	}
}