//Goto, Breaks, Continue, and lables
//Break and Conttinue will jump out or
//move onto the next interations.
//Except when there is a label.
//They ll interupt up to where the 
//label exist.

//: Control/LabelFor.java
// For Loop with "labeled break" and "labeled continue"

import static net.mindview.util.Print.*;

public class Labelledfor{
	public static void main(String[] args){
		int i = 0; //Never realized you could set a variable outside a for loop like this.
		outer: //can't have a statement here.
		
		for(; true ;){
			//infinite loop
			inner:
			for(; i < 10; i++){
				print("i = " + i);
				if( i == 2){
					print("continue");
					continue;
				}
				
				if(i == 3){
					print("break");
					i++; //Otherwise i never ges incremented.
					break;
				}
				
				if(i == 7){
					print("continue outer");
					i++;
					continue outer;
				}
				
				if (i == 8){
					print("break outer");
					break outer; //actually stated the label.
				}
				
				for(int k = 0; k < 5; k++){
					if(k ==3){
						print("continue inner");
						continue inner;
					}
				}
			}//inner
		}//outer
	}//Ends Main
}//Ends Class